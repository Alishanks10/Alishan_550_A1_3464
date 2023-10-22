public class Point {

    enum triangle_types{
        ISOSCELES, EQUILATERAL, UNKNOWN
    }
    double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherCoordinate){
        return Math.sqrt(Math.pow(x - otherCoordinate.x, 2) + Math.pow(y - otherCoordinate.y, 2));
    }
}