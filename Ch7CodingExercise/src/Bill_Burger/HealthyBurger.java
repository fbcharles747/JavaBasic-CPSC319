package Bill_Burger;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name,healthyExtra2Name;
    private double healthyExtra1Price,healthyExtra2Price=0;

    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat, price,"Whole wheat" );
    }
    public void addHealthyAddition1(String name,double price){
        super.addHamburgerAddition1(name,price);
    }
    public void addHealthyAddition2(String name,double price){
        super.addHamburgerAddition2(name,price);
    }
    @Override
    public double itemizeHamburger(){

        return  super.itemizeHamburger();
    }


}


