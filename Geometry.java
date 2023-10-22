import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTriangles = 3;
        Triangle[] triangles = new Triangle[numberOfTriangles];

        for (int i = 0; i < numberOfTriangles; i++){
            Point[] vertices = new Point[3];
            System.out.println("Enter coordinates of a triangle: " + (i+1) + ":");

            for(int j = 0; j < 3; j++){
                System.out.print("Enter coordinate x: ");
                double x = scanner.nextDouble();
                System.out.print("Enter coordinate y: ");
                double y = scanner.nextDouble();

                vertices[j] = new Point(x, y);
            }
            triangles[i] = new Triangle(vertices);
        }

        System.out.println("About the triangle:");
        for (int i = 0; i < numberOfTriangles; i++){
            System.out.println("Triangle " + (i+1) + ":");
            System.out.println("Perimeter " + triangles[i].calculatePerimeter());
            System.out.println("Type " + triangles[i].displayTriangleType());

            System.out.println("Enter a point to check if it's inside the triangle: ");
            double pointX = scanner.nextDouble();
            double pointY = scanner.nextDouble();

            Point pointCheck = new Point(pointX, pointY);

            if(triangles[i].isInsidePoint(pointCheck)){
                System.out.println("Inside the triangle.");
            }else {
                System.out.println("Outside the triangle.");
            }
        }
}
}