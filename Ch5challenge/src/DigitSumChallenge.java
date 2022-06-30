public class DigitSumChallenge {
    public static void main(String[] args) {
        int result;
        result=sumDigits(32123);
        System.out.println(result);
    }
    public static int sumDigits(int num){
        int sum=0;
        int digit;
        if(num<10) return -1;
        do{
            digit=num%10;
            sum+=digit;
            num=num/10;
        } while (num!=0);

        return sum;

    }
}
