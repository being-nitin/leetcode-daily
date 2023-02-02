class Solution {
    public boolean isAlienSorted(String[] words, String order) {
   for(int i = 0; i < words.length - 1; i++)
        {
            String word1 = words[i];
            String word2 = words[i+1];
           int len = Math.max(word1.length(), word2.length());
            for(int j = 0; j < len; j++)
            {
                int index1 = -1;
                int index2 = -1;
                if(j < word1.length())
                    index1 = order.indexOf(word1.charAt(j));

                if(j < word2.length())
                    index2 = order.indexOf(word2.charAt(j));
                if(index1 < index2)
                    break;
                else if(index2 < index1)
                    return false;
            }
        }
        return true;
    }
}