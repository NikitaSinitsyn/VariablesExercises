import java.util.Scanner;

public class NumberManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter four-digit number number!");
        int num1 = Integer.parseInt(scanner.nextLine());
        int d = num1 % 10; // 1234 -> d=4
        num1 = num1 / 10; // num_1=123
        int c = num1 % 10; // c=3
        num1 = num1 / 10; // num_1=12
        int b = num1 % 10; //b=2
        int a = num1 / 10; //a=1
        int sum = a + b + c + d;
        System.out.println("The sum of numbers is - " + sum);
        System.out.println("dbca is - " + d + b + c + a);
        System.out.println("dcba is - " + d + c + b + a);
    }
}
