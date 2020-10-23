import java.util.Scanner;

public class Quiz0603
{

	public static void main(String[] args)
	{
		
/*정수 하나를 입력받은 후 
  그 수의 팩토리얼 함수의 결과를 출력하는 프로그램을 
  while문을 이용하여 구현하시오. 
  출력예) 
  입력정수 : 5 
  5*4*3*2*1 = 120
*/
//		Scanner sc = new Scanner(System.in);
//		long num = sc.nextInt();
		
		int num1 = 0;
		int num2 = 5; 
		
		while(num1 < num2)
		{
			System.out.print(num2 + "*");
			num2--;
		}
	}

}