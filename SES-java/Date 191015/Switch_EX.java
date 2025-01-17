/*
문자형 변수를 하나 만들고, 문자형 변수에 x를 넣으시오
switch는 
경우1) x일 경우 "n은 1입니다." 출력
경우2) y일 경우  "n은 2입니다." 출력
이외경우) "n은 그 외의 수입니다." 출력
*/


class Switch_EX 
{
	public static void main(String[] args) 
	{
	
	/*문자형 값을 입력받을 경우의 Switch----------------------------------------------------------------------------*/

		String n ="x";

		switch (n) 
		//조건식에 값을 넣을 때 숫자는 정수형을 넣어주세요(실수형은 불가합니다.#float, double 불가) 
		//java 10버전 이후에는 조건식에 String형도 넣을 수 있습니다.
		//byte, short형도 사용가능합니다.(단, int으로 형변환해야 합니다)
		//
		{
		case "x":
			System.out.println("n은 1입니다.");
			break;//이거 없으면 아래의 case들까지 실행해 버린다.
			//OR연산처럼 아래의 것들도 참으로 실행시킬려고 
			//break를 빼는 경우도 있다.
		case "y":
			System.out.println("n은 2입니다.");
			break;
		default :
			System.out.println("n은 그 외의 수입니다.");
			break;
		}


//=============================================================================
/*
문자형 변수 n를 하나 만들고, 문자형 변수에 x를 넣으시오
switch는 
경우1) x일 경우 "n은 1입니다." 출력
경우2) y일 경우  "n은 2입니다." 출력
이외경우) "n은 그 외의 수입니다." 출력
*/
		System.out.println("내생각 191024");
		
		String nn = "x";
		
		switch (nn)
		{
		case "x" : System.out.println("n은 x를 갖고 있습니다.");
				 break;
		case "y" : System.out.println("n은 x를 갖고 있습니다.");
				 break;	
		default : System.out.println("n은 switch문에 미설정한 값을 갖고 있습니다.");
				 break;
		}

		System.out.println("내생각-정수숫자 191024");
		
	
		int qq = 20;
		switch (qq)
		{
//		case qq>20 : System.out.println("qq는 30보다 크다");
//					 break;
//switch의 case는 참/거짓(boolean)값을 사용할 수 없다.
		case 21 : System.out.println("qq는 30보다 작다");
				 break;	
		default : System.out.println("n은 switch문에 미설정한 값을 갖고 있습니다.");
				 break;

		}

	}
}
