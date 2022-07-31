class NumArray {
    int[] arr;
	int totalSum = 0;

	public NumArray(int[] nums) {
		arr = nums;

		// get total sum of nums array
		for (int n : arr) {
			totalSum += n;
		}
	}

	public void update(int index, int val) {
		totalSum -= arr[index];// subtract the value of the current num of the given index
		arr[index] = val;// replace val
		totalSum += val;// add new val
	}

	public int sumRange(int left, int right) {
		int ans = totalSum;

		// subtract values before left
		for (int i = 0; i < left; i++) {
			ans -= arr[i];
		}
		// subtract values after right
		for (int i = right + 1; i < arr.length; i++) {
			ans -= arr[i];
		}

		return ans;
	}
}
     /**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */