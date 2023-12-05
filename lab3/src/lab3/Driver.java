package lab3;

import java.util.Random;

/**
 * The Driver class demonstrates the usage of the Stats class to compute statistics
 * on a collection of randomly generated numbers.
 */
public class Driver {

    /**
     * The main method creates an instance of the Stats class, generates random numbers,
     * and prints various statistics.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Constants
        final int VALUES = 10;

        // Create an instance of the Stats class
        Stats stats = new Stats(VALUES);

        // Generate random numbers and add them to the Stats object
        Random random = new Random();
        for (int i = 0; i < VALUES; i++) {
            stats.addValue(random.nextInt(100));
        }

        // Displaying the statistics
        System.out.println("Numbers stored : ");
        System.out.println(stats);
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getB());
        System.out.println("Maximum value = " + stats.getA());
    }

}
