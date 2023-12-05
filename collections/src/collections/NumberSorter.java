package collections;
import java.util.Stack;

class NumberSorter {
    void sort(int[] numbers) {
        // The source stack, from which the numbers are popped
        Stack<Integer> srcStack = new Stack<>();
        // The dest stack, to which the numbers are pushed
        Stack<Integer> destStack = new Stack<>();
        
        // Add the initial array of numbers to the source stack.
        for (int number : numbers)
            srcStack.push(number);

        // Implement the sorting algorithm using two stacks
        while (!srcStack.isEmpty()) {
            int currentNumber = srcStack.pop();

            while (!destStack.isEmpty() && destStack.peek() < currentNumber) {
                srcStack.push(destStack.pop());
            }

            destStack.push(currentNumber);
        }

        // Copy the sorted numbers back to the source stack
        while (!destStack.isEmpty()) {
            srcStack.push(destStack.pop());
        }

        // Print the sorted numbers
        System.out.println("Sorted Numbers: " + srcStack);
    }
    
}

