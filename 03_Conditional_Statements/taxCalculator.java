import java.util.*;
public class taxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();
        int txt;

        if(income<500000){
            txt = 0;
        }
        else if(income>=500000 && income<1000000){
            txt = (int)(income*0.2);//-->type casting becouse 0.2 is double
        }
        else{
            txt = (int)(income*0.3);
        }
        System.out.println("your txt is :"+ txt);
        sc.close();
    }
}