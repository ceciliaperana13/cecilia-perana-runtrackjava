package jour7.exercice0;

class AbstractFinal{
    public static void main (String[] args){
        A[] tab =new A[3];
        tab[0] = new A(); //A est abstracte cela commandera une erreur
        tab[1] = new B();
        tab[2] = new C();
        tab[1].b = 2;
        ((C)tab[2]).c=3;

    }
}
abstract class A{
    int a;
}
class B extends A{
    int b;
}
class C extends A{
    final double c = 1;
}
abstract class D extends A{
    double d;
    int operation (int a){
        return (a*2);
    }
    abstract int calcul(int b){

    }
    abstract int machin ();
}    

// eurreur ((C)tab[2]).c = 3 c est déclaré final avec la valeur 1, il est donc impossible de le modifier
// eurreur 3 méthode abstract avec un corps Une méthode abstract ne doit pas avoir de corps {}, elle se termine par ;