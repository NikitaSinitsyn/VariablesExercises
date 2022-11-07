import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter side A!");
        float sideA = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter side B!");
        float sideB = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter height!");
        float height = Float.parseFloat(scanner.nextLine());

        float area = (sideA + sideB) / 2 *height;
        System.out.println("The aria of the trapezoid is - " + area);
    }
}
