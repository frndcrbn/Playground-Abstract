package abstraction;

public class Main {

    public static void main(String[] args) {

        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        d.setName("Doggy");
        d.showName();

        c.makeSound();
        c.setName("Catty");
        c.showName();
    }

}
