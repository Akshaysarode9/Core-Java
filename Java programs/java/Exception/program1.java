//  13-12-2022
import java.util.Scanner;

public class program1{
    public static void main(String[] args) {
        System.out.println("main start");
        Scanner s=new Scanner(System.in);
        System.out.println("enter a");
        int a=s.nextInt();
        System.out.println("enter b");
        int b=s.nextInt();
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide zero");
        }
        System.out.println(" main end");
    }
}