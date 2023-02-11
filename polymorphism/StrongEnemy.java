package polymorphism;

public class StrongEnemy extends Enemy{

    StrongEnemy(){
        name = "Mojo";
        hp = 2000;
    }

    void dialog(){
        System.out.println("I am Strong Enemy.");
    }
}
