import java.util.Scanner;
/*
10월15일 퀴즈1 : 환율 계산기
	1. 환전할 화폐를 선택할수 있도록 할 것.(1 : 달러, 2: 엔화 ,3:유로)
	2. 환전시 소수점 단위까지 나오도록 하세요
	3. 환전시 입력할 금액은 원화로 합니다.
	4. 아래의 오류조건을 실행하세요.(#아래조건해당시 프로그램 강제종료처리)
       [오류조건 해당시 처리방법]return; 을 통해 강제종료를 실행하세요.
       [오류조건] ①금액은 1 이상으로 합니다.(음수, 0 일시 에러로 취급한다.)         
               ②환전할 돈은 1,2,3 세개 숫자입력만 허용할 것.
*/

class Quiz_1_191015
{
	public static void main(String[] args) 
	{
		double WON;
		final double USD=1183.20; //1달러당 한화가격(19.10.15기준)
		final double EUR=1304.79; //1유로당 한화가격(19.10.15기준)
		final double JYP=10.92;	   //1엔당 한화가격(100엔당 아님!)(19.10.15기준)
			  double exchange;
		Scanner input =new Scanner(System.in);
		System.out.println("환전에 사용하실 금액을 입력하세요(단위 : 원)");
		WON = input.nextDouble();

		System.out.println("환전하실 화폐를 선택하세요.");
		System.out.println("1:달러($), 2:엔(¥), 3:유로(€)");

		switch (input.next())
		{
		case "1" : 
			exchange= WON / USD;
			System.out.print("환전되는 금액 : ");
			System.out.printf("%.3f",exchange);
			System.out.println("$(달러)입니다.");			
			break;

		case "2" : 
			exchange= WON / JYP;
			System.out.print("환전되는 금액 : ");
			System.out.printf("%.3f",exchange);
			System.out.println("¥(엔)입니다.");			
			break;
			
		case "3" : 
			exchange= WON / EUR;
			System.out.print("환전되는 금액 : ");
			System.out.printf("%.3f",exchange);
			System.out.println("€(유로)입니다.");			
			break;

		default :
			System.out.println("잘못된 입력입니다. 종료합니다");
			return;
		}

	}
}
