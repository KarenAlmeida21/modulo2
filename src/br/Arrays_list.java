package br;

import java.util.List;
import java.util.ArrayList;

public class Arrays_list {
    public static void main(String[] args) {

        List<String> pets = new ArrayList<>();
        pets.add("cachorro");
        pets.add("passarinho");
        pets.add("ratos");
        pets.add("gatos");

        System.out.println(pets.get(2));
        for (String referencia : pets) {
            System.out.println(referencia);

        }
    }
}
