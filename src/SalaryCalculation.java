import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the salary!");
        int salary = Integer.parseInt(scanner.nextLine());

        int salaryAfterFirstMonth = salary + (salary * 10 / 100); //2200
        int salaryAfterSecondMonth = salaryAfterFirstMonth + (salaryAfterFirstMonth * 10 / 100); //2420
        int finalSalary = salaryAfterSecondMonth + (salaryAfterSecondMonth * 10 / 100); //2662
        System.out.println("The final salary is - " + finalSalary);
    }
}
