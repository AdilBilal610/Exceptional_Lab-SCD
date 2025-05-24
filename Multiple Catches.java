public class MultipleCatchesExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5] / 0); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds error occurred.");
        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }
    }
}
