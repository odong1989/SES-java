//과제1. 정수를 입력받아 1부터 그 수까지의 합계를 구하세요
import java.util.Scanner;

class Quest_191018_Q1 
{
	public static void main(String[] args) 
	{
		int total=0;
		int number=0;
		Scanner input = new Scanner(System.in);

		System.out.println("과제1-정수를 입력받아 \n 1부터 그 수까지의 합계를 구하세요 입니다.");
		System.out.println("정수값을 입력하세요");

		number = input.nextInt();
		for(int n=0; n<=number; n++)
		{
			total+=n;
		}

		System.out.println("1부터 " + number+" 까지의 총합 : " + total);

	}
}
