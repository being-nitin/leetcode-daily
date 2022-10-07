class MyCalendarThree {
    TreeMap<Integer, Integer> treemap;
    public MyCalendarThree() {
        treemap = new TreeMap();
    }
    public int book(int start, int end) {
        treemap.put(start, treemap.getOrDefault(start, 0) + 1);
        treemap.put(end, treemap.getOrDefault(end, 0) - 1);
        
        int active = 0, ans = 0;
        for (int d: treemap.values()) {
            active += d;
            ans = Math.max(ans,active);
        }
        return ans;
    }
}/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */