import java.util.Arrays;

public class Solution {
    
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long area=maxHorizontalIncrement(horizontalCuts,h)*
                maxVerticalIncrement(verticalCuts,w);


        long tmp=area%((long)Math.pow(10,9)+7);
        int returnedArea=(int)tmp;
        return returnedArea;
        
        

    }
    private long maxHorizontalIncrement(int[] horizontalCut,int h){
        int maxIncrement=0;
        int increment;
        increment=horizontalCut[0]-0;
        if(maxIncrement<increment) maxIncrement=increment;

        for(int i=1;i<horizontalCut.length;i++){
            increment=horizontalCut[i]-horizontalCut[i-1];
            if(maxIncrement<increment){
                maxIncrement=increment;
            }
        }

        increment=h-horizontalCut[horizontalCut.length-1];
        if(maxIncrement<increment) maxIncrement=increment;
        
        return maxIncrement;
    }
    private long maxVerticalIncrement(int[] verticalCut,int w){
        int maxIncrement=0;
        int increment;
        increment=verticalCut[0]-0;
        if(maxIncrement<increment) maxIncrement=increment;

        for(int i=1;i<verticalCut.length;i++){
            increment=verticalCut[i]-verticalCut[i-1];
            if(maxIncrement<increment){
                maxIncrement=increment;
            }
        }
        increment=w-verticalCut[verticalCut.length-1];
        if(maxIncrement<increment) maxIncrement=increment;


        return maxIncrement;
    }
    
    
}
