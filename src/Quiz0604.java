
public class Quiz0604
{

	public static void main(String[] args)
	{
/* Do~While문을 이용하여 
	1~1000까지 더해서 
	결과를 출력하는 프로그램을 작성하시오.
	실행결과도 아래와같이 출력하시오.
	예)1+2+3.......+1000 = 500500
*/
		int num1 = 1;
		
		do
		{
			System.out.print(num1);
			num1++;
			
			if(num1 < 1001)
			{
				System.out.print("+");
			}
			else
			{
				System.out.print("=");
			}
		}		
		while(num1 < 1001);
	}

}
