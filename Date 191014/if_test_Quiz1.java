import java.util.Scanner;

class if_test_Quiz1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,max;
		
		System.out.println("입력하는 3개의 값 중에서 가장 큰 값 출력하기");
		System.out.println("a값 입력");
		a=input.nextInt();
		System.out.println("b값 입력");
		b=input.nextInt();
		System.out.println("c값 입력");
		c=input.nextInt();

		//내가한 방법
		if(a>b) max=a;
		else max=b;
		
		if(c>max) max = c ;
	
		
		/*선생님의 경우 초기화한 max값에서부터 시작하여 비교한다.

		  아래와 같은 방법을 권하는 이유는 변수의 개수가 많을 경우 
		  위처럼 변수들이 얽혀서 비교되는 형식은 헷갈리게 되기 쉽기 때문.

		  max 값을 초기화 할때는 
		   max = 0; 보다는 
		   max = interger.MIN_VALUE;
		  이 좋다. 
		  
		  입력값 3개 모두 음수시 max=0 초기값은 구별을 못한다.
		  (#컴파일시 안 나오는 에러의 요소가 될 수 있다.)
		*/

		/*
		max = integer.MIN_VALUE;
		// max = 0;으로 하면 음수들만 입력시 비교가 안되어 에러의 위험이 있지.
		//int형의 
		if(max < a){
			max = a;
		}
		if(max < b){
			max = b;
		}
		if(max < c){
			max = c;
		}
		*/
		System.out.println("max value : "+max );



	}
}
