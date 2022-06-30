import java.util.Scanner;

public class SortArray {
    private Scanner scanner=new Scanner(System.in);

    public static int[] getIntegers(int size){
        Scanner scanner=new Scanner(System.in);
        int[]userInput=new int[size];
        for(int i=0;i<size;i++){
            userInput[i]=scanner.nextInt();
        }
        return userInput;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }
    public static int[] sortIntegers(int [] array){
        int[] result=new int[array.length];
        for(int i=0;i<array.length;i++){
            result[i]=array[i];
        }
        int tmp;
        boolean flag;
        do{
            flag=false;
            for(int i=0;i<result.length-1;i++){
                if(result[i]>result[i+1]){
                    tmp=result[i];
                    result[i]=result[i+1];
                    result[i+1]=tmp;
                    flag=true;
                }
            }
        }while(flag==true);
        return result;
    }

    public static void main(String[] args) {
        int[] myArray=getIntegers(5);
        myArray=sortIntegers(myArray);
        printArray(myArray);
    }
}
