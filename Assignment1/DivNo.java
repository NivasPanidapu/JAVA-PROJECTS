import java.util.Scanner;

public class DivNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int nr = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int dr = scanner.nextInt();

        try {
            divideNumbers(nr, dr);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static void divideNumbers(int nr, int dr) {
        if (dr == 0) {
            throw new ArithmeticException("Division by zero");
        }

        int result = nr / dr;
        System.out.println("Result of division: " + result);
    }
}