/*191016 퀴즈-다시 한번 안보고 짜보기

  목표 : 22~122번까지의 유니코드 문자를 출력하세요.
  조건 : (1)1줄당 5개씩 출력하세요.
        (2)하나의 변수는 하나의 역할만 하도록 하세요.
*/
class Quiz_191016_Repeat
{
	public static void main(String[] args) 
	{
		/*
		char count  : 1줄당 출력개수를 센다.
					  5이 되면 개행하도록 한다.

		char output	: 출력할 유니코드들의 번호들이다.	
		*/
		char count =0;
		for(char output=22; output<=122 ; output++)
		{
			if(count == 5 )
			{
			System.out.print("\n-----------------------------------------------\n");
			count=0;
			}
			System.out.printf("%3d",(int)output);
			System.out.print(" : " + output+" |");
			count++;
		}


	}
}
