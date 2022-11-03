class Solution {
    public int longestPalindrome(String[] words) {
 HashMap<String, Integer> map = new HashMap<String, Integer>();
         int maxVisited = 0;
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        int result = 0;
        boolean visited = false;
        int max = 0;
        System.out.println(map);
        for (String key: map.keySet()) {
            String reverse = "" + key.charAt(1) + key.charAt(0);
            if (key.equals(reverse)) {
                if (max < map.get(key) && map.get(key) % 2 != 0) {
                    System.out.print(key + "." + result);
                    if (max != 0) {
                        result = result - 2;
                    }
                    result = result + (map.get(key) * 2);
                    max = map.get(key);
                } else {
                   
                    if (map.get(key) % 2 != 0) {
                         
                        result = result + ((map.get(key) - 1) * 2);
                      } else {
                        
                        result = result + (map.get(key) * 2);
                      }
                }
                
            } else {
                  result = result + (Math.min(map.getOrDefault(reverse, 0), map.get(key)) * 4);
               
            }
            map.put(key, 0);
         
        }
        return result;
    }
}