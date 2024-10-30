import java.util.*;

public class A23_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // This is a Java program that calculates the area of a rectangle given its length and width.

        double length, width, area;
        System.out.printf("Enter length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.printf("Enter width of the rectangle: ");
        width = scanner.nextDouble();

        area = length * width;

        System.out.println("Area of rectangle: " + area);

        scanner.close();
    }
}
