package example.animals;


import example.DogsFamily;
import example.Pet;

public class Dog extends DogsFamily implements Pet {

    @Override
    public void makeNoise() {
        System.out.println("HauHauHau");
    }

    public void favoritePlaceInHome() {
        System.out.println("Favorite place in home: garden");
    }

    public boolean isLivesInGroup() {
        return false;
    }
}
