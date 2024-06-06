import java.util.*;
public class Javabasics11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the person age:");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("adult");
        }else if((age <= 16) && (age >=13)){
            System.out.println("teenager");
        }else{
            System.out.println("child");
        }
    }
}