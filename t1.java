import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Remove case sensitivity and spaces
        String cleaned = original.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check if palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not is  a palindrome.");
        }

        scanner.close();
    }
}
