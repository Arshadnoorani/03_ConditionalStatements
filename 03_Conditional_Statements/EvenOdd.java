import java.util.*;
public class EvenOdd {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("this no. is even");
        }
        else{
            System.out.println("this no. is odd");
        }
        sc.close();
    }
    
}
