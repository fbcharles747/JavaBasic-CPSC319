import java.util.ArrayList;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
    }
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
            return;
        }
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }

        }
    }
    public static boolean isPerfectNumber(int num){
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        int factorSum=0;
        if(num<1){
            return false;
        }
        for(int i=1;i<=num;i++){
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
