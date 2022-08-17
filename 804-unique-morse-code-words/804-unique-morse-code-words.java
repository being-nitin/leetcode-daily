class Solution {
private String transform(String str) {
        String s[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."},res="";
        for(int i=0;i<str.length();i++)
            res+=s[(int)str.charAt(i)-'a'];
        return res;
    }
    
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<String>();
        for(String w : words) set.add(transform(w));
        return set.size();
    }
}