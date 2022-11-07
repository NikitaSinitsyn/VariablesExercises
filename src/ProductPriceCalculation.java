import java.util.Scanner;

public class ProductPriceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the price!");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the discount!");
        int discount = Integer.parseInt(scanner.nextLine());
        int finalPrice = (price * discount) / 100;
        System.out.println("The final price of the product is - " + finalPrice);
    }
}
