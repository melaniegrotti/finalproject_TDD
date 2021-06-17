package pt.ipp.isep.dei.examples.tdd.basic.domain;

public class Pet {
    //values
private String name;
private String breed;
private String birthday;
private String diet;

      //constructor
    public Pet (String name, String diet){
        this.name = name;
        breed = "";
        birthday = "";
        this.diet = diet;
    }

    public Pet (String name, String breed, String birthday,  String diet){
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
        this.diet = diet;
    }


       //getters & setters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getDiet() {
        return diet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBirthday(String birthday) {
        birthday = birthday;
    }

    public void setDiet(String diet) {
        diet = diet;
    }

    //

}
