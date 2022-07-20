public class PlayingCat {
    public static void main(String[] args) {
        boolean result=isCatPlaying(true,10);
        System.out.println(result);
    }
    public static boolean isCatPlaying(boolean isSummer,int temperature){

        int upperTmp=isSummer?45:35;
        int lowerTmp=25;
        if(temperature>=lowerTmp&&temperature<=upperTmp){
            return true;
        }else {
            return false;
        }
    }
}
