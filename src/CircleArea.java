import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle!");
        double radius = Float.parseFloat(scanner.nextLine());
        double area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is - " + area);
    }
}
