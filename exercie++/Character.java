

public abstract class Character {
   
    protected String name;
    protected int health;
    protected int mana;
    //contructeur
    public Character(String name, int health, int attack,int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attack=attack;
    }
    //methode abstraite pour l'attaque
    public abstract void attack(Character target);
    //methode  takeDamge pour recevoir des dégats
    public void TakeDamage(int damage){
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0; // le personnage ne peut pas avoir de points de vie négatifs
        }
        System.out .println(name + "prend" +damage + "points de dégats. Il lui reste" + health + "points de vie.");
    }
    // methode is ALIVE pour vérifier si le personnage est encore en vie
    public boolean isAlive() {
        return this.health > 0;
    }
    public String getname() {
        return name;
    }
    public int gethealth() {
        return health;
    }
    public int getmana()
    {
        return mana;}
        
    public int getattack(){
        return attack;
    }    

}
