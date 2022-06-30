public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int result;
        result=getGrestestCommonDivisor(112,98);
        System.out.println(result);
    }
    public static int getGrestestCommonDivisor(int first,int second){
        if (first<10||second<10) return -1;
        int smaller;
        int gcd=1;
        smaller=Math.min(first,second);
        for(int i=1;i<=smaller;i++){
            if(first%i==0&&second%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
