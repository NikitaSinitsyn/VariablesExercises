import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount in BGN! ");
        double bgn = Double.parseDouble(scanner.nextLine());
        double eur = bgn * 1.96;
        System.out.println("The result of the conversion into euros is equal to - " + eur);

    }
}
