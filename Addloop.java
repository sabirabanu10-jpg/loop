import  java.util.Scanner;
class Addloop
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner( System.in);
		System.out.println("ENTER THE  NUMBER ");
		int num = sc.nextInt();
int count=0;
		
		
	while(num>0)
	{
	  if(num>0)
			{
		      num/=10;
		     count=count+1;
		
			
		}
		
    }
		 System.out.println(" the addition of all number" +count);
		
		
	 }

		


}	
		
