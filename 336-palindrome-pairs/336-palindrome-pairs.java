class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for (String s: words) map.put(s, i++);
        
		// if empty string exists then check if any other word is palindrome
        if(map.containsKey("")){
            int id = map.get("");
            for(i=0;i<words.length;i++)
                if(i != id && isPalindrome(words[i])){
                    addList(i, id);
                    addList(id, i);
                }
        }
        
		// if reverse exist for a word then add it
        for(i=0;i<words.length;i++){
            String word = words[i];
            String reverse = new StringBuilder(word).reverse().toString();
            mapAndAdd(map, reverse, i, false);
        }
        
		// if first portion of word is palindrome and reverse of second section then add
		// if second portion is palindrome and reverse of first section then add
        for(i=0;i<words.length;i++){
            String word = words[i];
            for (int j=1;j<word.length();j++){
                String left = word.substring(0,j);
                String right = word.substring(j);
                if(isPalindrome(left)){
                    String reverse = new StringBuilder(right).reverse().toString();
                    mapAndAdd(map, reverse, i, false);
                }
                if(isPalindrome(right)){
                    String reverse = new StringBuilder(left).reverse().toString();
                    mapAndAdd(map, reverse, i, true);
                }
            }
        }
        
        return result;
    }
    
    public void mapAndAdd(Map<String, Integer> map, String word, int i, boolean flag){
        if(map.containsKey(word) && i != map.get(word)) {
            if (flag) addList(i, map.get(word));
            else addList(map.get(word), i);
        }
    }
    
    public void addList(int i, int j){
        List<Integer> temp = new ArrayList<>();
        temp.add(i);
        temp.add(j);
        result.add(temp);
    }
    
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left < right)
            if (s.charAt(left++) != s.charAt(right--)) return false;
        return true;
    }
}