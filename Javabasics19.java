import java.util.*;
public class Javabasics19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range (n):");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.println(counter + " ");
            counter++;
        }
    }
}