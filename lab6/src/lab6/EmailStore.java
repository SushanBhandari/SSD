package lab6;

import java.util.HashSet;
import java.util.Set;

/**
 * The EmailStore class represents a store for unique email addresses.
 */
public class EmailStore {
    private Set<String> emailAddresses;

    /**
     * Constructs an EmailStore with an empty set of email addresses.
     */
    public EmailStore() {
        emailAddresses = new HashSet<>();
    }

    /**
     * Adds an email address to the store.
     *
     * @param email The email address to be added.
     * @return true if the email was added, false if it's a duplicate.
     */
    public boolean addEmail(String email) {
        return emailAddresses.add(email);
    }

    /**
     * Checks whether the given email address is already stored.
     *
     * @param email The email address to check.
     * @return true if the email address is already stored, false otherwise.
     */
    public boolean hasEmail(String email) {
        return emailAddresses.contains(email);
    }

    /**
     * Displays all stored email addresses to the console.
     */
    public void displayEmails() {
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }
}
