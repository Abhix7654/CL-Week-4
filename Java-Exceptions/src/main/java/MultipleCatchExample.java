import java.util.Scanner;

public class MultipleCatchExample {

    public static void getValueAtIndex(int[] arr, int index) {
        try {

            System.out.println("Value at index " + index + " : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] numbers = {2,3,5,67,7,8};

            System.out.print("Enter index to retrieve value: ");
            int index = scanner.nextInt();

            getValueAtIndex(numbers, index);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid index.");
        }
    }
}
