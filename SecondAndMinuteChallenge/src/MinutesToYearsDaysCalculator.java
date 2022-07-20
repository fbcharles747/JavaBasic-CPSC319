public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
    public static void printYearsAndDays(long minute){
        if(minute<0){
            System.out.println("Invalid Value");
        }else{
            long years;
            long days;
            int minToDay=60*24;
            days=minute/minToDay;
            years=days/365;
            days=days%365;
            System.out.println(minute+" min = "+years+" y"+" and "
                    + days+" d");


        }


    }
}
