package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem17 {
    public static List<String> list = new ArrayList<>();

    public static void keyPadCombo(String digits, int index, HashMap<Character, String> map, String result) {
        if (digits.length() == index) {
            list.add(result);
            return;
        }

        String temp = map.get(digits.charAt(index));

        for (int i = 0; i < temp.length(); i++) {
            keyPadCombo(digits, index + 1, map, result + temp.charAt(i));
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        keyPadCombo(digits, 0, map, "");

        return list;
    }

    public static void main(String[] args) {
        String digits = "7892";

        System.out.println(letterCombinations(digits));
    }
}
