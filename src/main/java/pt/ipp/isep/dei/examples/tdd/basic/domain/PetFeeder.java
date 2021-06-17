package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.util.ArrayList;

public class PetFeeder {

    public ArrayList<Pet> myPets = new ArrayList<>();

    public static void addPetToList(Pet pet, ArrayList<Pet> myPets) {
        myPets.add(pet);
    }
}
