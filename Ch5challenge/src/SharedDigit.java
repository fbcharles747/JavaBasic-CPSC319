import java.util.ArrayList;

public class SharedDigit {
    public static void main(String[] args) {
        boolean result=hasSharedDigit(12,23);
        System.out.println(result);
    }
    public static boolean hasSharedDigit(int num1,int num2){
        if(num1<10||num1>99||num2<10||num2>99)return false;
        ArrayList<Integer> tmpList=new ArrayList<>();
        int digit;
        while(num1!=0){
            digit=num1%10;
            tmpList.add(digit);
            num1=num1/10;
        }
        while(num2!=0){
            digit=num2%10;
            if(tmpList.contains(digit)) return true;
            num2=num2/10;
        }
        return false;

    }
}
