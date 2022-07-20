import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums){
        Arrays.sort(nums);
        nums=eliminateDuplicate(nums);
        int consecutiveCount=1;
        int maxConsecutiveCount=0;


        for(int i=0;i<nums.length;i++){
            consecutiveCount=1;


            while(i<nums.length-1&&nums[i]+1==nums[i+1]){
                consecutiveCount++;
                i++;



            }

            if(consecutiveCount>maxConsecutiveCount) maxConsecutiveCount=consecutiveCount;
        }
        return maxConsecutiveCount;

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
}
