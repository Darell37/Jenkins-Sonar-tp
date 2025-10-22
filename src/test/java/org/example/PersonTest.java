package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetDisplayName() {
        /** le «arrange» crée
         *  un objet Personne qui sera testé:
         */
        Person person = new Person("Josh", "Hayden");
        // act
        String displayName = person.getDisplayName();
        // assert
        assertEquals("Josh, Hayden", displayName);
    }
}
