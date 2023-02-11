package polymorphism;

public class WeakEnemy extends Enemy{

    WeakEnemy(){
        name = "JoJo";
        hp = 1000;
    }

    void dialog(){
        System.out.println("I am Weak Enemy.");
    }
}
