class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> answers = new ArrayList<List<String>>();
    int loopcount = searchWord.length();
    
    java.util.Arrays.sort(products);
    
    for (int i = 0; i < loopcount; i++){
        int j = 0;
        int currentcount = 0;
        String searchString = searchWord.substring(0,i+1);
        List<String> current = new ArrayList<String>(); 

        while (j < products.length && currentcount < 3){
            if (products[j].startsWith(searchString)){
                current.add(products[j]);
                currentcount++;
            }
            j++;
        }
        currentcount = 0;
        answers.add(current);
    }
    return answers;
}
        
    }
