public class ExchangeTwoValues {
    public static void main(String[] args) {
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a now is - " + a);
        System.out.println("b now is - " + b);
    }
}
