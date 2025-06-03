import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = scanner.nextDouble();

        double increaseAmount;
        int percentage;

        if (salary <= 400.00) {
            percentage = 15;
        } else if (salary <= 800.00) {
            percentage = 12;
        } else if (salary <= 1200.00) {
            percentage = 10;
        } else if (salary <= 2000.00) {
            percentage = 7;
        } else {
            percentage = 4;
        }

        increaseAmount = salary * percentage / 100.0;
        double newSalary = salary + increaseAmount;

        System.out.printf("New salary: %.2f\n", newSalary);
        System.out.printf("Increase amount: %.2f\n", increaseAmount);
        System.out.printf("In percentage: %d %%\n", percentage);

        scanner.close();
    }
}
