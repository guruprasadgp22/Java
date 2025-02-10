package February;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        if(n < 0) {
            System.out.println("Please Enter a number greater than or eqaul to zero...");
        } else {
            int i=1;
            while (i<=n){
                fact *=i;
                i++;
            }
            System.out.println("Factorial of number " + n + " is : " + fact);
        }
    }
}
