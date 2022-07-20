public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        long result;
        if(kilometersPerHour>=0){
            result= (long) ( Math.round(kilometersPerHour*1/1.609));
        }else {
            result=-1;
        }
        return result;

    }
    public static void printConversion(double input){

        long converted=toMilesPerHour(input);
        if(converted==-1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(input+ " km/h = "+ converted+" mi/h");
        }

    }
}
