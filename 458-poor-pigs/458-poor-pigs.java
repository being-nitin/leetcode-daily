class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
      int T = (minutesToTest/minutesToDie) + 1;
        int count = 0;
        int total = 1;
        while (total < buckets) {
            total *= T;
            count++;
        }
        return count;
    }
}