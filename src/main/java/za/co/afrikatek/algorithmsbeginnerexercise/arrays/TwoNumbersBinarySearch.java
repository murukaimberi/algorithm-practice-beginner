package za.co.afrikatek.algorithmsbeginnerexercise.arrays;

public class TwoNumbersBinarySearch {
    public static int binarySearch(int[] a, int item) {
        int first = 0;
        int last = a.length - 1;

        boolean found = false;
        int index = -1;

        // Perform binary search until the item is found or the pointers meet
        while (first <= last && !found) {
            int mid = (first + last) / 2;

            // Check if the middle element is the item
            if(a[mid] == item) {
                // if found, update the index and set found to true
                index = mid;
                found = true;
            } else {
                //If the item is smaller than the middle element, update the last pointer
                if (item < a[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }

        if (found) {
            return index;
        } else {
            return -1;
        }
    }
}
