

import java.util.Scanner;

 class logical1 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
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

