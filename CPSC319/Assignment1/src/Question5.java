import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int n=64;
        int i=n;
        int count=0;
        while (i>0){
            count=count+1;
            i=i/2;
        }
        System.out.println("Count: "+count);
    }
}
