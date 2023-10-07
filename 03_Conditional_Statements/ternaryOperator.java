import java.util.*;
public class ternaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // //ternary operator
        // String type = ((num%2)==0)?"even":"odd";
        // System.out.println(type);
        // System.out.println("enter the marks of student");
        int marks = sc.nextInt();
        String reportCard = marks>=33?"pass":"fail";
        System.out.println(reportCard);
        // int m=sc.nextInt();
        // String n = m>=10?"true":"false";
        // System.out.println(n);
        sc.close();
    }
    
}
