public class Point {
    private int x=0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int y=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public  double distance(){
        return distance(0,0);
    }
    public double distance(int otherX,int otherY){
        int xDist=this.x-otherX;
        int yDist=this.y-otherY;
        double result =Math.sqrt(Math.pow(xDist,2)+Math.pow(yDist,2));
        return result;
    }
    public double distance(Point another){
        return distance(another.getX(), another.getY());
    }

    public static void main(String[] args) {
        Point first=new Point(6,5);
        Point second=new Point(3,1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));

    }
}
