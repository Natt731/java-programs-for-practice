import java.util.Scanner;

public class A22_CalculateCircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This is a Java program that calculates the area of a circle given its radius.

        System.out.printf("Enter the radius of a circle: ");
        int radius = scanner.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}
