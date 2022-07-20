public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes;
        int remainingkiloBytes;
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            megabytes=kiloBytes/1024;
            remainingkiloBytes=kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "
                    +remainingkiloBytes+" KB");
        }

    }
}
