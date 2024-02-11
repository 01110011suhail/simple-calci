import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BigDecimal a, b, result;

        // Input the first number
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextBigDecimal();

        // Input the second number
        System.out.println("Enter the second number: ");
        b = sc.nextBigDecimal();

        // Input the operation choice
        System.out.println("Enter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int op = sc.nextInt();

        // Perform the selected operation
        switch (op) {
            case 1:
                result = a.add(b);
                System.out.println("Result = " + result);
                break;

            case 2:
                result = a.subtract(b);
                System.out.println("Result = " + result);
                break;

            case 3:
                result = a.multiply(b);
                System.out.println("Result = " + result);
                break;

            case 4:
                if (!b.equals(BigDecimal.ZERO)) {
                    result = a.divide(b);
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
