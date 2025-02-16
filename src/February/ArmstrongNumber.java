package February;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int loc = n;
        int count = 0;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += pow(rem,count);
            n /= 10;
        }
        if(sum == loc){
            System.out.println(loc + " is a ArmStrong Number");
        } else  {
            System.out.println(loc + " is not a ArmStrong Number");
        }
    }
}
