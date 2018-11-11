package example.animals;


import example.CatsFamily;
import example.Pet;

public class Cat extends CatsFamily implements Pet {

    @Override
    public void makeNoise() {
        System.out.println("Miauuuuu");
    }

}
