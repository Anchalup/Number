import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		int n,c,rem,arm=0;
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number");
	   n=sc.nextInt();
	   c=n;
	   while(n>0)
	   {
		   rem=n%10;
		   arm=(rem*rem*rem)+arm;
		   n=n/10;
	   }
    
	
	if(c==arm)
	System.out.println("AMstrong");
	else
		System.out.println("Not amstrong");
	}
}
