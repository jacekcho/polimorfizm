package example.animals;


import example.CatsFamily;

public class Lion extends CatsFamily {

    @Override
    public void makeNoise() {
        System.out.println("RoarrrrrrRoarrrrrr");
    }

    public boolean isCanMeow() {
        return false;
    }
}
