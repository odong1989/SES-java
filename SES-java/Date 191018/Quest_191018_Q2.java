class Quest_191018_Q2 
// 과제2. 100의 모든 약수를 출력하세요.
{
	public static void main(String[] args) 
	{			
		System.out.println("과제2. 100의 모든 약수를 출력하세요.");

		// measure : 약수
		for(int measure=1; measure <=100 ;measure++)
		{
			if(100%measure == 0)
			{
				System.out.print(measure+" ");
			}
		}
	}
}
