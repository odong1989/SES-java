class ForTest1_utf8
{
	public static void main(String[] args) 
	{

		// 0 1 2 3 4 
		for(int i = 0; i<5; i++) //for_1
		{
			System.out.print(i +" ");
		}
			System.out.println(" ");		


/* 위의 진행을 흐름디버깅표(가제)
   
for_1의 진행디버깅		  
  ___|_i_|__T/F__|_ print__|_________
     | 0 | TRUE  |    0    | 
     | 1 | TRUE  |    1    | 
     | 2 | TRUE  |    2    | 
     | 3 | TRUE  |    3    | 
     | 4 | TRUE  |    4    | 
     | 5 | FALSE |  (종료)  | 
*/

	
		// 1 2 3 4 5
		for(int i = 1; i<=5; i++)
		{
			System.out.print(i +" ");
		}
			System.out.println(" ");		


		// 5 4 3 2 1 
		for(int i = 5; i > 0; i--)
		{
			System.out.print(i +" ");
		}
			System.out.println(" ");		
	

		// 10 20 30 40 50 
		for(int i = 10; i<=50; i+=10)
		{
			System.out.print(i +" ");
		}
			System.out.println(" ");		
	

		// 1 3 5 7 9
		for(int i = 1; i<=9; i=i+2)
		{
			System.out.print(i +" ");
		}
			System.out.println(" ");		
	

		// 1 2 3 4 6 7 8 9
		for(int i = 1; i<=4; i++)
		{
			System.out.print(i +" ");
		}
		for(int i = 6; i<=9; i++)
		{
			System.out.print(i +" ");
		}
			System.out.println(" ");		
	

		// 1 10 100 1000 10000
		for(int i = 1; i<=10000; i*=10)
		{
			System.out.print(i +" ");
		}
			System.out.println(" ");		
	
	}
}
