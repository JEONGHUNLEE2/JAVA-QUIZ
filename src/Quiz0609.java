import java.util.Scanner;

public class Quiz0609
{

	public static void main(String[] args)
	{
		// 사용자로부터 정수 하나를 입력받은 후 
		//그 수에 해당하는 구구단을 역순으로 출력하시오.
		
		Scanner sc = new Scanner(System.in);		
		int num1 = sc.nextInt();
	
		for(int i = num1; i == num1; i=i+1) 
		{
			for(int j = 9; j >= 1; j--)
			{
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			
		}
	}
}

// int nInput = sc.nextInt();
// 역순 for(int i = nInput; i>0; i--)