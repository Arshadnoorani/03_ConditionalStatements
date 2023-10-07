import java.util.*;

public class calculatorSwicth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a \n");
        int a = sc.nextInt();
        System.out.print("enter the value of b \n");
        int b = sc.nextInt();
        System.out.println("enter tha operator:");
        char operator = sc.next().charAt(0);// -->use for input one charector form user
        System.out.print("final result is: ");
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("operator is not match");
        }
        sc.close();
    }

}
