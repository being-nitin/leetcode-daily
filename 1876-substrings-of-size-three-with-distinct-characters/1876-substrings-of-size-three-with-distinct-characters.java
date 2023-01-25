class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i=0;i<s.length()-2;i++){
            char m = s.charAt(i);
            char n = s.charAt(i+1);
            char o = s.charAt(i+2);
            if((m!=n) && (n!=o) &&(o!=m)){
                cnt++;
            }
            }
        return cnt;
    }
}