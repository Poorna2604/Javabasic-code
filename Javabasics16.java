import java.util.*;
public class Javabasics16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number A:");
        int A = sc.nextInt();
        System.out.println("enter the number B:");
        int B = sc.nextInt();
        System.out.println("enter the operator:");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
            System.out.println("Addition is:"+ (A + B));
                    break;
            case '-':
            System.out.println("Substraction is:"+ (A - B));
                    break;
            case '*':
            System.out.println("Multiplication is:"+ (A * B));
                    break;
            case '/':
            System.out.println("Division is:"+ (A / B));
                    break;
            case '%':
            System.out.println("Modulas is:"+ (A % B));
                break;
            default: 
                    System.out.println("wrong operator");
        }
    }
}