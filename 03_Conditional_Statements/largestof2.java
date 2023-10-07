import java.util.*;
public class largestof2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        if(a==b){
            System.out.println("a and b are equal");
        }
        else{
            System.out.println("b is greater than a");
        }
        sc.close();
    }
    
}
