package org.example;

/**
 * Représente une personne avec un nom et un âge
 */
public class Person {
    private String firstName;
    private String lastName;
    /**
     * Constructeur pour créer une personne
     * @param firstName le prenom de la personne
     * @param lastName le nom de la personne
     */

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Retourne fullname de la personne
     * @return le nom
     */
    String getDisplayName() {
        return firstName + ", " + lastName;
    }
}
