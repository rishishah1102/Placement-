package LeetCode;

public class Problem12 {
    public static String intToRoman(int num) {
        if (num > 3999 || num < 1) {
            return null;
        }

        String Thousands[] = { "", "M", "MM", "MMM" };
        String Hundreds[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String Tens[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String Ones[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        return Thousands[num / 1000] + Hundreds[(num % 1000) / 100] + Tens[(num % 100) / 10] + Ones[num % 10];
    }

    public static void main(String[] args) {
        int num = 3;

        System.out.println(intToRoman(num));
    }
}
