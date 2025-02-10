package February;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        String ans = rev == temp ? "a Palindrome" : "not a Palindrome";
        System.out.println(temp + " is " + ans);
    }
}
