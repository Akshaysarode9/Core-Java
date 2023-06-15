import java.util.Scanner;
public class whileEx1{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter starting number");
		int Start=s.nextInt();
		System.out.println("Enter a end number");
		int end=s.nextInt();
		while(Start<=end)
		{
			if (Start%2==0)
			{
				System.out.println(Start);
				{
					Start++;
			}

	}
		}
	}
}
