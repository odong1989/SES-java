import java.util.Scanner;

class ArrayTest8_RE
{
		//[1]사용자에게 월, 일을 입력받는다
		//(예) 5월10일일 경우 
		// => 5, 10
		// * 본 코드에서는 년도도 입력받는 것으로 추가하였습니다.


		//[2] 입력하신 날짜는 00일째 입니다.
		//(예) 2월3일은 34일째의 날입니다.

		//비고 : 윤년을 고려해 주세요.
		//		윤년일 경우 29일로 반영하는 계산을 포함시켜주십시오.	
		//		10월22일 과제시에는 년도를 2019년으로 고정하지만,
		//		차후업글시에는 년도도 입력받도록 할 것입니다.

	public static void main(String[] args) 
	{
	    int YMD[]; 
		YMD = new int[3];	
		int days[] ={31,28,31,30,31,30,31,31,30,31,30,31}; //각 월별마다 날짜수
		Scanner input = new Scanner(System.in);
		int total=0;

		for(int i=0 ; i < YMD.length ; i++)
		{
			switch (i)
			{
				case 0 : 
				System.out.print("년도를 입력하세요");
				YMD[0]=input.nextInt();
				break;
					

				case 1 :
				System.out.print("월를 입력하세요");
				YMD[1]=input.nextInt();
				break;


				case 2 :
				System.out.print("일를 입력하세요");
				YMD[2]=input.nextInt();
				break;


				default : 
				System.out.print("switch error");
				break;

			}

		}

		if(YMD[0]%4==0 &&(YMD[0]%100!=0 || YMD[0]%400==0))
		{
			System.out.println(YMD[0] + "는 윤년입니다.");
			days[1]=29;
		}

		
		for(int j=0; j < YMD[1]-1 ;)
		{
			total+=days[j];
			 j++;
			if(j==YMD[1])
			total+=YMD[2];
		}

		System.out.printf("입력일 : %d년 %d %d은 \n %d일째 되는 날입니다.",YMD[0],YMD[1],YMD[2],total);


	}
}