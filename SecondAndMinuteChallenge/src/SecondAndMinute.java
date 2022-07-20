public class SecondAndMinute {
    public static void main(String[] args) {
        String result=getDurationString(65,45);
        System.out.println(result);
        result=getDurationString(300000);
        System.out.println(result);
    }
    public static String getDurationString(int minute ,int second){
        String timeFormat;
        if(minute>=0&&second>=0&&second<=59){
            int hour=minute/60;
            minute=minute%60;
            timeFormat=hour+"h "+minute+"m "+second+"s";
        }else {
            return "Invalid value";
        }
        return timeFormat;
    }
    public static String getDurationString(int second){
        String timeFormat;
        int minute;
        if(second>=0){
            minute=second/60;
            second=second%60;
        }else{
            return "Invalid value";
        }

        timeFormat=getDurationString(minute,second);
        return timeFormat;

    }
}
