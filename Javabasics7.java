import java.util.*;
public class Javabasics7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number (a):");
        int a = sc.nextInt();
        System.out.println("enter the second number (b):");
        int b = sc.nextInt();
        System.out.println((a == b));
        System.out.println((a != b));
        System.out.println((a < b));
        System.out.println((a > b));
        System.out.println((a <= b));
        System.out.println((a >= b));
        System.out.println((a == b) && (a != b));
        System.out.println((a == b) || (a != b));
        System.out.println(! (a != b));
    }
}