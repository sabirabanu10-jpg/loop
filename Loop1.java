import  java.util.Scanner;
class Loop1
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner( System.in);
		System.out.println("ENTER THE NUMBER :");
		int start = sc.nextInt();
		int count=0;
		while (start>0)
		{
			if(start>0)
			{
				start/=10;
				count=count+1;
				}
				
		}
		
		System.out.println(" number of digits :" +count);
	
	
	
	
	
	
	
	
}
}
		
		
