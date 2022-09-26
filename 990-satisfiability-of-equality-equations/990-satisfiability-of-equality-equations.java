class Solution {
     static int fetchParent(int index , int[]parent){
        if(parent[index]==index) return index;
        return fetchParent(parent[index] ,parent);
    }
    
    public boolean equationsPossible(String[] equations) {
        int[] parent =new int[26];
        for(int i=0 ;i<parent.length ;i++) parent[i]=i;
        for(String equation : equations){

            if (equation.charAt(1) == '=') {
                int var1 = fetchParent(equation.charAt(0)-'a' , parent);
                int var2 = fetchParent(equation.charAt(3)-'a' , parent);

                if(var1!=var2)
                {
                    parent[var2] = var1;
                }
            }
        }
        for(String equation : equations){

            if(equation.charAt(1)=='!'){
                int var1 = fetchParent(equation.charAt(0)-'a' ,parent);
                int var2 = fetchParent(equation.charAt(3)-'a' ,parent);

                if(var1==var2) return false;
            }
        }

        return true;
    }
}