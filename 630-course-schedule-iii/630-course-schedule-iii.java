class Solution {
    public int scheduleCourse(int[][] courses) {
	var maxHeaps = new PriorityQueue<Integer>(Comparator.reverseOrder());
	Arrays.sort(courses, Comparator.comparingInt(course -> course[1]));

	for (int i = 0, total = 0; i < courses.length; i++) {
		maxHeaps.add(courses[i][0]);
		if ((total += courses[i][0]) > courses[i][1])
			total -= maxHeaps.poll();
	}
	return maxHeaps.size();
}
}