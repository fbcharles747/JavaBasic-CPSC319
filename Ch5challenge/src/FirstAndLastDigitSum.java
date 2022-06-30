public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0) return -1;
        int lastDigit=number%10;
        int firstDigit=0;
        do {
            firstDigit=number%10;
            number=number/10;
        }while(number!=0);
       return firstDigit+lastDigit;
    }
}
