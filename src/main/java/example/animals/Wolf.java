package example.animals;


import example.DogsFamily;

public class Wolf extends DogsFamily {

    @Override
    public void makeNoise() {
        System.out.println("Auuuuuuuuuuuu");
    }

    public boolean isLivesInGroup() {
        return true;
    }
}
