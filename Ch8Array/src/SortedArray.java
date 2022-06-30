import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class SortedArray {
    private int[] resultArray;

    public int[] read(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        int count=1;
        int num;
        System.out.println("Please the #" + count + " element");
        num = scanner.nextInt();
        arrayList.add(num);
        count++;
        while (scanner.hasNextInt()) {
            System.out.println("Please the #" + count + " element");
            num = scanner.nextInt();
            arrayList.add(num);
            count++;
        }

        /*
        do{
            System.out.println("Please the #" +count+ " element");
            num=scanner.nextInt();
            arrayList.add(num);
            count++;

        }while (scanner.hasNextInt());

         */

        resultArray = arrayList.stream().mapToInt(i->i).toArray();
        return resultArray;

    }

    public int[] sort(int []arg){
        int[]sortedArray=new int[arg.length];
        for (int i=0;i<arg.length;i++){
            sortedArray[i]=arg[i];
        }
        boolean flag;
        int tmp;
        do{
            flag=false;
            for(int i=0;i<sortedArray.length-1;i++){

                if(sortedArray[i]<sortedArray[i+1]){
                    tmp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=tmp;
                    flag=true;
                }
            }

        }while (flag==true);
        return sortedArray;
    }
    public void printArray(int[]arg){
        for(int num:arg){
            System.out.print(num+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        SortedArray func=new SortedArray();
        int[]myArray= func.read();
        int[]sorted=func.sort(myArray);
        func.printArray(myArray);
        func.printArray(sorted);




    }
}
