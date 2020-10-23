
public class Quiz0702
{

	public static void main(String[] args) // 문제
	{
		int max = getMax(1,2,3);
		System.out.println("큰 수 : " + max);
	}

	public static int getMax(int n1, int n2, int n3) // 아래가 식
	{
		int max = 0;
		
		if(n1 > n2)
		{
			max = n1;
		}
		else
		{
			max = n2;
		}
		if(max < n3)
		{
			max = n3;
		}
		
		return max;
	}
	
}
/* max = num1;
if(max < num2)
{
max = num2;
}
	*/