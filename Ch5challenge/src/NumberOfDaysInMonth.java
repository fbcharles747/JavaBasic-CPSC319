public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(getDaysInMonth(2,2020));
    }
    public static int getDaysInMonth(int month,int year){
        if(month<1||month>12||year<1||year>9999){
            return -1;
        }
        switch (month){
            case 1:
                return 31;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }else {
                    return 28;
                }
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            default:
                return 31;
        }

    }
    public static boolean isLeapYear(int year){
        boolean result;
        if(year<1||year>9999){
            return false;
        }

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
                return false;
            }
            return true;
        }

        return false;

    }
}
