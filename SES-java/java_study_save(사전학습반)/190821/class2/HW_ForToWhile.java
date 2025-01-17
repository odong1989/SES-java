public class HW_ForToWhile {
	public static void main(String[] args) 
	{
		//--------------------------------------------190813---------------------------------
		//ForTest1
		//0 1 2 3 4
		/*
		for(int i =0;i<5;i++)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");
		*/

		int i =0;
		while(i<5)
		{
			System.out.print(i +" ");
			i++;
		}
		System.out.println("\n While문 0~4까지 출력.");
		//--------------------------------------------------------------------------------------------

		//1 2 3 4 5
		/*
		for(int i =1;i <=5 ;++i)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");
		*/

		i =1;
		while(i<=5)
		{

			System.out.print(i +" ");
			i++;
		}
		System.out.println("\n While문 1~5까지 출력.");
		//--------------------------------------------------------------------------------------------


		//0 2 4 6 8 
		/*
		for(int i =0;i<=8;i+=2)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");
		*/
		i=2;
		while(i<=8)
		{
			System.out.print(i +" ");
			i+=2;
		}
		System.out.println("\n While문 2,4,6,8까지 출력.");
		//--------------------------------------------------------------------------------------------

		//5 4 3 2 1 
		/*
		for(int i =5;i>=1;i--)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");
		*/
		i=5;
		while(i>=1)
		{
			System.out.print(i +" ");
			i--;
		}
		System.out.println("\n While문 5~1까지 출력.");
		//--------------------------------------------------------------------------------------------


		//10 20 30 40 50 60 70 80 90 100
		/*
		for(int i =0;i <=100 ;i+=10)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");
		*/
		i=10;
		while(i<=100)
		{
			System.out.print(i +" ");
			i+=10;
		}
		System.out.println("\n While문 10~100까지 출력.");
		//--------------------------------------------------------------------------------------------


		//10 100 1000 10000
		/*
		for(int i =1;i <=10000 ;i*=10)
		{
			System.out.print(i +" ");
		}
		System.out.println("반복후 한번만 실행할 내용.");
		*/
		i=10;
		while(i<=10000)
		{
			System.out.print(i +" ");
			i*=10;
		}
		System.out.println("\n While문 10~10000까지 출력.");
		//--------------------------------------------------------------------------------------------



		//----------------------------------------190820---------------------------------------------
		//198020_class1

		// 1+2+3+4+5+6+7+8+9+10
		/*
		int total=0;

		for(int cnt=1;cnt<11;cnt++){
			total=total+cnt;
		}
		System.out.println("1~10까지의 합계 : "+total );
		*/


		//1~10까지의 합계
		int total=0;
		int cnt=1;
		
		while(cnt<=10){
			total=total+cnt;
			cnt++;
		}
		System.out.println("1~10까지의 합계 : "+total );
		//--------------------------------------------------------------------------------------------



		//1~100이내의 홀수들의 합		
		/*
		total=0;
		for(int cnt=1;cnt<101;cnt+=2){
			total=total+cnt;
		//	System.out.println("cnt : " + cnt );
		//	System.out.println("total of 홀수 1~100 doing : "+total );
		}
		System.out.println("1~100이내의 홀수의 합 : "+total );
		*/

		total=0;
		cnt=1;
		while(cnt<=100){
			total=total+cnt;
			cnt+=2;
		}
		System.out.println("1~100이내의 홀수의 합 : "+total );
		//--------------------------------------------------------------------------------------------


		//1~100사이의 3의 배수의 합계
		/*
		total=0;
		for(int cnt=3;cnt<=100;cnt+=3){
			total=total+cnt;
		//	System.out.println("cnt : " + cnt );
		//	System.out.println("total of 홀수 1~100 doing : "+total );
		}
		System.out.println("1~100이내의 3의배수 합 : "+total );
		*/

		total=0;
		cnt=3;
		while(cnt<=100){
			total=total+cnt;
			cnt+=3;
		}
		System.out.println("1~100이내의 3의배수 합 : "+total );
		//--------------------------------------------------------------------------------------------


		//1~100사이의 3의배수&5의배수인 숫자들의 합계
		/*
		//나의 경우 15가 최소공통배수임을 보고 그에 따라 증감적용
		total=0;
		for(int cnt=15;cnt<=100;cnt+=15){
			total=total+cnt;
		//	System.out.println("cnt : " + cnt );
		//	System.out.println("total of 홀수 1~100 doing : "+total );
		}
		System.out.println("1~100이내의 3의배수&5의배수 합 : "+total );

		//1~100사이의 3의배수&5의배수인 숫자들의 합계
		//선생님의 방식
		total=0;
		for(int cnt=15;cnt<=100;cnt++){
			//조건문을 안에 넣어서 쓰는, 혼용도 가능토록 신경
			if(cnt%3==0&&cnt%5==0)
			{
				total+=cnt;
			}
		}
		System.out.println("1~100이내의 3의배수&5의배수 합 : "+total );
		*/

		total=0;
		cnt=15;
		while(cnt<=100){
			total=total+cnt;
			cnt+=15;
		}
		System.out.println("1~100이내의 3의배수&5의배수 합 : "+total );
		//--------------------------------------------------------------------------------------------
	

		//----------------------------------------190820---------------------------------------------
		//198020_class2, ForTest3
	
		/*
		total=0;
		//1~10까지의 합
		for(int cnt=1;cnt<=10;cnt++){
			if(cnt%4==0){
			//	break;		  //for을 종료한다
			//continue;		  //for문이 종료되는 것은 아니다. 대신, 밑의 문장들은 스킵처리 된다.
			//return;		  //치트키처럼 무조건 여기서 끝!
			System.exit(0);	  //현재프로그램 종료
			}
		total+=cnt;
		System.out.print(cnt+" ");
		}
		System.out.println("\n total : "+total);

		System.out.println("main()메소드의 나머지 부분");	
		*/

		
		//4의배수 숫자있으면 종료 하는 것으로 처리.
		total=0;
		cnt=1;

		while(cnt<=10){
			if(cnt%4==0){
			//	break;		  //for을 종료한다
			//continue;		  //for문이 종료되는 것은 아니다. 대신, 밑의 문장들은 스킵처리 된다.
			//return;		  //치트키처럼 무조건 여기서 끝!
			System.exit(0);	  //현재프로그램 종료
			}
		total+=cnt;
		System.out.print(cnt+" ");
		cnt++;
		}

		System.out.println("main()메소드의 나머지 부분");	



	}
}
