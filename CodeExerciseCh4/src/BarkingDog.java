public class BarkingDog {
    public static void main(String[] args) {
        boolean result;
        result=shouldWakeUp(false,2);
        System.out.println(result);
    }
    public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){
        if(hourOfDay<0||hourOfDay>23){
            return false;
        }
        if(isBarking&&hourOfDay<8||hourOfDay>22){
            return true;
        }
        return false;
    }
}
