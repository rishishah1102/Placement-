package Recursions;

public class InviteParty {
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }

        return callGuest(n - 1) + (n - 1) * callGuest(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(callGuest(n));
    }
}
