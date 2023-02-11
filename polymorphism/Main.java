package polymorphism;

public class Main {
    public static void main(String[] args) {
        Enemy we = new WeakEnemy();
        Enemy se = new StrongEnemy();

        we.showStats();
        we.dialog();

        se.showStats();
        se.dialog();
    }
}
