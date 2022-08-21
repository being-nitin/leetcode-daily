class Solution {
    public int[] movesToStamp(String stamp, String target){
        int n = stamp.length();
        int m = target.length();
        boolean[] mark = new boolean[m];
        List<Integer> sol = new ArrayList<> ();
        while ((int) sol.size() <= 10 * m) {
            int len = sol.size();
            for (int i = 0; i <= m - n; i++) {
                boolean flag = true;
                for (int j = 0; j < n; j++) {
                    if (!mark[i + j] && stamp.charAt(j) != target.charAt(i + j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sol.add(i);
                    for (int j = 0; j < n; j++) {
                        mark[i + j] = true;
                    }
                }
            }
            if ((int) sol.size() == len) break;
            boolean flag = true;
            for (boolean i : mark) {
                if (!i) flag = false;
            }
            if (flag) break;
        }
        for (boolean i : mark) {
            if (!i) return new int[0];
        }
        int[] ans = new int[sol.size()];
        for (int i = (int) sol.size() - 1; i >=0; i--) {
            ans[(int) sol.size() - 1 - i] = sol.get(i);
        }
        return ans;
    }
}