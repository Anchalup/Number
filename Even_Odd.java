import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int no;
		no=sc.nextInt();
		
		if(no%2==0)
			System.out.println("Even.");
		else
			System.out.println("Odd.");
	
	}

}
