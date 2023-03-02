package MyPackage;
import java.util.Scanner;
//Write a program to calculate the sum of the digits of a 3-digit number.
public class Assign3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        while (n>0){
            int digit = n % 10;
            ans = ans + digit;
            n /= 10;
        }
        System.out.println(ans);
    }
}
