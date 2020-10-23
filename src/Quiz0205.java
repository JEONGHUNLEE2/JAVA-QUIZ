import java.util.Scanner;

public class Quiz0205
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num1 * num2;
		
		if (num3 >= 0)
		{
			System.out.println(num3);
		}
		else
		{
			System.out.println(-1 * num3);
		}
		
		
		sc.close();
	}

}
