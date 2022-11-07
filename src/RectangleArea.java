import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter side A!");
        int sideA = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter side B!");
        int sideB = Integer.parseInt(scanner.nextLine());

        int area = sideA * sideB;
        System.out.println("The area of the rectangle is - " + area);
    }
}
