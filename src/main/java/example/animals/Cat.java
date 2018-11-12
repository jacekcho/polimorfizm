package example.animals;

import example.CatsFamily;
import example.Pet;

public class Cat extends CatsFamily implements Pet {

    /*
    To unikalna metoda klasy Cat
    */
    public void findMouse() {
        System.out.println("cat is looking for a mouse");
    }

    /*
    Ta metoda musiala zostac stworzona poniewaz dziedziczymy klase "CatsFamily"
    która to dziedziczy klase Animal (w klasie Animal znajduje sie metoda abstracyjna "makeNoise"
     */
    @Override
    public void makeNoise() {
        System.out.println("Miauuuuu");
    }

    /*
    Ta metoda musiala zostac stworzona poniewaz dziedziczymy klase "CatsFamily"
   (w klasie CatsFamily znajduje sie metoda abstracyjna "isCanMeow"
    */
    public void isCanMeow() {
        System.out.println("Yes! this animal can meow !");
    }

    /*
    Ta metoda musiala zostac stworzona poniewaz implementujemy interfejs "Pet"
    (w interfejsie Pet CatsFamily znajduje sie metoda abstracyjna "favoritePlaceInHome"
    */
    public void favoritePlaceInHome() {
        System.out.println("favorite place in home: Bed");
    }

}
