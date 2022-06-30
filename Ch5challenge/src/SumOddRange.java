public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }
    public static boolean isOdd(int num){
        if(num<0) return false;
        boolean result=num%2==1?true:false;
        return result;
    }
    public static int sumOdd(int start,int end){
        if(start<0||start>end||end<0) return -1;
        int sum=0;
        for(int i=start;i<=end;i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
