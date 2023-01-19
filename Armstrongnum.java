import java.util.Scanner;
import java.lang.Math;;

public class Armstrongnum {
    public static void main(String[] args) {
        System.out.println("enter a  number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1= num;
        int n =0;
        while(num!=0)
        {
            num = num/10;
            n++;
        }
        int temp = num1;
        int arm=0;
        while(temp!=0)
        {
            int digit = temp % 10;
            arm += Math.pow(digit, n);
            temp = temp/10;      
        }
        if(num1 == arm)
        {
            System.out.println(arm);
            System.out.println(num1+ " is Armstrong number");
        }
        else System.out.println(num1+ " is not Armstrong number");
        sc.close();
    }
}
