public class Triangle {
    Point[] vertices;
    public Triangle(Point[] vertices){
        if(vertices.length != 3){
            System.out.println("Enter 3 vertices: ");
        }
        this.vertices = vertices;
    }

    public double calculatePerimeter(){
        double perimeter = 0;
        for(int i = 0; i < 3; i++){
            perimeter += vertices[i].distance(vertices[(i + 1)%3]);
        }
        return perimeter;
    }

    public Point.triangle_types displayTriangleType(){
        double ab = vertices[0].distance(vertices[1]);
        double bc = vertices[1].distance(vertices[2]);
        double ca = vertices[2].distance(vertices[0]);

        if(ab == bc && bc == ca){
            return (Point.triangle_types.ISOSCELES);
        } else if (ab == bc || bc == ca || ca == ab) {
            return (Point.triangle_types.EQUILATERAL);
        }else {
            return (Point.triangle_types.UNKNOWN);
        }
    }

    public double areaOfTriangle() {
        double s = calculatePerimeter() / 2;
        double ab = vertices[0].distance(vertices[1]);
        double bc = vertices[1].distance(vertices[2]);
        double ca = vertices[2].distance(vertices[0]);
        return Math.sqrt(s * (s-ab) * (s-bc) * (s-ca));
    }
    public boolean isInsidePoint(Point point){
        double area = areaOfTriangle();
        double area1 = new Triangle(new Point[]{point, vertices[0], vertices[1]}).areaOfTriangle();
        double area2 = new Triangle(new Point[]{point, vertices[1], vertices[2]}).areaOfTriangle();
        double area3 = new Triangle(new Point[]{point, vertices[2], vertices[0]}).areaOfTriangle();
        return area == area1 + area2 + area3;}


}