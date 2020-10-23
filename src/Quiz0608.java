
public class Quiz0608
{

	public static void main(String[] args)
	{
		for(int i = 2; i < 9; i=i+2)
		{
			System.out.println("------------------");
			
			for(int j = 0; j < 9;) //for(int j=1; j<=i; j++) 
			{
				if(i > j)
				{
					j=j+1;
				}
				else
					break;
				System.out.println((i + " x " + j + " = " + (i * j)));
			}
			//System.out.println("----------------------");
		}
	}
}
/// if(i%2 ==0)