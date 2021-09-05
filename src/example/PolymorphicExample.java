package example;

import example.Vet;

public class PolymorphicExample {
    public static void main(String[] args) {
        Vet vet = new Vet();

        Dog dog = new Dog();

        Hippo hippo = new Hippo();

        vet.giveShot(dog);

        vet.giveShot(hippo);
    }
}
