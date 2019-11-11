//3교시

class HumanTest
{
	public static void main(String[] args) 
	{
		test(new Korean());//상속과는 관계가 없습니다.
		test(new English());//상속과는 관계가 없습니다.	
		test(new Japanese());//상속과는 관계가 없습니다.	
		/*이처럼 다양한 입력자들을 처리해야 하는 경우 우리는 2가지의 선택지가 있다.
		방법1. 오버로드로 일일이 선언한다(#노가다의 기운)
		방법2. 다형성을 활용하여 처리
		*/
	
	}

	//방법2.상속자인 human클래스를 입력하여(#"다형성"이라고 표현합니다) 
	//		아래의 2가지 조건을 만족시켜야 발동합니다.
	//[조건1]상속관계여야 합니다.
	//[조건2]하위클래스에 포함되어야 합니다.
	//--------------------------------------------------------------

	//방법2.
	public static void test(Korean ob)
	{
		ob.say();	
		if(ob instanceof Korean)
		{//Korean시에만 적용할 별개의 실시내용 기입.
		}
	}




	//방법1. 오버로드로 일일이 무식하게 지정한다.----------------------------
	//그냥 단순하게 메소드를 통한 호출정도이죠.
	/*
	public static void test(Korean ob)
	{
		ob.say();
	}

		public static void test(English ob)
	{
		ob.say();
	}

		public static void test(Japanese ob)
	{
		ob.say();
	}
	*/
}
