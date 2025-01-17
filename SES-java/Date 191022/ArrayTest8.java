import java.util.Scanner;

class ArrayTest8 
{
		//[1]사용자에게 월, 일을 입력받는다
		//(예) 5월10일일 경우 
		// => 5, 10

		//[2] 입력하신 날짜는 00일째 입니다.
		//(예) 2월3일은 34일째의 날입니다.

		//비고 : 윤년을 고려해 주세요.
		//		윤년일 경우 29일로 반영하는 계산을 포함시켜주십시오.	
		//		10월22일 과제시에는 년도를 2019년으로 고정하지만,
		//		차후업글시에는 년도도 입력받도록 할 것입니다.

	public static void main(String[] args) 
	{
		final int year= 2000;	
		int days[] ={31,28,31,30,31,30,31,31,30,31,30,31}; //각 월별마다 날짜수

		int day_total=0;
		int day=0;
		int month=0;
		Scanner input= new Scanner(System.in);
		
		System.out.print("월을 입력해주세요 : ");
		month=input.nextInt();

		System.out.print("일을 입력해주세요 : ");
		day=input.nextInt();
		
		/*
		윤년 계산
		윤년일 경우 2월을 days[1]=29으로 일자를 변경한다.
		(기본설정 28일/윤년 아닐경우를 기준으로 함)
		*/

		if(year%4==0){ //4년마다를 1차 조건으로 보고 구분실시.
			if(year%100!=0 && year%400==0)
			  //100년마다 떨어지는 경우는 윤년이 아닌것으로 처리.
			  //단, 400년마다인 경우는 윤년인 것으로 처리.
			{
				System.out.printf("%d년은 윤년입니다.(2월은 29일 적용)\n",year);
				days[1]=29;
				System.out.println("2월 : " +days[1]);
			}
			else System.out.printf("%d년은 윤년이 아닙니다.(2월은 28일 적용)\n",year);
		}
		else System.out.printf("%d년은 윤년이 아닙니다.(2월은 28일 적용)\n",year);



		for(int i=0 ; i<month-1 ; i++)
		{
			day_total +=days[i];
		}
		day_total += day;

		System.out.printf("%d월 %d일은 %d째 되는 날입니다.", month, day, day_total);

	}
}
