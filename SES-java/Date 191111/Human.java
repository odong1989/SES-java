//3교시

abstract class Human {//abstract(추상)클래스는 객체를 못 만듭니다.
	public abstract void say();//실행하자마자 아무일도 안한다.바디가 없으니까(#"추상메소드" 라고 부릅니다.)
							 //{}를 안쓰고 추상메소드하는 이유는 하위 클래스인 Elgish등이 무조건 오버라이딩을 실시하도록 한다.
/* 메서드 오버라이딩
*/
}

class English extends Human{
	public void say() {System.out.println("YES");}//오버라이딩
}

class Korean extends Human{
	public void say() {System.out.println("예");}
}

class Japanese extends Human{
	public void say() {System.out.println("하이!");}
}
