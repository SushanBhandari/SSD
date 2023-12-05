package lab6;

/**
 * The Driver class for testing the EmailStore class.
 */
public class Driver {
    public static void main(String[] args) {
        // Create an instance of EmailStore
        EmailStore emailStore = new EmailStore();

        // Test adding unique email addresses
        System.out.println("Adding emails:");
        System.out.println("Added: " + emailStore.addEmail("john@example.com"));
        System.out.println("Added: " + emailStore.addEmail("alice@example.com"));
        System.out.println("Added: " + emailStore.addEmail("bob@example.com"));
        System.out.println();

        // Test adding duplicate email addresses
        System.out.println("Adding duplicate emails:");
        System.out.println("Added: " + emailStore.addEmail("john@example.com")); // Should return false
        System.out.println("Added: " + emailStore.addEmail("alice@example.com")); // Should return false
        System.out.println();

        // Test checking if an email exists
        System.out.println("Checking emails:");
        System.out.println("Exists: " + emailStore.hasEmail("john@example.com")); // Should return true
        System.out.println("Exists: " + emailStore.hasEmail("mary@example.com")); // Should return false
        System.out.println();

        // Display all stored email addresses
        System.out.println("All emails in the store:");
        emailStore.displayEmails();
    
        // Create an instance of WordCounter
        WordCounter wordCounter = new WordCounter();

        // Test adding words from a sentence
        wordCounter.addSentence("This sentence has the word has in it twice");
        
        // Display word occurrences
        wordCounter.outputResults();
    }
}
