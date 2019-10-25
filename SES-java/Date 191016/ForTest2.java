class ForTest2 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1; i<=10; i++){
			sum=sum+i;
		}

		System.out.println("1~10 합계 : " + sum);

		sum=0;
		//int sum=0;하면 똑같은 변수선언이 한 번더 되므로 에러로 처리된다. 
		//혹시라도 깜박하고 해서 부끄부끄 하지 말자 -_-)+
		for(int i=1; i<=100; i++){
			sum=sum+i;
		}

		System.out.println("1~100 합계 : " + sum);	
	

		//연습 목록
		//연습①1~100 중에서 홀수의 합계
		//연습②~100 중에서 3의 배수이거나 5의 배수인 수의 합계
		//연습③부터 정수들의 합계를 구한다. 이때 합계가 4000이 넘는 순간의 숫자는?


		//연습①1~100 중에서 홀수의 합계
		sum=0;
		for(int i=1; i<=100;i++){
			if(i%2 == 1)
			{
				continue;
			}
			sum=sum+i;
		}
		System.out.println("1~100의 홀수들의 합계 : " + sum);	
		//선생님의 조언 : I+=2;으로 했으면 IF문 쓸 필요가 없었는데 아쉽다.



		//연습②~100 중에서 3의 배수이거나 5의 배수인 수의 합계
		sum=0;
		System.out.print("체크한 3,5의배수 :  ");
		for(int i=1; i<=100;i++){
			if(i%3 == 0 || i%5 == 0 )
//			if(i%3 != 0 && i%5 != 0 )으로 조건식을 해도 된다.
			{
			sum=sum+i;
			System.out.print(i+" ");
			}
		}
			System.out.println("1~100의 3이나 5의 배수들의 합계 : " + sum);	


		//선생님의 연습2번풀이
		/*
		sum=0;
		System.out.print("체크한 3,5의배수 :  ");
		for(int i=1; i<=100;i++){
			if(i%3 != 0 && i%5 != 0 )//결국은 같은 조건식이다.
			{
			continue;
			}
			sum=sum+i;
			System.out.print(i+" ");
		}
			System.out.println("1~100의 3이나 5의 배수들의 합계 : " + sum);			
		*/

		
		//연습③부터 정수들의 합계를 구한다. 이때 합계가 4000이 넘는 순간의 숫자는?
		sum=0;

		for(int i=1; i<=100;i++){
			sum=sum+i;
			if(sum>=4000)
			{
				System.out.println("4000이 넘는 시점의 sum 값 : " + sum);
				System.out.println("합계가 4000이 넘는 순간 합계에 사용한 숫자 :" +i );	
				break;
			}
			//계산과정확인용
			//System.out.print("i :" + i + " ");
			//System.out.println("sum :" + sum + " ");
		}


		//선생님 버전 연습3	
		sum=0;
		int i_out=1;
		for(; sum<=4000 ; i_out++){
			sum=sum+i_out;
		}
		System.out.println("1~" + i_out +"까지의 합계 : " + sum);
		//일단 무조건 실행시키고 보자! 같은 경우에는 while문이 더 많이 쓰인다고 합니다.
		/*☆☆☆☆☆
		  내가 파악한 선생님의 for반복문 코딩을 보면
   	  	  선생님의 경우 for의 조건부분을 하나의 if문처럼 활용하고 있다는 점이다.
		  여

		*/



	}
}
