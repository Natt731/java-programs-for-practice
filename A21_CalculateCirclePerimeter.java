import java.util.Scanner;

public class A21_CalculateCirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This is a Java program that calculates the perimeter of a circle given its radius.

            System.out.printf("Enter the radius of a circle: "); // Prompts the user to enter the radius of a circle. 
            double radius = scanner.nextDouble(); // Declared a variable double to store the radius of a circle.

            double perimeter = 2 * 3.14 * radius; // Formula for the perimeter of a circle.
            System.out.println("The perimeter of the circle is: " + perimeter); // Prints the perimeter.

            scanner.close();
    }
}