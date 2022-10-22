class Solution {
    public String minWindow(String s, String t) {
        int [] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while (end < s.length()) {
              final char c1 = s.charAt(end);
              if (map[c1] > 0) counter--;
              map[c1]--;
              end++;
              while (counter == 0) {
                    if (minLen > end - start) {
                          minLen = end - start;
                          minStart = start;
                    }
                    final char c2 = s.charAt(start);
                    map[c2]++;
                    if (map[c2] > 0) counter++;
                    start++;
              }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}