/*
	양수를 입력받아 1~입력수 까지의 합계구하기.
*/
import java.util.Scanner;

class WhileTest3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int number, sum;


		do
		{
			System.out.print("양의 정수를 입력하세요.");
			number=scan.nextInt();
		}while(number <=0);

		sum=0;
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		System.out.println("1~"+number+"까지의 합계는 "+sum);
	}
}
