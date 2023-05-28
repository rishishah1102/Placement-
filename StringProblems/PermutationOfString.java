package StringProblems;

public class PermutationOfString {

    public static void permutation(String str, String result) {
        // Here we will print the result when the string length will be 0 because there will be nothing in str
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        // Loop is for filling one element.
        for (int i = 0; i < str.length(); i++) {
            // Once selected one element we have to extract the remaining element so extracted that element.
            String newStr = str.substring(0, i) + str.substring(i + 1);
            
            // Appending the selected element and generating possible permutations.
            permutation(newStr, result + str.charAt(i));
        }
    }

    public static void main(String[] args) {

        // Print all permutation of string
        String str3 = "abc";
        permutation(str3, "");
    }
}
