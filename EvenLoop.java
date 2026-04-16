import java.util.Scanner;
class Evenloop
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner( System.in);
		System.out.println("ENTER THE START NUMBER ");
		int start = sc.nextInt();
		System.out.println("ENTER THE END NUMBER ");
		int end=sc.nextInt();
		
	for( int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				
			System.out.println("THE Even Numbers:" +i);
			
			}
		}
		 }
		
	 }

		


		