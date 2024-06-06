import java.util.*;
public class Javabasics6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number (a): ");
        int a = sc.nextInt();
        System.out.println("enter the second number (b): ");
        int b = sc.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("add = " + (add));
        System.out.println("sub = " + (sub));
        System.out.println("mul = " + (mul));
        System.out.println("div = " + (div));
        System.out.println("mod = " + (mod));
    }
}