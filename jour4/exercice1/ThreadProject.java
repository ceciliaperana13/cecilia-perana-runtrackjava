package jour4.exercice1;

//methode main instancier MyThread pouyr lancer 'execution du thread'
public class ThreadProject {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
    
}
