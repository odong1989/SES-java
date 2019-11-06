import java.util.Scanner;

class IfTest3 {
	public static void main(String[] args) {

		int year;
		Scanner scan = new Scanner(System.in);

		System.out.print("연도를 입력해주세요 : ");
		
		year = scan.nextInt();
		System.out.println("입력하신 연도는"+ year + "입니다\n");
		/* 윤년 구별 기준
		1) [해당조건] 4년마다 윤년이다.								=>4로 나누어 떨어지는 년도
		2) [제외조건] 100년마다 건넌뛴다.(=100으로 나눠 떨어지면 윤년아니다)	=>4로 나누어 떨어지지만 BUT! 100으로도 떨어지는 해
		3) [제외무효] 400년마다 무조건 윤년이다.(=400으로 나눠떨어짐 윤년이다)=>단,100으로 나뉘어져도 400으로 나누어 떨어지는 해는 윤년이다.
		*/

/*선생님*/ if((year%4==0 && year%100!=0)|| year%400==0){ 
		System.out.println(year+"는 윤년입니다");
		}
		else{
		System.out.println(year+"는 윤년이 아닙니다");
		}
	}
}
