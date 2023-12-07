class Solution {
    public String convertToTitle(int columnNumber) {
      String ans = "";
        while(columnNumber!=0){
            columnNumber--;
            int ch = 'A'+columnNumber%26;
            ans = (char)ch+ans;
            columnNumber = columnNumber/26;
        }
        return ans;
    }
}