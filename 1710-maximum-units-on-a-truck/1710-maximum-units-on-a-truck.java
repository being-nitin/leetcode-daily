class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
// 		sorting the boxtypes in descending order with respect to thier units.
        Arrays.sort(boxTypes,Comparator.comparingInt(o-> -o[1]));
        int i=0,ans=0,len=boxTypes.length;
        while(i<len && truckSize>0){
            int min = Math.min(boxTypes[i][0],truckSize);
            ans = ans+min*boxTypes[i][1];
            truckSize = truckSize-min;
            i++;
        }
        return ans;
        }
}