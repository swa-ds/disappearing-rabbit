package org.example;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RabbitTest {

    @Test
    void rabbit_disappears() {
        Rabbit bunny = new Rabbit("white", 1);

        Set<Rabbit> hat = new HashSet<>();

        // put the bunny in the hat
        hat.add(bunny);

        // check the hat - bunny is there
        assertTrue(hat.contains(bunny));

        // bunny has birthday and becomes 1 year older
        bunny.happyBirthday();

        // bunny has disappeared! where has it gone?
        assertFalse(hat.contains(bunny));

        // this line just exists so that we can set a breakpoint to peek into the hat
        assertTrue(true);
    }

}
