package fact1;

public class Thecard 
{

	public static void main(String[] args) 
	{
		
		for(int count=1;count<=5;count++)
		{
			for(int i=5;i>=1;i--)
			{
				if(count==2)
				{
					if(i==1)
					{
						System.out.print(" ");
						continue;
					}
				}
				if(count==3)
				{
					if(i==1 || i==2)
					{
						System.out.print(" ");
						continue;
					}
				}
				if(count==4)
				{
					if(i==1 || i==2 || i==3)
					{
						System.out.print(" ");
						continue;
					}
				}
				if(count==5)
				{
					if(i==1 || i==2 || i==3 || i==4)
					{
						System.out.print("   ");
						continue;
					}
				}
				System.out.print(i);	
			}
				
				
			
			for(int j=1;j<=5;j++)
			{
				if(count==2)
				{
					if(j==1)
					{
						System.out.print(" ");
						continue;
					}
				}
				if(count==3)
				{
					if(j==1 || j==2)
					{
						System.out.print(" ");
						continue;
					}
				}
				if(count==4)
				{
					if(j==1 || j==2 || j==3)
					{
						System.out.print(" ");
						continue;
					}
				}
				if(count==5)
				{
					if(j==1 || j==2 || j==3 || j==4)
					{
						System.out.print(" ");
						continue;
					}
				}
				System.out.print(j);
			}
			System.out.println();
			
			
		}
		
		
		

	}
}

