package example.animals;


import example.CatsFamily;

public class Tiger extends CatsFamily {

    @Override
    public void makeNoise() {
        System.out.println("Roarrrrrr");
    }

    public void isCanMeow() {
        System.out.println("No ! This animal can't meow !");
    }
}
