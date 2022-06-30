import java.util.ArrayList;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }


    public static boolean isPalindrome(int num){
        int reversed;
        String tmp;
        StringBuffer tmp1;
        if(num>=0){
            tmp=Integer.toString(num);
            tmp1=new StringBuffer(tmp);
            tmp=tmp1.reverse().toString();
            reversed=Integer.parseInt(tmp);
        }else {
            num*=-1;
            tmp=Integer.toString(num);
            tmp1=new StringBuffer(tmp);
            tmp=tmp1.reverse().toString();
            reversed=Integer.parseInt(tmp)*(-1);
            num*=-1;
        }
        return reversed==num;
    }
    public static String reverseGiven(String given){
        StringBuffer tmp1=new StringBuffer(given);
        tmp1.reverse();
        return tmp1.toString();
    }

}
