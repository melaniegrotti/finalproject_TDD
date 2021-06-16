package pt.ipp.isep.dei.examples.tdd.basic.domain;

public class Pet {
private String name;
private String breed;
private String Birthday;
private String Diet;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getDiet() {
        return Diet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public void setDiet(String diet) {
        Diet = diet;
    }
}
