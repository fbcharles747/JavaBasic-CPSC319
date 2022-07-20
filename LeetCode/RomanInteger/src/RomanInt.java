import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanInt {
    private Map<Character,Integer> table;
    ArrayList<Integer> list;

    public RomanInt() {
        table=new HashMap<>();

        table.put('I',1);
        table.put('V',5);
        table.put('X',10);
        table.put('L',50);
        table.put('C',100);
        table.put('D',500);
        table.put('M',1000);
    }


    public int romanToInt(String s) {
        list=new ArrayList<>();
        char[] tmp=s.toCharArray();
        int tmpInt;
        for(char c:tmp){
            tmpInt=table.get(c);
            list.add(tmpInt);

        }
        return sumUpList();


    }
    private int sumUpList(){
        int sum=0;

        for(int i=0;i<list.size();i++){
            if (i!=list.size()-1&&list.get(i)<list.get(i+1)){
               sum-=list.get(i);
            }else {
                sum+=list.get(i);
            }
        }
        return sum;
    }
}
