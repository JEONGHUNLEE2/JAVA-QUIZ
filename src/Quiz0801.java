import java.util.Random;
import java.util.Scanner;

public class Quiz0801
{

	public static void main(String[] args)
	{
		
		int com;
		int me;
		
		Scanner sc = new Scanner(System.in);
		Random random1 = new Random(3+1);
		
		
		while(true)
		{
			System.out.println("무엇을 내시겠습니까?(1:가위 2:바위 3:보 0:종료)");
			
			me = sc.nextInt();
			com = random1.nextInt(3+1);
			
			if(me == 1)
			{
				if(com == 1)
				{
					System.out.println("비겼습니다.");
				}
				else if(com == 2)
				{
					System.out.println("졌습니다.");
				}
				else if(com == 3)
				{
					System.out.println("이겼습니다.");
				}
			}
			if(me == 2)
			{
				if(com == 1)
				{
					System.out.println("이겼습니다.");
				}
				else if(com == 2)
				{
					System.out.println("비겼습니다.");
				}
				else if(com == 3)
				{
					System.out.println("졌습니다.");
				}		
			}
			if(me == 3)
			{
				if(com == 1)
				{
					System.out.println("졌습니다.");
				}
				else if(com == 2)
				{
					System.out.println("이겼습니다.");
				}
				else if(com == 3)
				{
					System.out.println("비겼습니다.");
				}		
			}
			if(me == 0)
			{
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}