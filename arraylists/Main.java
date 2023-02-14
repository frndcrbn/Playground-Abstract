package arraylists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ian");
        names.add("Nad");
        names.add("David");
        names.add("Jinx");
        names.set(0,"Nyx");

        for (String name : names){
            System.out.println(name);
        }
    }
}
