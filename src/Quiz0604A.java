
public class Quiz0604A
{

	public static void main(String[] args)
	{
/* Do~While문을 이용
1~1000까지 더해서 결과를 출력
예)1+2+3.......+1000 = 500500
*/
		int num = 1;
		int result = 0; // 곱셉은 * 1 하면 0되고 덧셈은 괜찮다.
		int max = 1000;
		
		do
		{
			if(num < max)
			{
				System.out.print(num + "+");
			}
			else
			{
				System.out.print(num + "=");
			}
			//System.out.print(num + "+"); => if 대체 (과정)
			result =  result + num;
			num++;
		}
		while (num <= max);
		
		System.out.println(result);
	}

}
