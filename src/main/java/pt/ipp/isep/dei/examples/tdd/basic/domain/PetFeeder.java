package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class PetFeeder {

    public ArrayList<Pet> myPets = new ArrayList<>();

    public static void addPetToList(Pet pet, ArrayList<Pet> myPets) {
        myPets.add(pet);
    }

    /*
    public boolean findingDuplicatePets(ArrayList<Pet> myPets, Pet pet) {
        //TODO: Figure out how to compare for Objects in Arrays
        if (myPets.contains(pet)) {
            System.out.println("Pet already exists" + pet);
            return true;
        } else myPets.add(pet);
        return false;
    }

     */
}
