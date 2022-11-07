import java.util.Scanner;

public class PracticeOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first integer number");
        int firstIntegerNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Write the second integer number");
        int secondIntegerNumber = Integer.parseInt(scanner.nextLine());

        int sumIntegerNumber = firstIntegerNumber + secondIntegerNumber;
        System.out.println("The sum of integer numbers is - " + sumIntegerNumber);
        int differenceIntegerNumber = firstIntegerNumber - secondIntegerNumber;
        System.out.println("The difference of integer numbers is - " + differenceIntegerNumber);
        int multiplicationIntegerNumber = firstIntegerNumber * secondIntegerNumber;
        System.out.println("The multiplication of integer numbers is - " + multiplicationIntegerNumber);
        int divisionIntegerNumber = firstIntegerNumber / secondIntegerNumber;
        System.out.println("The division of integer numbers is - " + divisionIntegerNumber);


        System.out.println("Write the first decimal fraction number");
        float firstDecimalFractionNumber = Float.parseFloat(scanner.nextLine());
        System.out.println("Write the second decimal fraction number");
        float secondDecimalFractionNumber = Float.parseFloat(scanner.nextLine());

        float sumDecimalFractionNumber = firstDecimalFractionNumber + secondDecimalFractionNumber;
        System.out.println("The sum of decimal fraction numbers is - " + sumDecimalFractionNumber);
        float differenceDecimalFractionNumber = firstDecimalFractionNumber - secondDecimalFractionNumber;
        System.out.println("The difference of decimal fraction numbers is - " + differenceDecimalFractionNumber);
        float multiplicationDecimalFractionNumber = firstDecimalFractionNumber * secondDecimalFractionNumber;
        System.out.println("The multiplication of decimal fraction numbers is - " + multiplicationDecimalFractionNumber);
        float divisionDecimalFractionNumber = firstDecimalFractionNumber / secondDecimalFractionNumber;
        System.out.println("The division of decimal fraction numbers is - " + divisionDecimalFractionNumber);
    }
}
