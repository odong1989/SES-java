//Calc클래스의 객체를 만들어사용(테스트)하는 클래스입니다.

class CalcTest
{
	public static void main(String[] args) 
	{
		Calc calTest = new Calc();
		int a[] = {1,2,3,4,5};
		calTest.setArray(a);
		System.out.println();

		int cnt = calTest.count();
		System.out.println("개수 : "+ cnt );

		int sum = calTest.sum();
		System.out.println("합계 : " + sum);


		calTest.sumAll(100);


		
		System.out.println("거듭제곱 결과 : " + calTest.power(2,3) );	
	}
}
