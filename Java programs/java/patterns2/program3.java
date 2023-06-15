import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
int m =65; //Assci value of 65 is A
for(int i=1;i<=n;i++)
{
    for (int j=1;j<=n;j++)
    {
        if (i>=j) //i<=j
        {
            System.out.print((char)m+" ");
            m++; //m+=1
}
        else
        {
            System.out.print(" "+" ");
        }
    }
    System.out.println();
}   
    } 
}
