class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
      int[] arr=new int[26];
        for(String str : words2){
            int[] arr1=new int[26];
            for(int i=0; i<str.length(); i++){
                int c=str.charAt(i)-'a';
                arr1[c]++;
                arr[c]=Math.max(arr[c],arr1[c]);
            }
        }
        int n=0;
        for(int i : arr){  n+=i; }
        
        List<String> list=new ArrayList<>();
        for(String str : words1){
            if(str.length()<n){ continue; }
            int[] arr1=new int[26];
        
            for(int i=0; i<str.length(); i++){
                int c=str.charAt(i)-'a';
                arr1[c]++;
            }
            boolean bool=true;
            for(int i=0; i<26; i++){
                if(arr1[i]<arr[i]){ bool=false; break; }
            }
            if(bool){ list.add(str); }
        }
        return list;
    }
}