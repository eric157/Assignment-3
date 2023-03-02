package MyPackage;
import java.util.Scanner;
//Swap two numbers without the use of third variable.
public class Assign3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int x = sc.nextInt();
        System.out.println("Enter Number 2:");
        int y = sc.nextInt();
        System.out.println("Numbers Before Swap :\tx="+x+" & y="+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Numbers After Swap :\tx="+x+" & y="+y);
    }
}
