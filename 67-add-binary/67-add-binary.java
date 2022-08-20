class Solution {
    public String addBinary(String a, String b) {
        StringBuilder strb = new StringBuilder();

        int m = a.length();
        int n = b.length();

        int carry = 0;
        for (int i = 0; i < Math.max(m, n); i++) {
            int digitA = i < m ? Integer.parseInt(a.substring(m - 1 - i, m - i)) : 0;
            int digitB = i < n ? Integer.parseInt(b.substring(n - 1 - i, n - i)) : 0;
            int sum = digitA + digitB + carry;
            strb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) strb.append(carry);

        return strb.reverse().toString();
    }
}