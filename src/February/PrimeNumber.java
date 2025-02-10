package February;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                ans = false;
                break;
            }
        }

        String res = ans == true ? " a Prime Number" : "Not a Prime Number";
        System.out.println(n + " is " + res);
    }
}
