import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt(); // Throws InputMismatchException if input is not integer
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input must be an integer.");
        } finally {
            scanner.close();
        }
    }
}
