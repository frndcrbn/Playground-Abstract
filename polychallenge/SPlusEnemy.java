package polychallenge;

public class SPlusEnemy extends SPlusplusEnemy{

    SPlusEnemy(String name, String type, String rank, int health, int damage){
        super(name,type, rank, health, damage);
    }

    void attack(){
        System.out.println(name + " uses [unknown] (" + type + ") attack.");
    }
}
