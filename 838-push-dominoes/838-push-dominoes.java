class Solution {
    public String pushDominoes(String dominoes){
                char[] d = dominoes.toCharArray();
        int l = 0, n = dominoes.length();
        for (int r = 0; r < n; r++) {
            if (d[r] == '.') {
                continue;
            } else if ((d[r] == d[l]) || (d[l] == '.' && d[r] == 'L')) {
                for (int k = l; k < r; k++) d[k] = d[r];
            } else if (d[l] == 'L' && d[r] == 'R') {
            }  else if (d[l] == 'R' && d[r] == 'L') {
                int m = (r - l - 1) / 2;
                for (int k = 1; k <= m; k++) {
                    d[r - k] = 'L';
                    d[l + k] = 'R';
                }
            }
            l = r;
        }
        if (d[l] == 'R') for (int k = l; k < n; k++) d[k] = 'R';
        return new String(d);
    }
}