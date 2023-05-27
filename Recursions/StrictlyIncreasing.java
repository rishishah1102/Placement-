package Recursions;

public class StrictlyIncreasing {

    public static boolean checkIfIncreasing(int arr[], int index3) {
        if (index3 == arr.length - 1) {
            return true;
        }
        if (arr[index3 + 1] < arr[index3]) {
            return false;
        }
        return checkIfIncreasing(arr, index3 + 1);
    }

    public static void main(String[] args) {
        // Check if an array is sorted (strictly increasing). - O(n)
        int arr1[] = { 1, 2, 3, 4, 5 };
        // int arr2[] = { 1, 6, 3, 4, 5 };
        if (checkIfIncreasing(arr1, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }
    }
}
