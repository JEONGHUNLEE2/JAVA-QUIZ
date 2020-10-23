import java.util.Scanner;

public class Quiz0606A
{

	public static void main(String[] args)
	{
		/*사용자로부터 다음 순서대로 정수를 입력받은 후 평균을 구하여 출력하는 프로그램을 작성하시오.
		
		1. 몇개의 정수를 입력할 지 사용자로부터 입력받는다. -> for
		2. 입력받은 숫자만큼 정수를 입력받는다.(1번에서 3이라고 입력했다면 3개의 정수를 입력받아야 한다)
		3. 입력받은 숫자들의 평균값을 구하여 출력한다. 평균값은 소수점 이하까지 계산해야 한다. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 정수를 입력하시겠습니까?");
		
		int num = sc.nextInt();
		int nResult = 0;
		double nAverage = 0.0;  // 이건 왜 하는거였지...
		
		for(int i=0; i<num; i++) //숫자가 정해지면 for
		{
			int nTemp = sc.nextInt();
			nResult = nResult + nTemp;
		}
		nAverage = (double)nResult / num;
		
		System.out.println(nAverage);
	}

}
