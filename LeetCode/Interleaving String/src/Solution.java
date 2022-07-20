public class Solution {


    public boolean isInterleave(String s1, String s2, String s3) {

        int i=0;
        int j=0;
        boolean isInS1=true;

        while(i+j<s3.length()){

            if(isInS1){
                if(i<s1.length()&&s1.charAt(i)==s3.charAt(i+j)){
                    i++;
                    isInS1=true;
                }else isInS1=false;


            }else {
                if(j<s2.length()&&s2.charAt(j)==s3.charAt(i+j)){
                    j++;
                    isInS1=false;
                }else isInS1=true;


            }




        }

        if(i==s1.length()&&j==s2.length()
        &&i+j==s3.length()){
            return true;
        }
        return false;




    }
//    private void findAndRemoveChar(String s1,int i,String s2,int j,StringBuilder s3Builder){
//        if(isInS1){
//            if(i<s1.length()&&s1.charAt(i)==s3Builder.charAt(0)){
//                s3Builder.deleteCharAt(0);
//                i++;
//                isInS1=true;
//            }else isInS1=false;
//
//
//        }else {
//            if(j<s2.length()&&s2.charAt(j)==s3Builder.charAt(0)){
//                s3Builder.deleteCharAt(0);
//                j++;
//                isInS1=false;
//            }else isInS1=true;
//
//
//
//        }
//
//
//
//    }
}
