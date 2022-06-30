public class ReverseChallenge {
    public static int[] reverse(int []array){
        int[]reversedArray=new int[array.length];
        int count=0;
        for(int i=array.length-1;i>=0;i--){
            reversedArray[count]=array[i];
            count++;
        }
        return reversedArray;
    }
    public static void printArray(int[]array){
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[]myArray={1,3,4,5,6};
        printArray(reverse(myArray));
    }
}
