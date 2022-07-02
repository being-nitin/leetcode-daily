class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
 
        Arrays.sort(horizontalCuts); // to get consecutive cuts
        Arrays.sort(verticalCuts);
        long mod = (long)1e9+7;
        long a = 0,b = 0; // a = max diff of horizontal cuts b = max diff of vertical           cuts
        int prev =0; // two edges of cake (0 - first cut)
        a = Math.max(a,h-horizontalCuts[horizontalCuts.length-1]); // and (edge - last           cut) of the cake
        b = Math.max(b,w-verticalCuts[verticalCuts.length-1]);
        for(int i:horizontalCuts){
            a = Math.max(a,i-prev);
            prev = i;
        }
        prev = 0;
        for(int i:verticalCuts){
            b = Math.max(b,i-prev);
            prev = i;
        }
        return (int)((a*b)%mod);
    }
}