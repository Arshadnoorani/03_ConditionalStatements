import java.util.*;

public class if_else1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age of human: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult: drive,vote");
        }
        // if (age > 13 && age < 17) {
        //     System.out.println("teenager");
        // }
        else if (age > 13 && age < 17) {
            System.out.println("teenager");
        } 
        else {
            System.out.println("not adult");
        }
        sc.close();
    }
}