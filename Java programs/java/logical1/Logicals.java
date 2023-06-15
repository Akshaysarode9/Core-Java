
import java.util.Scanner;

public class Logicals{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("the factorial is:"+fact);
		for(;num>0;num--){
        fact=fact*num;
	}
	    System.out.println(fact);
	// TODO Auto-generated method stub

	}
	
}


