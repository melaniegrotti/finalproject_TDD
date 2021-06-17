package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PetFeeder {

    public ArrayList<Pet> myPets = new ArrayList<>();

    public HashMap<String, Pet> petHash = new HashMap<String, Pet>();

    public static void addPetToList(Pet pet, ArrayList<Pet> myPets) {
        myPets.add(pet);
    }

    public boolean removeFeedingTime(HashMap<String, Pet> petHash, Pet pet) {
        boolean specifiedTime = false; //if there is a time specified the pet should be fed
        String feedingTime;

        for (Iterator<Map.Entry<String, Pet>> iterator = petHash.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Pet> pair = iterator.next();
            if (pet == pair.getValue()) {
                feedingTime = pair.getKey();
                petHash.remove(feedingTime, pet);
                petHash.put("unspecified", pet);
                specifiedTime= true;
                return specifiedTime;
            }

        } return false;
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

    /*
    public boolean equals(Pet pet) {
        if (pet == null) return false;
        if (pet == this) return true;
        if (!(pet instanceof myPets)) return false;
        myPets alreadyExists = (myPets) pet;
        return alreadyExists == this.myPets;
    }

     */
    /*
    @Override
    public boolean equals(Pet pet) {
        if (pet instanceof myPets) {
            myPets existingPet = (myPets) pet;
            return pet.i == this.i;
        }
        return false;
    }

     */
}

