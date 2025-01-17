//사용자 정의 자료형(Value Object)
//성적하나를 표현하는 자료형입니다.
//설계가 끝난 후 바로 먼저 제작되는 것 중 하나입니다.

class StudentVer4Capsure//설계도&속성(변수)를 설정하는 역할
{
	//자신만의 생성자를 만들어보기
	public StudentVer4Capsure(){
	name="이름없음";
	kor=0;
	eng=0;
	math=0;
	}

	//생성자를 오버로딩(동영이지만 파라미터는 다른)하기
	//오버로딩_1
	public StudentVer4Capsure(String nameIn){
	this.name=nameIn;
	}

	//오버로딩_2
	public StudentVer4Capsure(int korIn,int engIn, int mathIn){
	this();//같은 클래스내의 다른 생성자를 호출시 사용하는 방법입니다.
		   //초기화 설정을 위해public StudentVer4Capsure()를 호출한 것입니다.
	this.kor = korIn;
	this.eng = engIn;
	this.math= mathIn;
	}



	//오버로딩_3
	public StudentVer4Capsure(String nameIn,int korIn,int engIn, int mathIn){
	this(int korIn,int engIn, int mathIn);// public StudentVer4Capsure(int korIn,int engIn, int mathIn)를 호출한 것입니다.
	//this를 통한 호출방법은 1회만 가능합니다.
	this.name=nameIn;
	}





	//전날 10.31의 수업내용----------------------------------------------------
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
	//개방성정도   : <-개방적-----------------------------금지적->
	//상속허가여부 :    허가       허가          허가    |   불허가
	//접근지정자   : (public > protected > (default) > private)
	

	//캡술화step1.private로 선언하여 접근을 차단합니다. 
	//ⓐ속성 = 변수(멤버변수, 필드)	를 선언합니다.
	private String name;
	private int kor;
	private int eng;
	private int math;

	/*final을 쓰면 안되나요?
	  1번만 입력받고 고칠수가 없죠.
	  final은 누구도 바꿀수 없는 절대진리같은 경우에 활용합니다.
	*/
	/*	String name;은 public String name;인가요?
		아닙니다.
	default String name;이 정식명칭인데 default는 생략해도 되서
	지금까지 String name;으로 작성해도 정상작동 된것이죠.
	*/



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


	//국어 성적관련 메소드들-----------------------------------------------------------------
	public void setKor(int inputKor)
	{
	//캡슐화Step2. 값을 입력하는 방법을 메소드를 통하는 것으로 제한을 하였습니다.
	//이렇
		if(inputKor < 0 || inputKor > 100)
		{
			return;
		}
	
		this.kor = inputKor;
	}

	public int getKor(){
		return this.kor;//나를 부른 프로그램에게 내가 갖고 있는 국어성적값을 보내주는 것입니다.
	}
	//국어 성적 메소드들 종료-----------------------------------------------------------------


	//영어 성적관련 메소드들-----------------------------------------------------------------
	public void setEng(int inputEng)
	{
	//캡슐화Step2. 값을 입력하는 방법을 메소드를 통하는 것으로 제한을 하였습니다.
		if(inputEng < 0 || inputEng > 100)
		{
			return;
		}
	
		this.eng = inputEng;
	}

	
	public int getEng(){
		return this.eng;//나를 부른 프로그램에게 내가 갖고 있는 국어성적값을 보내주는 것입니다.
	}
	//영어 성적 메소드들 종료-----------------------------------------------------------------



	//수학성적메소드
	public void setMat(int inputMat)
	{
	//캡슐화Step2. 값을 입력하는 방법을 메소드를 통하는 것으로 제한을 하였습니다.
	//이렇
		if(inputMat < 0 || inputMat > 100)
		{
			return;
		}
	
		this.math = inputMat;
	}
		
	public int getMat(){
		return this.math;//나를 부른 프로그램에게 내가 갖고 있는 국어성적값을 보내주는 것입니다.
	}

	
	//총 처리 관련 메소드들-------------------------------------------------------------
	
	public int getTotal(){
		return (this.kor + this.eng + this.math);
	}	

	public double getAvg(){
		return (this.kor + this.eng + this.math) / 3.0;
	}	

	public String getGrade(){
		String grade=null;
		/*
		String 초기화에 대한 이야기
		1) String grade=null; = "String 변수는 어디도 가리키고 있지 않다."
		2) String grade="";   = "String 변수는 값이 없는 임의의 메모리를 가리키고 있다."
		*/

	/*
	if(getAvg()>=90)
	{
		grade="수";
	}
	else if(getAvg()>=80)
	{
		grade="우";
	}
	else if(getAvg()>=70)
	{
		grade="미";
	}
	else if(getAvg()>=60)
	{
		grade="양";
	}
	else
	{
		grade="가";
	}
	*/

/*박수현 선생님께
  "성적등급처럼 다양한 결과가 나올경우에는 switch문으로는 불가합니까?" 
  문의하니
  "되긴하겠지만 고민은 해야할 것이다"
  라고 답변주시면서 아래와 같이 시범을 보이시다.
*/
	switch((int)getAvg()/10){
	case 10: case 9 : grade="수"; break;
	case  8 : grade="우"; break;
	case 7 : grade="미"; break;
	case 6 : grade="양"; break;
	default : grade="가"; break;
	}
		return grade;

	}	

		


	/* 자료형을 만들경우 기본제공되는 main메소드는 필요가 없습니다.
	   실행시키려는 목적이 아니니까요.
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	*/
}
