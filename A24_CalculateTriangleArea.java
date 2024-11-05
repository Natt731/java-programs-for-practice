import java.util.Scanner;

public class A24_CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This is a Java program that calculates the area of a triangle given its base and height.
        double base, height, area;  

        System.out.printf("Enter the base width: ");    
        base = scanner.nextDouble();
        System.out.printf("Enter the height: ");    
        height = scanner.nextDouble();

        area = (base * height) / 2; 

        System.out.printf("Area of triangle: " + area);    
        
        scanner.close();
    }
}
