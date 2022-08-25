class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      int[]alpha=new int[26];
      for(char c : magazine.toCharArray()){
      alpha[c-'a']++;
      }
      for(int i=0;i<ransomNote.length();i++){
      if(alpha[ransomNote.charAt(i)-'a']==0)
      return false;
      alpha[ransomNote.charAt(i)-'a']--;
     }
     return true;
    }
    }