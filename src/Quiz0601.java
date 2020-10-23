import java.util.Scanner;

public class Quiz0601
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두 개를 입력하시오.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1 - num2) > 0)
		{
			System.out.println(num1 - num2);
		}
		else
			System.out.println((num1 - num2) * -1);
		
	}   // 05. 콘솔 입력과 출력 참고
}
