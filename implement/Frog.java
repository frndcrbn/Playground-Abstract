package implement;

public class Frog implements Animal, WaterAnimal{

    public void makeSound(){
        System.out.println("Ribbit!");
    }

    public void swim(){
        System.out.println("Swimming.");
    }
}
