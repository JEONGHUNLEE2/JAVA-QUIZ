import java.util.Scanner;

public class Quiz0612
{

	public static void main(String[] args)
	{
		/*문제 06-12
사용자로부터 2개의 정수를 입력받는다. 가령 2와 6을 입력받았다면
2+3+4+5+6을 구하는 프로그램 을 작성하라.
단 6과 2를 입력받는다면 6+5+4+3+2를 구
해야 한다.
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수");
		int n1 = sc.nextInt();
		System.out.println("두 번째 수");
		int n2 = sc.nextInt();
		int nResult = 0;
		
		if(n1 < n2)
		{
			//증가
			for(int i = n1; i<=n2; i++)
			{
				if(i == 2)
				{
					System.out.print(i + "+");
				}
				else
				{
					System.out.print(i + "+");
				}
				nResult = nResult + i;
			}
		}
		else
		{
			//감소
			
			for(int i = n1; i>=n2; i--)
			{
				if(i == 2)
				{
					System.out.print(i + "+");
				}
				else
				{
					System.out.print(i + "+");
				}
				System.out.print(i + "+");
			}
		}
	
	}

}
