import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count up to: ");
        int max = scanner.nextInt();

        int i = 1; 

        while (i <= max) { 
            System.out.println("Count: " + i);
            i++; 
        }

        scanner.close();
    }
}
