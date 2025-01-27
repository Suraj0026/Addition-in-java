import java.util.Scanner;
//here we add two number ,and these number is taken from user using scanner ;
public class addition {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("frist number: ");
        int a= sc.nextInt();
        System.out.print("second number: ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.print("sum of these number is equal to "+sum);


    }
}