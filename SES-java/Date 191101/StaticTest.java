class StaticTest
{
	public static void main(String[] args) 
	{
		StaticObject.printCnt();

		StaticObject testA=new StaticObject();//��ü�� ������ ������ Ŭ������();���� �׻� ������ �ǽ��Ѵ�.
		testA.printNum();
		testA.printCnt();

		StaticObject testB=new StaticObject();
		testB.printNum();
		testB.printCnt();


	}
}