
import java.util.Scanner;
public class even {
    //odd or even no
    
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            
            System.out.println("Enter the value of size");
            int size=s.nextInt();
            int arr[]=new int[size];
            for (int i=0; i<arr.length; i++)
            {
                arr[i]=s.nextInt();
            }
            System.out.println("Using if-else");
            for (int i=0; i<arr.length;i++)
            {
                if (arr[i]%2==0)
                {
            System.out.println(" even "+arr[i]);
                }
                else
                {
                    System.out.println("no is odd "+arr[i]);
                }
        }
        System.out.println("Using switch statement");
        for (int i=0; i<arr.length;i++)
        {
        switch(arr[i]%2)
        {
        case 0:{
            System.out.println("no is even "+arr[i]);
            break;
        }
        case 1:{
            System.out.println("no is odd "+arr[i]);
            break;
        }
    }

    }
}
}