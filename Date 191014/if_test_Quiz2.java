import java.util.Scanner;

class if_test_Quiz2
{
	public static void main(String[] args) 
	{
	/* 아르바이트 급여를 계산합니다.
		- 근무시간을 입력받습니다.
		- 50시간까지는 시간당 10000원,
		  50시간외의 초과시간은 10% 더 지급합니다.
	*/

		System.out.println("근무시간을 입력하세요");
		int pay;
		int time;
		Scanner input = new Scanner(System.in);
		time=input.nextInt();
		if(time > 50 )
		{
			pay= ((time-50)*11000) + 50 * 10000;
		}
		else
		{
			pay= time *10000;
		}

		System.out.printf("근무시간 : %d \n", time);
		System.out.printf("알바급여 : %d \n", pay);

	}
}
