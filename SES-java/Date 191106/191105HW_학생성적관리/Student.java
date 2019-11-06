//원재 : StudentVer3Capsure


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


	//국어 성적관련 메소드들-----------------------------------------------------------------
	public void setName(String inputName)
	{
		this.name = inputName;
	}

	public String getName(){
		return this.name;//나를 부른 프로그램에게 내가 갖고 있는 국어성적값을 보내주는 것입니다.
	}
	//국어 성적 메소드들 종료-----------------------------------------------------------------
	
	
	
	//국어 성적관련 메소드들-----------------------------------------------------------------
	public void setKor(int inputKor)
	{
		if(inputKor < 0 || inputKor > 100)
		{return;}
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
		if(inputEng < 0 || inputEng > 100){return;}
		this.eng = inputEng;
	}

	
	public int getEng(){
		return this.eng;//나를 부른 프로그램에게 내가 갖고 있는 국어성적값을 보내주는 것입니다.
	}
	//영어 성적 메소드들 종료-----------------------------------------------------------------



	//수학성적메소드
	public void setMath(int inputMath)
	{
		if(inputMath < 0 || inputMath > 100)
		{return;}
		this.math = inputMath;
	}
		
	public int getMath(){
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

		switch((int)getAvg()/10)
		{
			case 10: case 9 : grade="수"; break;
			case  8 : grade="우"; break;
			case 7 : grade="미"; break;
			case 6 : grade="양"; break;
			default : grade="가"; break;
		}
		return grade;
	}	
}
