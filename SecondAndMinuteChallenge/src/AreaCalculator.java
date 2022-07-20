public class AreaCalculator {

    public static double area(double radius){
        double area;
        if(radius<0){
            return -1;
        }
        area=radius*radius*Math.PI;
        return area;

    }
    public static double area(double x,double y){
        if(x<0||y<0){
            return -1;
        }
        return x*y;

    }

}
