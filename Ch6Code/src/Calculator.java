public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }

    public static void main(String[] args) {
        Carpet carpet1=new Carpet(3.5);
        Floor floor1=new Floor(2.75,4);
        Calculator calculator=new Calculator(floor1,carpet1);
        System.out.println(calculator.getTotalCost());
    }



}
