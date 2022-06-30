public class FibonacciSeries {

    public long fibRec(int n){
        long result;
        if(n==0) return 0;
        else if(n==1) return 1;
        else{
            result=fibRec(n-1)+fibRec(n-2);
            return result;
        }
    }

    /*
    The fibMem(int n) code is from:
    https://stackoverflow.com/questions/46073730/fibonacci-sequence-using-cache
    */

    public long fibMem(int n){
        long[]series=new long[500];
        long result=0;
        if(n==0) return 0;
        else if (n==1) return 1;
        else{
            result=fibMem(n-1)+fibMem(n-2);
            series[n]=result;
            return result;
        }

    }
    public long fibIter(int n){
        long f0=0;
        long f1=1;
        long result=0;
        if(n>=0) n--;
        for(int i=0;i<n;i++){
            result=f0+f1;
            f0=f1;
            f1=result;
        }
        return result;
    }

    public static void main(String[] args) {
        FibonacciSeries fibo=new FibonacciSeries();
        System.out.println(fibo.fibMem(5));
        System.out.println(fibo.fibRec(5));
        System.out.println(fibo.fibIter(0));
    }
}

