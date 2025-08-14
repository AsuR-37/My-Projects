import java.util.Scanner;

public class pldChecker
{

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Clean input

        if (isPalindrome(input)) {
            System.out.println("✅ The string is a palindrome.");
        } else {
            System.out.println("❌ The string is not a palindrome.");
        }

        scanner.close();
    }
}
