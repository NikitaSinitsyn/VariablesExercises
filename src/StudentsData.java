import java.util.Scanner;

public class StudentsData {
    public static void main(String[] args) {
        String firstName, lastName, middleName, city, fullEmailAddress, sex;
        byte years;
        int telephoneNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name!");
        firstName = scanner.nextLine();
        System.out.println("Please enter your last name!");
        lastName = scanner.nextLine();
        System.out.println("Please enter your middle name!");
        middleName = scanner.nextLine();
        System.out.println("Please enter your phone number!");
        telephoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter your email address!");
        fullEmailAddress = scanner.nextLine();
        System.out.println("Please enter your city!");
        city = scanner.nextLine();
        System.out.println("Please enter your sex!");
        sex = scanner.nextLine();
        System.out.println("Please enter your years!");
        years = scanner.nextByte();

        System.out.println("First name - " + firstName);
        System.out.println("Last name - " + lastName);
        System.out.println("Middle name - " + middleName);
        System.out.println("Telephone number - " + telephoneNumber);
        System.out.println("Email address - " + fullEmailAddress);
        System.out.println("City - " + city);
        System.out.println("Sex - " + sex);
        System.out.println("Years - " + years);

    }
}
