class Solution {
    public int minPartitions(String n) {
        int maximum = 0;
	for(int i=0; i<n.length();i++) {
		if (n.charAt(i) - '0' == 9) return 9;
		maximum = Math.max(maximum, (n.charAt(i) - '0'));
	}
	return maximum;
}
}