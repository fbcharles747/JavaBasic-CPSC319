public class LeapYear {
    public static void main(String[] args) {
        boolean result;
        result=isLeapYear(1600);
        System.out.println(result);
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
