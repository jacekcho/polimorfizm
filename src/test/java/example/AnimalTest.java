package example;

import example.animals.Cat;
import example.animals.Dog;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void shouldCheckObjectCat() {
        Cat cat = new Cat();

        cat.findMouse(); // Metoda unikalna klasy "Cat"

        cat.favoritePlaceInHome(); // Metoda zaimplementowana z interfejsu "Pet"

        cat.isCanMeow(); // Metoda dziedziczona z klasy abstrakcyjnej "CatsFamily"
        cat.showClaws(); // Metoda zaimplementowana z klasy abstrakcyjnej "CatsFamily"

        cat.makeNoise(); // Metoda zaimplementowana z klasy abstrakcyjnej "Animal"
        cat.eat();  // Metoda dziedziczona z klasy "Animal"
        cat.sleep();  // Metoda dziedziczona z klasy "Animal"
    }

    @Test
    public void shouldCreateObjectCatByInterface() {

        Pet petDog = new Dog();  // Tworzymy obiekt wywodzacy sie z interfejsu (jest to mozliwe poniewaz klasa Dog implementuje interfejs Pet)
        petDog.favoritePlaceInHome();  // to jedyna metoda tego inrfejsu i tylko ona jest dostepna dla obiektu (mamy pewnosc ,ze istnieje poniewaz interfejs wymusza jej stworzenie)

        Dog dog = (Dog) petDog; // Jesli chcemy dostac sie do innych metod klasy "Dog" niezbedne jest wykonanie jego rzutowania.
        dog.favoritePlaceInHome();

        dog.growl();
        dog.isLivesInGroup();

        dog.makeNoise();
        dog.eat();
        dog.sleep();
    }

}