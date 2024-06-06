import java.util.*;
public class Javabasics5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int value = a + b * a;
        System.out.println(name);
        System.out.println(value);
    }
}