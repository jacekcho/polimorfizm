package example;


public abstract class Animal {

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public abstract void makeNoise();

}
