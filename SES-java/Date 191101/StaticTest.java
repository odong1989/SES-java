class StaticTest
{
	public static void main(String[] args) 
	{
		StaticObject.printCnt();

		StaticObject testA=new StaticObject();//객체를 생성할 때에는 클래스명();으로 항상 생성을 실시한다.
		testA.printNum();
		testA.printCnt();

		StaticObject testB=new StaticObject();
		testB.printNum();
		testB.printCnt();


	}
}
