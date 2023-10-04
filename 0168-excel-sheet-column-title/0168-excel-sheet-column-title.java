class Solution {
    public String convertToTitle(int columnNumber) {
      String res = "";
        while(columnNumber!=0){
            columnNumber--;
            int ch = 'A'+columnNumber%26;
            res = (char)ch+res;
            columnNumber/=26;
        }
        return res;
    }
}