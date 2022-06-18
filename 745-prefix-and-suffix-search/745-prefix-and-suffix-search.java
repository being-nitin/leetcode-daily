class WordFilter {

    HashMap<String,Integer> map=new HashMap<>();
    public WordFilter(String[] words) {
        for(int i=0;i<words.length;i++){
            solve(words[i],i);
        }
    }
    
    public int f(String prefix, String suffix) {
        
        // System.out.println(map);
        StringBuilder sb=new StringBuilder();
        sb.append(prefix);
        sb.append('#');
        sb.append(suffix);
        return map.getOrDefault(sb.toString(),-1);
    }
    
    
    public void solve(String w,int idx){
        
         for (int i = 0; i < w.length (); i++) {
                String s = w.substring (0, i + 1);
                // System.out.println(s); 
                
             for (int j = w.length () - 1; j >= 0; j--) {
                    StringBuilder str = new StringBuilder ();
                    str.append (s);
                    str.append ("#");
                    str.append (w.substring (j));
                     // System.out.println(str);
                    map.put(str.toString (), idx);
                }
        }
        
     
    }
}


/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */