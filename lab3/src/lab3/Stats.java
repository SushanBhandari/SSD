package lab3;

import java.util.Arrays;

/**
 * The Stats class is used for performing statistical operations on an array of integers.
 */
public class Stats {
    int[] numbers; // Array to store values
    int count;    // Count of values added to the array

    /**
     * Constructor to initialize the Stats object with a specified capacity.
     *
     * @param capacity The capacity of the Stats object (maximum number of values it can hold).
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
        count = 0; // Initialize the count to 0
    }

    /**
     * Add a value to the Stats object if there is space in the array.
     *
     * @param value The value to be added.
     */
    public void addValue(int value) {
        if (count < numbers.length) {
            numbers[count] = value;
            count++;
        } else {
            // Handle the case where the array is already full
            System.out.println("The array is already full. Cannot add more values.");
        }
    }

    /**
     * Get the count of values added to the Stats object.
     *
     * @return The count of values added.
     */
    public int getCount() {
        return count;
    }

    /**
     * Get the maximum value in the array.
     *
     * @return The maximum value.
     * @throws IllegalStateException if there are no values in the array.
     */
    public int getA() {
        if (count == 0) {
            throw new IllegalStateException("No values in the array");
        }
        int max = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }

    /**
     * Get the minimum value in the array.
     *
     * @return The minimum value.
     * @throws IllegalStateException if there are no values in the array.
     */
    public int getB() {
        if (count == 0) {
            throw new IllegalStateException("No values in the array");
        }
        int min = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    /**
     * Get the sum of all values in the array.
     *
     * @return The sum of all values.
     */
    public int getTotal() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Get the average of values in the array.
     *
     * @return The average of the values.
     * @throws IllegalStateException if there are no values in the array.
     */
    public double getAverage() {
        if (count == 0) {
            throw new IllegalStateException("No values in the array");
        }
        int x = 0;
        for (int i = 0; i < count; i++) {
            x += numbers[i];
        }
        double y = x / (double) count;
        return y;
    }

    /**
     * Return a string representation of values in the array up to the count.
     *
     * @return A string representing the values.
     */
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(numbers, count));
    }
}
