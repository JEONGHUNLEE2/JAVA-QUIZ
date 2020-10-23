
public class Quiz0701
{

	public static void main(String[] args)
	{
		double nResult = average(1,2,3);
		System.out.println("평균은 : " + nResult);
		
	}
	
	public static double average(int n1, int n2, int n3)
	{
		double avg = (double)(n1 + n2 + n3)/3;
		return avg;
	}
}
