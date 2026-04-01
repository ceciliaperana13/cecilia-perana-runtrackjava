package jour7.exercice3;


class polymorph { public static void main(String[] args)
    { Forme [] Tabforme =
        { 
            new Cercle("rouge"),
           
            new Triangle("jaune")
        };

    Collect Forme = new Collect(10);
    for (int i = 0; i < Tabforme.length; i++)
        Forme.add(new Forme (Tabforme[i]));
    Forme.dessiner();

    }
class Forme {
        protected String couleur;

        public Forme(String couleur){
            this.couleur = couleur ;

        }
    }
class Cercle extends Forme {
        public Cercle(String couleur) {
            super(couleur);
        }

        public void dessiner() {
            System.out.println("Cercle de couleur " + couleur);
        }
    }
class Triangle extends Forme {
        public Triangle(String couleur) {
            super(couleur);
        }

        public void dessiner() {
            System.out.println("Triangle de couleur " + couleur);
        }
    }
}    
    




