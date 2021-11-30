import java.util.Scanner;
class factorial{
	int factof(int x)
	{
		if(x==1)
		return 1;
	    else
		return x*factof(x-1);
	}
	public static void main(String args[])
	{
		factorial f=new factorial();
		Scanner s= new Scanner(System.in);
		int x;
		System.out.println("Enter the number : ");
		x=s.nextInt();
		System.out.println("The factorial of "+x+" is "+f.factof(x));
	}
}