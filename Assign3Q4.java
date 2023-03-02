package MyPackage;
//Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
//i) both the conditions 'a < 50' and 'a < b' are true.
//ii) at least one of the conditions 'a < 50' or 'a < b' is true.
public class Assign3Q4 {
    public static void main(String[] args) {
        int x = 55;
        int y = 70;
        System.out.println(x < 50 && x < y);
        System.out.println(x < 50 || x < y);
    }
}
