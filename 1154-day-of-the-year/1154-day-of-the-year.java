class Solution {
    public int dayOfYear(String date) {
       int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] monthDay = date.split("-");
        int year = Integer.parseInt(monthDay[0]);
        int month = Integer.parseInt(monthDay[1]);
        int day = Integer.parseInt(monthDay[2]);
        int dayYear = day;
        for(int i=0;i<month-1;i++){
            dayYear = dayYear+arr[i];
        }
        if(month>2 && year%4==0 && (year % 100 != 0 || year % 400 == 0)){
            dayYear+=1;
        }
        return dayYear;
        
        
    }
}