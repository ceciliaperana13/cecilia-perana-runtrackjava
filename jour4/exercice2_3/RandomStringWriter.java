package jour4.exercice2_3;
import java.util.Scanner;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class RandomStringWriter {

    // Caractères utilisés pour la génération aléatoire
    private static final String CHARACTERS =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // Verrou pour synchroniser l'accès au fichier entre les deux threads
    private static final Object LOCK = new Object();

    
     // Génère une chaîne aléatoire de longueur donnée.
     
    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    
     //Thread d'écriture : écrit une portion de la chaîne dans le fichier.
     
    static class WriterThread extends Thread {
        private final String portion;
        private final FileOutputStream fos;
        private final boolean isFirstHalf;
        private final CountDownLatch latch;

        public WriterThread(String portion, FileOutputStream fos,
                            boolean isFirstHalf, CountDownLatch latch) {
            this.portion    = portion;
            this.fos        = fos;
            this.isFirstHalf = isFirstHalf;
            this.latch      = latch;
        }

        @Override
        public void run() {
            try {
                byte[] data = portion.getBytes();
                synchronized (LOCK) {
                    // La première moitié écrit en premier, puis la seconde
                    if (!isFirstHalf) {
                        LOCK.wait(); // attend que la 1ère moitié termine
                    }
                    fos.write(data);
                    fos.flush();
                    System.out.println(Thread.currentThread().getName()
                        + " a écrit " + data.length + " octets.");
                    if (isFirstHalf) {
                        LOCK.notifyAll(); // libère la 2ème moitié
                    }
                }
            } catch (IOException | InterruptedException e) {
                System.err.println("Erreur dans " + Thread.currentThread().getName()
                    + " : " + e.getMessage());
                Thread.currentThread().interrupt();
            } finally {
                latch.countDown();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        if (length < 2) {
            System.out.println("La longueur doit être au moins 2.");
            return;
        }

        //    Démarrage 
        long startTime = System.nanoTime();

        // 1. Génération de la chaîne aléatoire
        String randomString = generateRandomString(length);
        System.out.println("\nChaîne générée (" + length + " caractères) :");
        System.out.println(randomString);

        // 2. Découpage en deux moitiés
        int mid = length / 2;
        String firstHalf  = randomString.substring(0, mid);
        String secondHalf = randomString.substring(mid);

        System.out.println("\nPremière moitié  : " + firstHalf);
        System.out.println("Deuxième moitié  : " + secondHalf);

        // 3. Écriture dans output.txt via deux threads
        CountDownLatch latch = new CountDownLatch(2);

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {

            WriterThread t1 = new WriterThread(firstHalf,  fos, true,  latch);
            WriterThread t2 = new WriterThread(secondHalf, fos, false, latch);

            t1.setName("Thread-1ère-moitié");
            t2.setName("Thread-2ème-moitié");

            System.out.println("\nDémarrage des threads d'écriture…");
            t1.start();
            t2.start();

            // Attendre la fin des deux threads
            latch.await();
        }

        // ── Fin du chronomètre 
        long endTime  = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("\nÉcriture terminée dans « output.txt ».");
        System.out.printf("Temps d'exécution global : %d ns  (%.3f ms)%n",
            duration, duration / 1_000_000.0);

        // 4. Vérification du fichier produit
        System.out.println("\nContenu de output.txt :");
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        }
    }
}

//Conclusion à retenir : le multi-threading ne rend pas tout plus rapide. Il n'est bénéfique que si les tâches sont indépendantes, longues, et CPU-bound. Pour des I/O simples sur un seul fichier, il ajoute uniquement de la complexité et de la latence.