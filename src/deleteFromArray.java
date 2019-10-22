import java.util.Scanner;

public class deleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input array size: ");
        int size = sc.nextInt();
        int[] input = new int[size];
        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Original Array: ");
        for (int i : input) System.out.print(i + ", ");
        System.out.println();
        System.out.println("Enter the value to delete from array: ");
        int dValue = sc.nextInt();
        int[] arr = new int[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (input[i] != dValue) {
                arr[index] = input[i];
                index++;
            }
        }
        System.out.println("After Array: ");
        for (int i : arr) System.out.print(i + ", ");
    }
}
