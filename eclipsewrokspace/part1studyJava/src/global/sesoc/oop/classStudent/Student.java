package global.sesoc.oop.classStudent;

//사용자 정의 자료형(Value Object)
//성적하나를 표현하는 자료형입니다.
//설계가 끝난 후 바로 먼저 제작되는 것 중 하나입니다.

class Student//설계도&속성(변수)를 설정하는 역할
{
	/*             객체
		ⓐ속성(변수)	|	ⓑ행동(메소드)
	----------------┼-------------------------
		1) 이름		|
		2) 학번 		|
		3) 국어성적	|
		4) 영어성적	|
		5) 수학성적	|
	*/

	
	//ⓐ속성 = 변수(멤버변수, 필드)	
	String name;
	int kor;
	int eng;
	int math;
	//실제업계에서 근무시 이렇게 작성하지는 않아요.
	//잠금장치 없는 집처럼 보안성 0점이니까요.(#그래서 캡슐화를 하죠)




	//ⓑ기능 = 메소드
	//사용자들의 view를 편하게 하기위해 출력기능을 만들기로 하였다.
	public void printST(){
	System.out.println(this.name + this.kor+ this.eng + this.math);
/*this를 안써도 결과가 같은데, 꼭 써야 하나요?
=>사람으로치면 동명이인이 있을시 헷갈리는 것처럼,
  SQL에서 구분하는 값을 제공하여 구분하는 것처럼
  만에하나라도 동명의 변수가 생성되어 컴퓨터가 헷갈릴 수도 있는 경우를 막고자 대비하는 것입니다.
  여기서 그 객체(this)는 
  로드하여 활용하는 StudentTest의 Student형 변수가 보관하는 값들을 가리킵니다.
*/
	}


	
	/* 자료형을 만들경우 기본제공되는 main메소드는 필요가 없습니다.
	   실행시키려는 목적이 아니니까요.
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	*/
}
