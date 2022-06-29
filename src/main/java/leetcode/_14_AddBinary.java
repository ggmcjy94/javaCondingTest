package leetcode;

import java.math.BigInteger;

public class _14_AddBinary {

    public String addBinary(String a, String b) {
        BigInteger i = new BigInteger(a, 2);
        BigInteger j = new BigInteger(b, 2);
        return i.add(j).toString(2);
    }

    public String addBinary1(String a, String b) {
        int i = a.length() -1;
        int j = b.length() -1;
        int sum = 0;
        StringBuilder builder = new StringBuilder();
        while (sum > 0 || i >= 0 || j >= 0) {
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            builder.append(sum % 2);
            sum /= 2;
        }
        return builder.reverse().toString();
    }
}
