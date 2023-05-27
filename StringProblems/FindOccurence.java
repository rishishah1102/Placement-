package StringProblems;

public class FindOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str2, int index2, char occur) {
        if (index2 == str2.length()) {
            System.out.println("The first occurence of " + occur + " is " + first);
            System.out.println("The last occurence of " + occur + " is " + last);
            return;
        }
        if (str2.charAt(index2) == occur) {
            if (first == -1) {
                first = index2;
            } else {
                last = index2;
            }
        }
        findOccurence(str2, index2 + 1, occur);
    }

    public static void main(String[] args) {
        // find the first and the last occurences of the character in a string
        String str2 = "djhvjznjkvnasjkl";
        findOccurence(str2, 0, 'j');
    }
}
