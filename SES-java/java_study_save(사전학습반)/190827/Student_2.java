//사용자가 정의하는 새로운 자료형이다.
//스트링형 2개, 인트형 3개를 묶는 사용자가에게 맞춤형 자료형을 만들어 보자

//즉, "새로운 자료형의 정의"가 되겠다.

class Student_2 //String등을 쓸 수 있는 이유는 public class가 자동으로 생략선언 되어 있기 때문이다.
{
	//학생 1명의 정보를 담는 자료형을 만드는게 목표이다.
	//1.속성정의(field, 멤버변수)
	//접근지정자(public > protected > (default) > private)

	private String num; 
	private String name; // String num, name; 으로 선언해도 되지만, 위처럼 각줄로 하면 주석을 달수 있기에 따로하기를 권장한다고 하심.

	private int kor,eng, math ; //이렇게 선언해도 되지만 주석을 통할 설명에 제약이 생길수도 있다.
	//private로 설정하여 의도치않은 엉뚱한 값이 안들어도록한다.
	//값은 메소드를 통하여 입력하고 테스트를 하자.


	//1.5생성자(#기본값을 설정하는 역할)
	//case1.아무것도 안 넣어도 초기값이 입력되는 경우
	public Student_2(){//파라미터가 아무것도 없는 경우에는 기본생성자라고 하며 클래스 객체 생성과 동시에 설정한 값으로 초기화를 실시한다.
		//공란으로 둘 경우 당장은 아무것도 안하지만 힙(heap)에서는 필요한 공간을 확보하여 
		//스탠바이를 한다.
		kor=10;
		eng=10;
		math=10;
	}

	public Student_2(String n, String na, int k, int e, int m){
			num=n;
			name=na;
			kor = k;
			eng = e;
			math = m;
	}

	//2.기능정의(메소드)
	public void setName(String n){
		name = n ;
	}

	public String getName(){
		return name;
	}


	public void setKor(int k){
	// 보이드는 리턴을 않고 그냥 끝낸다. 쌀쌀맞은 친구지... -_-
		if(k>=0 && k<=100)kor = k;
		else System.out.println("0~100만 입력하세요.");
	/*선생님의 경우
		if(k<0 || K > 100){
			System.out.println("점수가 위치를 벗어남");
			return;
			}
			kor=k; //0~100이외값들은 return 시점에서 끝나버리니 입력될 걱정이 없다!
	*/
	}

	public void setScore(int a, int b, int c){
	//귀찮아! 국영수 모두의 값을 입력받도록 만들자는 취지로 묶어입력 만들기.
		if(a>=0 && a<=100)kor = a;
		else System.out.println("국어성적을 0~100만 입력하세요.");
		
		if(b>=0 && b<=100)eng = b;
		else System.out.println("영어성적을 0~100만 입력하세요.");
		
		if(c>=0 && c<=100)math = c;
		else System.out.println("수학성적을 0~100만 입력하세요.");
	
	}

	public double getAverage(){
		double a= (kor+eng+math) /3.0;
		return a;
	}


	public int getKor(){
		return kor;
	}


	void printName(){
		System.out.println("이름: " + name);
	}




	//[여담] 메인은 사용하지 않는다. 어디까지나 활용가능하도록 클래스정의만하는 것이니까.

}
