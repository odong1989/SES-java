class Gugudan3
{
	public static void main(String[] args) 
	{
		//나의 방식 2중 for문
		/*
		for(int i=1;i<=9;i+=3)
		{
			for(int j=1;j<=9;j++)
			{
				System.out.print(i +" * "+ j +" = "+ i*j +"\t" );		 //1,4,7단
				System.out.print(i+1 +" * "+ j +" = "+ (i+1)*j +"\t" );	 //2,5,8단
				System.out.print(i+2 +" * "+ j +" = "+ (i+2)*j +"\n" );  //3,6,9단
			}
		}
		*/
		//나의 방식 종료

		/*선생님의 3중 for문*/
		for(int a=1;a<=7;a+=3)
		{
			for(int b=1;b<=9;b++)
			{
				for(int c=a;c<=a+2; c++)
				{
					System.out.print(c+"*"+b+"="+c*b+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	
//내가 한것들. 일단 세번 모두 실패됨. orz
		//3중 for문
//		int k=1; //
/*		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				for(int k=1;k<=3;k++){
				System.out.print(i +" * "+ j +" = "+ i*j +"\t" );	
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
*/
/*
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				for(int k=1;k<=3;k++){
				System.out.print(i +" * "+ j +" = "+ i*j +"\t" );	
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
*/



/*
		for(int i=1;i<=9;i++)
		{
			for(int k=1;k<=3;k++)
			{
				for(int j=1;j<=9;j++)
				{
				System.out.print(i +" * "+ j +" = "+ i*j +"\t" );	
				System.out.print("\n");
				}
			}
			System.out.print("\n");
		}
*/
	}
}
