class Solution {
public:
    string convertToTitle(int columnNumber) {
        string res = "";
        while(columnNumber){
            columnNumber--;
            char c = 'A'+columnNumber%26;
            res = c+res;
            columnNumber/=26;
        }
        return res;
    }
};