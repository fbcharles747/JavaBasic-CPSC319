import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    private Comparator<int[]> OrderByUnits=new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[1]>o2[1]) return -1;
            else if (o2[1]>o1[1]) return 1;

            return 0;
        }



    };
    public void maximumUnits() {
        int[][] boxTypes = {{5,10},{2,5}, {4,7},{3,9}};
        Arrays.sort(boxTypes,OrderByUnits);
        for(int[]type:boxTypes){
           for(int t:type){
               System.out.print(t+" ");
           }
            System.out.println("");

        }


    }




}
