package Annotations;

import static org.junit.jupiter.api.Assertions.*;

import Annotations.useoverride.Dog;
import org.junit.jupiter.api.Test;

class OverrideExampleTest {

    @Test
    void testMakeSound() {
        Dog dog = new Dog();

        assertTrue( dog.makeSound().contains("Dog barks"));
    }
}
