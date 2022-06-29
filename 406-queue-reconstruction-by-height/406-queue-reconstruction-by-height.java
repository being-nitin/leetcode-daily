class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (m, n) -> {
            if(m[0] != n[0])
            	return n[0] - m[0];
            else
            	return m[1] - n[1];
        });
        List<int[]> answer = new ArrayList<>();
        for(int[] person : people) {
        	answer.add(person[1], person);
        }
        people = answer.toArray(people);
        return people;
    }
}