
public class Quiz0611
{

	public static void main(String[] args)
	{
/*1부터 100까지 정수중에서 짝수의 합을 구하라. 
 * 단 do~while문을 이용하라 */

		int num = 1;
		int nResult = 0;
		do
		{
			if(num % 2 ==0)
			{
				nResult = nResult + num;
			}
			num++;
		}
		while(num <=100);
		System.out.println(nResult);
	}
	
}
