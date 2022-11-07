import java.util.Scanner;

public class DegreesConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter degree celsius!");
        float celsius = Float.parseFloat(scanner.nextLine());
        float fahrenheit = celsius * 9/5 + 32;
        System.out.println("Fahrenheit degree is - " + fahrenheit);

    }
}
