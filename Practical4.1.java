import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count up to: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Count: " + i);
        }

        scanner.close();
    }
}
