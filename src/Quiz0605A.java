import java.util.Scanner;

public class Quiz0605A
{

	public static void main(String[] args)
	{
/*문제 06-05
사용자로부터 
계속해서 정수를 입력받는다.
단 0을 입력받게되면 기존에 입력받은 모든 정수를 
더한 후 결과를 출력하시오.
*/
		//반복하는데 조건이 있으면 while(조건)
		//반복하는데 조건이 없으면 for?
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		while(true)
		{
			int num = sc.nextInt();
			result = result + num;
			
			if(num == 0)
			{
				System.out.println(result);
				break;
			}
		}
	}

}
