public class Main {
    public static void main(String[] args) {
//        String s1="aabcc";
//        String s2="dbbca";
//        String s3="aadbbbaccc";

        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        Solution solution=new Solution();
        Boolean result=solution.isInterleave(s1,s2,s3);
        System.out.println(result);

    }
}
