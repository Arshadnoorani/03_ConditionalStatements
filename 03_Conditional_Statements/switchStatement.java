import java.util.*;
public class switchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        switch(num){
            case 1: System.out.println("samosa");
                        break;
            case 2: System.out.println("burger");
                        break;
            case 3: System.out.println("mango shake");
                        break;

            default: System.out.println("we wake up");
                    
        }
        sc.close(); 
    }
    
}
