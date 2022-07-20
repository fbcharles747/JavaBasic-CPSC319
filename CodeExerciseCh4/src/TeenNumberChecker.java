public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean result;
        result=hasTeen(22,23,34);
        System.out.println(result);
    }
    public static boolean hasTeen(int num1,int num2,int num3){
        boolean result=false;
        result = isTeen(num1)||isTeen(num2)||isTeen(num3);
        return result;

    }

    private static boolean isTeen(int num) {
        if(num>=13&&num<=19){
            return true;
        }
        return false;

    }
}
