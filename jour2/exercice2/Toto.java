package jour2.exercice2;

class Toto {
    int Toto =0;
    Toto(){
        Toto=Toto+1;
    } 
    public static void main(String[] args){
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        Toto t3 = new Toto();
        System.out.println(t1.Toto);
        System.out.println(t2.Toto);
        System.out.println(t3.Toto);
    }
}
//Pourquoi ?
//main est une méthode static, ce qui signifie qu'elle appartient à la classe, pas à un objet.
//Or toto est un attribut d'instance → il appartient à un objet précis (t1 ou t2), pas à la classe.
// Donc, lorsque main essaie d'accéder à toto, il ne sait pas à quel objet se référer (t1 ou t2), ce qui provoque une erreur de compilation.
//t1, t2 et t3 sont des objets différents, chacun avec sa propre copie de l'attribut toto. Lorsque le constructeur est appelé pour chaque objet, il incrémente la valeur de toto pour cet objet spécifique. Par conséquent, t1.Toto, t2.Toto et t3.Toto auront tous la valeur 1, car ils ont été initialisés séparément.