//BubbleSort : 버블정렬

class Sort1BubbleSort
{
	public static void main(String[] args) 
	{
		//변수등 선언
		int ar[] = {10,5, 1, 60, 35, 40, 90, 15, 3, 80};
		int temp=0;

		//현재 상태 출력
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
			System.out.println("");

		//값 교환
		//Benchmark : 기준점
		for (int Benchmark=ar.length; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : 비교점, 기준점과 비교를 위해 기준점이외의 나머지 배열들을 선택.
			System.out.println("Benchmark : "+Benchmark);
			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(ar[Comparison] > ar[Comparison+1])
				{
					temp=ar[Comparison];
					ar[Comparison]=ar[Comparison+1];
					ar[Comparison+1]=temp;

					for (int print=0; print <ar.length; print++)
					{		
						System.out.print(ar[print]+" ");
					}		
					System.out.println("");
				}//if end
			}//Comparison end 
			System.out.println("");
		}//interchangeSort end

		//변경된 상태 출력
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
		System.out.println("");
	}
}
