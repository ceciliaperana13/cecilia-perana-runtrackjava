package jour4.exercice1;
//herite de la class Thread pour pouvoir créer un thread
public class MyThread extends Thread {
 
    public void run() {
        //code qui sera exécuté dans le thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread en cours d'exécution : " + i);
        }
    }
    
}
