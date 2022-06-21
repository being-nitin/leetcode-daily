class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        var n = heights.length;
        var ladderClimb = new PriorityQueue<Integer>();

	for (var i = 1;i<n;i++) {
		var climb = heights[i] - heights[i - 1];
		if (climb <= 0)
			continue; // descent, skip
		ladderClimb.add(climb);
		if (ladderClimb.size() <= ladders)
			continue; // use a ladder
		if ((bricks -= ladderClimb.poll()) < 0)
			return i - 1; // insufficient bricks, terminate
	}
	return n - 1;
}
    }