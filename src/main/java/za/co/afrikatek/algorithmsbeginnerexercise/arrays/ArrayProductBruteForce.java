package za.co.afrikatek.algorithmsbeginnerexercise.arrays;

import java.util.Arrays;

/**
 * Solution 1: Brute force
 *
 * The brute force approach to solving this problem involves using two nested loops. Initially, the outer loop traverses each element in the array. For each element, the inner loop calculates the product of all subsequent elements.
 *
 * In this approach, we maintain a variable left , which represents the cumulative product of all elements to the left of the current element being considered. This left variable is crucial because it also helps us compute the product of all elements to the right of the current index.
 *
 * By multiplying the product of subsequent elements with the cumulative product of elements to the left, we ensure that every element’s product is accurately calculated and updated in the result array. This iterative process covers all elements in the array, ensuring that the product of every element in the original array, excluding the current element itself, is correctly computed.
 */

public class ArrayProductBruteForce {
    public static int[] findProduct(int[] arr) {
        int[] product = new int[arr.length];
        int left = 1;

        // Go through the elements in the array
        for (int i = 0; i < arr.length; i++) {
            int currentProduct = 1;

            // Go through the array and find the product of elements to the right of the current element
            for (int j = i + 1; j < arr.length; j++) {
                currentProduct *= arr[j];
            }

            // append the product to the solution array
            product[i] = currentProduct * left;

            // update the left product
            left *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {1,2,3,4},
                {5, -3, 1, 2},
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {-1, -2, -4}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.printf("%d.\t Array: %s%n", i + 1, Arrays.toString(inputs[i]));
            System.out.printf("%n\t List of products: %s%n", Arrays.toString(findProduct(inputs[i])));
        }
    }
}
