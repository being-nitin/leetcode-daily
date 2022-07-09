class Solution {
    public int maxResult(int[] nums, int k) {
        LinkedList<Integer> lists = new LinkedList<>();
        lists.add(0);
        for(int i=1; i<nums.length; i++){
            if(lists.getFirst() < i-k) lists.removeFirst();
            nums[i] += nums[lists.getFirst()];
            while(!lists.isEmpty() && nums[lists.getLast()] <= nums[i]) lists.removeLast();
            lists.addLast(i);
        }
        return nums[nums.length-1];
    }
}