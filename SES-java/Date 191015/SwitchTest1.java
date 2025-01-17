import java.util.Scanner;

/*
	문제 : 출생년도를 입력하면 그에 따라 12띠를 출력합니다.
	조건	: switch문을 활용합니다.

*/
//[여담]배열을 배우면 스위치문을 일일이 쓰지 않아도 됩니다.

class SwitchTest1
{
	public static void main(String[] args) 
	{
		System.out.print("태어난 해는?");
		//나의 방식의 좀 더 나은 블로거분의 방식 비교위해 묻기가 먼저 출력하도록 설정.

		
		/*
		Scanner in = new Scanner(System.in);
		final int stand_year = 1900; //쥐띠
		final int birth;

		birth = in.nextInt();
			
		switch ((int)((birth-stand_year)%12))
		//나의 방식 : 기준년도만큼 차감후 나머지연산 실시
		//약점 : 1900년 이전 사람의 경우 실행불가(실제해보니 case 출력없이 그냥 종료)
		
		{
		case 0 : System.out.println("쥐띠입니다.");	break; //간략히 보기 좋죠
		case 1 : System.out.println("소띠입니다.");break;
		case 2 : System.out.println("호랑이띠입니다.");break;
		case 3 : System.out.println("토끼띠입니다."); break;
		case 4 : System.out.println("용띠입니다."); break;
		case 5 : System.out.println("뱀띠입니다."); break;
		case 6 : System.out.println("말띠입니다."); break;
		case 7 : System.out.println("양띠입니다.");	 break;
		case 8 : System.out.println("원숭이띠입니다."); break;
		case 9 : System.out.println("닭띠입니다."); break;
		case 10 : System.out.println("개띠입니다."); break;
		case 11 : System.out.println("돼지띠입니다.");	break;
		}
		*/


		Scanner in = new Scanner(System.in);
		final int birth;
		birth = in.nextInt();
			
		switch ((int)(birth%12))
		{
		case 3 : System.out.println("돼지띠입니다."); break;
		case 4 : System.out.println("쥐띠입니다.");	break;
		case 5 : System.out.println("소띠입니다.");break;
		case 6 : System.out.println("호랑이띠입니다.");break;
		case 7 : System.out.println("토끼띠입니다."); break;
		case 8 : System.out.println("용띠입니다."); break;
		case 9 : System.out.println("뱀띠입니다."); break;
		case 10 : System.out.println("말띠입니다."); break;
		case 11 : System.out.println("양띠입니다.");	 break;
		case 0 : System.out.println("원숭이띠입니다."); break;
		case 1 : System.out.println("닭띠입니다."); break;
		case 2 : System.out.println("개띠입니다."); break;
		}
		
	}
}
