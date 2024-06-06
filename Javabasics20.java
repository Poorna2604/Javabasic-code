import java.util.*;
public class Javabasics20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of first natural number(n):");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}