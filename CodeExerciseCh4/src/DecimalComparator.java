public class DecimalComparator {

    public static void main(String[] args) {
        boolean result;
        result=areEqualByThreeDecimalPlaces(1.174,1.175);
        System.out.println(result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double d1,double d2){

        double result= (d1-d2)>0?1000*(d1-d2)+0.000001:1000*(d1-d2)-0.000001;
        int result1=(int) result;

        return (result1==0);
    }
}
