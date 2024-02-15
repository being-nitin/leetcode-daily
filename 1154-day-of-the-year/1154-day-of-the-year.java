class Solution {
    public int dayOfYear(String date) {
    int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
      String[] monthD = date.split("-");
        int year = Integer.parseInt(monthD[0]);
        int month = Integer.parseInt(monthD[1]);
        int days = Integer.parseInt(monthD[2]);
        int totalDays = days;
        for(int i=0;i<month-1;i++){
            totalDays = totalDays+arr[i];
        }
        if(month>2 && year%4==0 && (year%400==0 || year%100!=0)){
            totalDays = totalDays+1;
        }
        return totalDays;
        }
}