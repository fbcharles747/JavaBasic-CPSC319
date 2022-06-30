public class Printer {
    private int tonerLevel;
    private int pagesPrinted=0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
       this.tonerLevel=(tonerLevel>-1&&tonerLevel<=100)?tonerLevel:-1;

        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        int resultToner=tonerLevel;
        if(tonerAmount>0&&tonerAmount<100){

           return (tonerLevel+tonerAmount>100)?-1:(tonerLevel+=tonerAmount);
        }
       return -1;
    }
    public int printPages(int pages){
        double pagesToPrint=pages;
        if(duplex) pagesToPrint = Math.ceil((double) pages / 2);
        pagesPrinted+=pagesToPrint;
        return (int)pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public static void main(String[] args) {
        Printer printer=new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.printPages(4));
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.printPages(2));
        System.out.println(printer.getPagesPrinted());
    }
}
