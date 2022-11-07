import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number!");
        int lastDigit = Integer.parseInt(scanner.nextLine());

        if (lastDigit % 10 == 7)
            System.out.println("The last number is 7!");
        else
            System.out.println(" The last number is not 7");
    }
}
