import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
        boolean result=isPerfectNumber(6);
        System.out.println(result);
    }
    public static boolean isPerfectNumber(int num){
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        int factorSum=0;
        if(num<1){
            return false;
        }
        for(int i=1;i<num;i++){
            if(num%i==0){
                tmp.add(i);
            }
        }
        for(int i:tmp){
            factorSum+=i;
        }
        return factorSum==num;
    }

}
