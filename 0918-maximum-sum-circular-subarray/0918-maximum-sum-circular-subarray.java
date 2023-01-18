class Solution {
   public int maxSubarraySumCircular(int[] array) {
        int acc = 0;
        int max1 = kadane(array);
        for(int i = 0; i < array.length; i++) {
            acc += array[i];
            array[i] = -array[i];
        }
        int min = kadane(array);
        int max2 = acc + min;
        if(max2 == 0)  return max1;
        return Math.max(max1, max2);
    }
          public int kadane(int[] array) {
        int maxSum = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            maxSum = Math.max(maxSum+array[i], array[i]);
            max = Math.max(max, maxSum);
        }
        return max;
    }
}