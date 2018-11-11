package example.animals;


import example.DogsFamily;
import example.Pet;

public class Dog extends DogsFamily implements Pet {


    @Override
    public void makeNoise() {
        System.out.println("HauHauHau");
    }

}
