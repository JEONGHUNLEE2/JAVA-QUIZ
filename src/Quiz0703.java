
public class Quiz0703
{

	public static void main(String[] args)
	{
		int min = getMin(1,2,3);
		System.out.println("가장 작은 수 : " + min);
	}
	
	public static int getMin(int n1, int n2, int n3)
	{
		int min = 0;
		
		if(n1 < n2)
		{
			min = n1;
		}
		else
		{
			min = n2;
		}
		if(min > n3)
		{
			min = n3;
		}
		
		return min;
	}

}
