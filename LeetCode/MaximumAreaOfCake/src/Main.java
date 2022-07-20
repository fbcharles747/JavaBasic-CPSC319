public class Main {
    public static void main(String[] args) {
        int h=1000000000,w=1000000000;
        int[] horizontalCut={2};
        int[] verticalCut={2};
        Solution sol=new Solution();
        System.out.println(sol.maxArea(h,w,horizontalCut,verticalCut));
    }
}
