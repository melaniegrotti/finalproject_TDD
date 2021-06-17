package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetFeederTest {

    @Test
    public void ensureAddPetoListWorks(){
        //Arrange
        ArrayList<Pet> testPetList = new ArrayList<Pet>();
        Pet testPet = new Pet("Birdy", "Eagle", "3.March 2018", "Mice");
        int expectedResult = 1;

        //Act
        PetFeeder myPets = new PetFeeder();
        PetFeeder.addPetToList(testPet, testPetList);
        int result = testPetList.size();

        //Assert
        assertEquals(expectedResult, result);
    }

}
