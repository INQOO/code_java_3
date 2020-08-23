package edu.inqoo.fly;

import org.junit.jupiter.api.Test;

public class TestFly {

    @Test
    public void testFly() {
//        FlyingAnimal bat = new Bat();
//        bat.fly();
//
//        FlyingAnimal bird = new Bird();
//        bird.fly();

        FlyingAnimal[] flyingAnimals = new FlyingAnimal[6];


        flyingAnimals[0] = new Bat();
        flyingAnimals[1] = new Bat();
        flyingAnimals[2] = new Bat();
        flyingAnimals[3] = new Bird();
        flyingAnimals[4] = new Bird();
        flyingAnimals[5] = new Bird();

        for (int i = 0; i < flyingAnimals.length; i++) {
            FlyingAnimalCatcher.catchFlyingAnimal(flyingAnimals[i]);

        }

    }

}
