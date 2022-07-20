import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int wiggleMaxLength(int[] nums) {
        Arrays.sort(nums);
        nums=eliminateDuplicate(nums);
        ArrayList<Integer> wiggleSequence=new ArrayList<>();
        int mid=nums.length/2;
        int[] lower=Arrays.copyOfRange(nums,0,mid);
        int[] upper=Arrays.copyOfRange(nums,mid,nums.length);
        upper=reverseArray(upper);


        mergeWiggling(wiggleSequence,lower,upper);
        return wiggleSequence.size();


    }
    private void mergeWiggling(List<Integer> list,int[] lower, int[]upper){

        int i=0,j=0;


        while (true){

            if(i<lower.length){
                list.add(lower[i]);
                i++;

            }
            if(j<upper.length){
                list.add(upper[j]);
                j++;

            }else {
                break;
            }

        }


    }

    private int[] eliminateDuplicate(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int j = 0; j< nums.length; j++){
            if(j==0||nums[j]!=nums[j-1]){
                list.add(nums[j]);
            }
        }
        nums=new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
    private int[] reverseArray(int[] arr){
        int n=arr.length;
        int j=n;
        int[] tmp=new int[n];
        for(int i=0;i<n;i++){
            tmp[j-1]=arr[i];
            j--;
        }
        return tmp;
    }
}
