class Solution {
    public String reverseWords(String s){
        String[] str = s.split(" ");
        String strr="";
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--){
                strr+=str[i].charAt(j);
            }
            if(i!=str.length-1)
                strr = strr+" ";
            
        }
        return strr;
    }
}