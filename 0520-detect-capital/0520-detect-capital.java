class Solution {
    public boolean detectCapitalUse(String word) {
        int Cap = 0;
        int Sma = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                Cap++;
            }
        }
        if(Cap==word.length()){
            return true;
        }
        if(Cap==0){
            return true;
        }
        if(Cap==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z')){
            return true;
        }
        return false;
    }
}