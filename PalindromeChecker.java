import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String original = scanner.nextLine();

        // Remove spaces and convert to lowercase
        original = original.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(original).reverse().toString();

        if (original.equals(reverse)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
        scanner.close();
    }
}
