package StringProblems;

public class KeyPadCombo {
    public static void keypadCombo(String str, String arr[], int index, String result) {
        if (index == str.length()) {
            System.out.println(result);
            return;
        }
        int current = str.charAt(index) - '0';
        for (int i = 0; i < arr[current].length(); i++) {
            keypadCombo(str, arr, index + 1, result + arr[current].charAt(i));
        }
    }

    public static void main(String[] args) {
        // Print keypad combination
        String str2 = "23";
        String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        keypadCombo(str2, keypad, 0, "");
    }
}
