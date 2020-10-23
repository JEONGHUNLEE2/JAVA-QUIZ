
public class Quiz0607
{

	public static void main(String[] args)
	{
		/*문제 06-07 for (조건) while(트루,펄스)
 * 
1이상 100미만의 정수중에서 
7의배수와 9의배수를 출력
하는 프로그램을 작성하라.
단, 7의 배수이면서 동시에 9의 배수인 정수는 한번만 출력해야 한다.
*/ 
		for(int i =1; i < 100; i++)
		{
			if(i % 7 == 0 || i % 9 ==0)
			{
				System.out.println(i);
			}
			//if(i%9==0)  --> 위에꺼랑 합침(과정) 
			//System.out.println(i);
			
		}
	}

}
