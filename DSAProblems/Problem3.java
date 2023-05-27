// Union of two arrays and Intersection of two arrays.

package DSAProblems;

import java.util.HashSet;
import java.util.Iterator;

public class Problem3 {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set = new HashSet<>();

        // Union of two arrays
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        Iterator<Integer> it = set.iterator();
        System.out.println("Union of two arrays: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Intersection of two arrays
        set.clear();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        System.out.println("Intersection of two arrays: ");
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                System.out.print(arr2[j] + " ");
                set.remove(arr2[j]);
            }
        }
    }
}
