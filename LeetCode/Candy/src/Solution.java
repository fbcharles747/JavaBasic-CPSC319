import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {

        int n=ratings.length;
        int[] candyList=new int[n];
        Arrays.fill(candyList,1);

        for(int i=1;i<n;i++){//counting from the left
            if(ratings.length>1&&ratings[i]>ratings[i-1]){
                if(candyList[i]<candyList[i-1]+1) candyList[i]=(candyList[i-1]+1);

            }
        }
        for(int j=n-2;j>=0;j--){
            if(ratings.length>1&&ratings[j]>ratings[j+1]){
                if(candyList[j]<candyList[j+1]+1) candyList[j]=(candyList[j+1]+1);
            }
        }

        int sum=0;
        for(int num:candyList){
            sum+=num;
        }

        return sum;


    }
}
