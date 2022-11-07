public class ExchangeThreeValues {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        a = a + b + c; // a = 60
        c = a - (b + c); // c =  60 - (20 + 30) = 10
        b = a - (b +c);// b = 60 - (20 + 10) = 30
        a = a - (b + c);// a = 60 - (30 +10) = 20

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
