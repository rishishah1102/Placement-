// Given a integer array of size n. Find all elements that appear more than floor(n/3) times. (|_ n/3 _|)

package DSAProblems;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 2, 3, 9, 1, 1, 9, 1 };

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > n / 3) {
                System.out.println(e.getKey());
            }
        }

    }
}
