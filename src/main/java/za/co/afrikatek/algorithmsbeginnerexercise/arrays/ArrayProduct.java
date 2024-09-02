package za.co.afrikatek.algorithmsbeginnerexercise.arrays;

public class ArrayProduct {
    public static int[] findProduct(int[] arr) {
        int n = arr.length;
        int i, left = 1;
        int[] product = new int[n];
        // Product of elements on the left side excluding arr[i]
        for (i = 1; i < n; i++) {
            product[i] = left;
            left *= arr[i];
        }

        // Second pass: Update the product list by calculating products from right to left
        int right = 1;
        for (i = n - 1; i >= 0; i--) {
            product[i] *= right;
            right *= arr[i];
        }

        return product;
    }
}
