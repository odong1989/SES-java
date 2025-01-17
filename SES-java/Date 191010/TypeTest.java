/**
//안내문서를 만들수 있도록 할 수 있다.
*/
public class TypeTest
{
	public static void main(String[] args)
	{
		byte a;
		short b;		
		int c;		//int범위
		long d;		//
		char e;		//char범위 : 0~65535
		
		char f;
		
		float x;
		double y;
		/*연습 오류
		a=200
		[에러내용] error: incompatible types: possible lossy conversion from int to byte
		
		*/
		a=127;
		/*연습 오류
		a=a+1;
		//형변환을 하지 않으면 byte가 감당할 수 있는 범위(127)를 벗어나서 에러가 난다.
		//자료형이 감당할 수 있는 값을 넘어가면 자바는 에러로 처리한다.
		*/

		a=(byte)(a+1);	//형변환을 해주었기에 에러는 안나지만 값이 -128으로 엉뚱하게 나오게 되니 주의해야 한다.
		
		//자바는 자동으로 큰 자료형을 작은 자료형에 넣으려하면 무조건 에러가 난다.
		//자료형의 크고 작음이 최우선적으로 따지게 되는 것이다.

		b=300;
		/* 연습 오류
		d=100000000000;
		*/

		e=65;
		System.out.println("e=" + e);
		System.out.println("e=" + (int)e);
		/*char형의 값을 숫자로 쓰고 싶다면 위의 (int)e처럼
		  int형으로 강제형변환 해서 쓸수도 있다.
		*/

		f='A';
		System.out.println("f=" + f);
		f='A'+1;
		System.out.println("f=" + f);

		//어떤 1개의 글자의 유니코드 알아내기 (#찾기 기찮거나 힘들떄)
		f='강';
		System.out.println("강의 유니코드" + (int)f);
		/*출력할 때 INT형으로 강제 형변환하여 코드번호 값을 확인하자.
		*/
		
		/*
			e=(int)65; 이거는 형변환이 아니라 삽질이다.
				   	   e는 "A"라는 값을 출력한다.
		*/

		
		/*
		long d;
		float x;
		double y;
		*/
		d=100000000000L;
		x=10000.000F;
		System.out.println("x=" + x);
		y=100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.000D;
		System.out.println("y=" + y);
/*[?]float형이면 뒤에 F, Double형이면 뒤에 D를 넣어야 하나요?
답변=>이론적으로 맞으며, 그렇게 해도 됩니다.
     하지만 굳이 할 필요가 없는것이 실수형의 경우 자동으로 double형으로 취급하기에 
     Long형이 int로 취급되어 자료형 오류가 나는 것과는 달리 오류가 나지 않습니다.

[내가 직접해본결과]fLOAT형은 F를 붙여줘야 할 것으로 보인다.
		float x;
		x=100000000000.000;
		이렇게 그냥 실했했더니
		error: incompatible types: possible lossy conversion from double to float
*/

		// = : 대입연산자이다.

/*1교시 끝----------------------------------------------------------------------------------------------*/



/*2교시 시작----------------------------------------------------------------------------------------------*/

		f='\u0065';
		System.out.println("f=" + f);		//'e'출력 , 본서 65페이지 참고.

		e='\n';
		/*사실 개행(\n)하면 커서는 바로 아래줄로 껑충뛰는 것과 같다.
		  즉 개행(\n) + 맨왼쪽으로 리턴(\r,캐리지 리턴)까지 해줘야하는 것이다.
		  println같은 함수들이 알아서 맨왼쪽으로 이동시켜주니 우리는 \n만 하면 되는걸로 착각할 수 있다.

		  나중에 프로그램을 만들때 이 사항을 한번쯤 알아두길 바란다.
		*/
		System.out.println("e=" + e);	
		System.out.println("e=" + (int)e);	

		//여러글자(문자열, String)
		System.out.println("ab\tcd\nefg\bx");//실행하면 탭(\t, 스페이스8칸 정도) 개행(\n), 백스페이스(\b)으로 g를 제거출력한다.
		//이와같은 문자열내에서 \이 입력되면 의도하지않아도 특수문자(이스케이프)키들이 발동하게 된다. 주의해야할 것이야.



	//실수형 설명시작!
	/*	float x;
		double y;	앞에 선언되있음.*/
		double g;
		x=1.2F;//f를 붙여서 float형으로 처리하자. 
		y=123.456;//D를 끝에 붙여도 되고, 안붙여도 됨. 어차피 더블형으로 기본처리라.
		y=1e3;//이것도 더블형값입니다. 의미 : 1*10^3(=1000) 1.5e-2 = 1.5*0.01 = 0.015

		g=10/3;
		System.out.println(g); //출력 : 3.0
		/*[?]왜 3.33333... 이 아닌가?
		=>숫자값들이 INT형이니 10/3 = 3만 남게 된것(#소수점 이하는 전부 del)
		*/

		g=10.0/3;
		System.out.println(g); //출력 : 3.333333333335
		/*나누는 값이든, 나눠지는 값이든 둘중 하나라도 소숫점 붙이면 소수점 계산이 적용된다.
		*/


		//불린형은 아래 두줄로 끝. 딱히 할게 없다고 여기서는 스킵.

		boolean h;
		h=true;

	}
}