package example.animals;


import example.Animal;

public class Horse extends Animal {

    public void galloping() {
        System.out.println("horse starts galloping");
    }

    @Override
    public void makeNoise() {
        System.out.println("icha icha icha");
    }
}
