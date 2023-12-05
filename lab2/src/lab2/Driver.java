package lab2;
import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a sentence: ");
     String userInput = scanner.nextLine();

     WordProcessor wordProcessor = new WordProcessor(userInput);

     // Testing methods with user input
     System.out.println("Word count: " + wordProcessor.countWords(userInput));
     System.out.println("Letter count: " + wordProcessor.countLetters(userInput));
     System.out.println("Sentence length: " + wordProcessor.getLength(userInput));

     // Changing datatype to Counter
     Counter counter = wordProcessor;
   
     // Testing methods with null string
     System.out.println("Word count with null: " + counter.countWords(null));
     System.out.println("Letter count with null: " + counter.countLetters(null));
     System.out.println("Sentence length with null: " + counter.getLength(null));
 }
}
