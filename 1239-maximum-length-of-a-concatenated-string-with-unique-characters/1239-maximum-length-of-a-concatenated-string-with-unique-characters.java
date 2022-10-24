class Solution {
    int max =0;
    public int maxLength(List<String> arr) {
        backTrack(arr,"",0);
        return max;
    }
    private void backTrack(List<String> arr, String current, int start){
        if(max<current.length())
            max =current.length();
        for(int i=start; i<arr.size();i++){
            if(!isValid(current,arr.get(i))) continue;
            backTrack(arr,current+arr.get(i),i+1);
            current.replace(arr.get(i),"");
        }
    }
    
    private boolean isValid(String currentString, String newString){
        int[] array = new int[26];
        for(int i=0;i<newString.length();i++){
            if(++array[newString.charAt(i)-'a'] == 2) return false;  
            if(currentString.contains(newString.charAt(i)+""))
                return false;
        }
        return true;
    }
}