public class Solution {
    public Solution() {
    }
    public boolean canJump(int[] nums) {
        if(nums.length<=0) return false;
        if(nums.length==1) return true;
        return recSearch(nums,0);


    }
    public boolean recSearch(int[] num,int currentIndex){

        if(currentIndex==num.length-1) return true;
        if(currentIndex>num.length-1) return false;
      for(int j=1;j<num.length&&j<=num[currentIndex];j++){
         if(recSearch(num,j+currentIndex)) return true;
      }
      return false;
    }


}
