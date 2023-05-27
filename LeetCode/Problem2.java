package LeetCode;

import java.util.LinkedList;

public class Problem2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        LinkedList<Integer> ll3 = new LinkedList<>();
        
        ll1.add(9);
        ll1.add(9);
        ll1.add(9);
        ll1.add(9);
        ll1.add(9);
        ll1.add(9);
        ll1.add(9);

        ll2.add(9);
        ll2.add(9);
        ll2.add(9);
        ll2.add(9);

        int carry = 0;
        int i = 0;

        for (; i < ll1.size(); i++) {

            if (i >= ll2.size()) {
                ll3.add((ll1.get(i) + carry)%10);
                carry = (ll1.get(i) + carry)/10;
            }
            else {
                ll3.add((ll1.get(i) + ll2.get(i) + carry)%10);
                carry = (ll1.get(i) + ll2.get(i) + carry)/10;
            }
        }

        if (ll2.size() > ll1.size()) {
            while (i < ll2.size()) {
                ll3.add((ll2.get(i) + carry)%10);
                carry = (ll2.get(i) + carry)/10;
                i++;
            }
        }

        if (carry > 0) {
            ll3.add(carry);
        }

        System.out.println(ll3);
    }
}
