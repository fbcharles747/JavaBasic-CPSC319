public class EvenDigitSum {
    public static void main(String[] args) {
        int result;
        result=getEvenDigitSum(123456789);
        System.out.println(result);
    }
    public static int getEvenDigitSum(int num){
        if(num<0) return -1;
        int sum=0;
        int digit;
        while(num!=0){
            digit=num%10;
            if(digit%2==0) sum+=digit;
            num=num/10;
        }
        return sum;
    }
}
