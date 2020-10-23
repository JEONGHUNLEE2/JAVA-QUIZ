import java.util.Scanner;

public class Quiz0610A
{

	public static void main(String[] args)
	{
/*사용자로부터 5개의 정수를 입력
 * 받아서 합을 구하여 출력
만약 입력받는 숫자가 1미만의 숫자라면 재입력을 요구
그래서 1이상의 정수 5개를 입력받아야 프로그램이 완성된다.
*/
		Scanner sc = new Scanner(System.in);		
		
		int nResult = 0;
		for(int i=0; i<5;) // 이건 5번 돌겠다는거고 이안에 저 sc.nextInt가 5번 누르겠다는 의미
		{
			System.out.println("숫자를 입력해 주세요");
			int nTemp = sc.nextInt();
			if(nTemp < 1)
			{
				System.out.println("다시 입력해 주세요");
				continue;
			}
			nResult = nResult + nTemp;
			i++;
		}
		System.out.println(nResult);
		
	}
}

/*int nResult = 0;
 *int nCount = 0;
 *while(true) / (nCount <5)
 *{
 *System.out.println(숫자를 입력);
 *int nTemp = sc.nextInt();
 *if (nTemp <1)
 *    continue;
 *nResult = nResult + nTemp;
 *nCount++;*/



