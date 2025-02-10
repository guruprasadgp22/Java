package February;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0){
            int i = 0;
            int sum = 0;
            int first = 0;
            int sec = 1;
            System.out.print("Fibonacci series : ");
            while(i < n) {
                i++;
                System.out.print(first + " ");
                sum = first + sec;
                first = sec;
                sec = sum;
            }
        }else {
            System.out.println(n + " is not a positive number.");
        }
    }
}
