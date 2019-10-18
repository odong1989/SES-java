import java.util.Scanner;


class LoopTest 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int s = 0;


		//정수 5개 입력받아 합계구하기
/*
		System.out.println("입력된 값 5개들을 덧셈을 실시합니다.");
		for(int i=0;i<5;i++)
		{
		System.out.println((i+1)+"번째 값을 입력해주세요.");
		n=scan.nextInt();
		s+=n;
		}
		System.out.println("합계 : "+ s);
*/
		
		//정수 반복입력받아 합계. 0입력하면 종료
		/*이번 경우에는 while문, 그것도 무한반복while(true)가 어울린다.
		  왜냐하면 사용자들마다 언제 종료할지 알 수 없다.
		  대신 종료시점(0을 입력)은 알 수 있으니 이를 조건으로 맞춘다.
		*/
		/*
		System.out.println("종료않는 계산기입니다. 종료를 원하시면 0을 입력하세요.");
		while(true)
		{
		System.out.println((i+1)+"번째 값을 입력해주세요.");
		n=scan.nextInt();

		if(n ==0) break;
		s+=n;
		}
		System.out.println("합계 : "+ s);
		*/

		//정수 반복입력받아 합계. 이번에는 do{}while문이다.

		System.out.println("종료않는 계산기입니다. 종료를 원하시면 0을 입력하세요.");
		do{
		System.out.println("값을 입력해주세요.");
		n=scan.nextInt();

		if(n ==0) break;
		s+=n;
		
		System.out.println("합계 : "+ s);	
		
		}while(true);
		
	

	}
}
