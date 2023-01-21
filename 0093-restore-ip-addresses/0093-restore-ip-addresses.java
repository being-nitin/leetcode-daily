class Solution {
     public static List<String> restoreIpAddresses(String s) {
        List<String> addresses = new ArrayList<>();
        List<String> address = new ArrayList<>();
        rec(s, 0, address, addresses);
        return addresses;
    }
    private static void rec(String s, int i, List<String> address, List<String> addresses) {
        if (address.size() == 4) {
            if (i == s.length()) {
                addresses.add(String.join(".", address));
            }
        } else {
            for (int j = i + 1; j <= i + 3 && j <= s.length(); j++) {
                String nextInt = s.substring(i, j);
                if (Integer.parseInt(nextInt) <= 255 && (nextInt.equals("0") || !nextInt.startsWith("0"))) {
                    address.add(nextInt);
                    rec(s, j, address, addresses);
                    address.remove(address.size() - 1);
                }
            }
        }
    }
}


