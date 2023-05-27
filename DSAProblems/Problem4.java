package DSAProblems;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void printPath(HashMap<String, String> map) {
        try {
            for (Map.Entry<String, String> m1 : map.entrySet()) {
                if (!map.containsValue(m1.getKey())) {
                    if (map.size() == 1) {
                        System.out.println(m1.getKey() + " -> " + m1.getValue());
                        return;
                    } else {
                        System.out.print(m1.getKey() + " -> ");
                        map.remove(m1.getKey());
                        printPath(map);
                    }
                }
            }
        } catch (Exception e) {
            return;
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        printPath(map);
    }
}
