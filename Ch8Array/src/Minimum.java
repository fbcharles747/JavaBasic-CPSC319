import java.util.Scanner;

public class Minimum {


    private Scanner scanner=new Scanner(System.in);

    public int[]readElements(int size){
        Scanner scanner=new Scanner(System.in);
        int[] inputArray=new int[size];

        for(int i=0;i<size;i++){
            //System.out.println("Enter #"+i+ " number");
            inputArray[i]=scanner.nextInt();

        }
        return inputArray;
    }
    public int readInteger(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();

    }
    public int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int num:array){
            if(num<min) min=num;
        }
        return min;
    }
    public void print(int[]array){
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println("");
    }


}
