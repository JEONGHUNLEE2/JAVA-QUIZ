import java.util.Scanner;

public class Quiz0602
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("국어 점수를 입력하시오.");
		int num1 = sc.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		int num2 = sc.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		int num3 = sc.nextInt();
		int average = (num1 + num2 + num3)/3;
		
		{
		if(average >= 90)
			System.out.println("A");
		else if(average >= 80)
			System.out.println("B");
		else if(average >= 70)
			System.out.println("C");		
		else if(average >= 50)
			System.out.println("D");
		else 
			System.out.println("F");
		}
		
		sc.close();
	}

}
