//BubbleSort : 버블정렬
//boolean형 Flag를 추가하여 
//정렬을 할 필요가 없다고 판단될 경우 임의종료(break)를 할 수 있도록 수정하였다.

class Sort1BubbleSortFlagAdd
{
	public static void main(String[] args) 
	{
		//변수등 선언
		int ar[];
		int temp=0;
		boolean flag;
		int randomEA=1000;	
		
		
		//for
		for (int randomInput=0; randomInput<randomEA ; randomInput++)
		{
			ar[randomInput] = (int)(Math.random() * randomEA);
		}





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
			flag=true; //지나갔나 안지나갔나 확인용.

			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(ar[Comparison] > ar[Comparison+1])
				{
					temp=ar[Comparison];
					ar[Comparison]=ar[Comparison+1];
					ar[Comparison+1]=temp;
					flag=false; //지나갔나 안지나갔나 확인용.

					//개인적으로 변경과정을 확인위한 중간체크용 출력반복문입니다.(진행에 영향없음)-----------------------------------
					for (int print=0; print <ar.length; print++)
					{		
						System.out.print(ar[print]+" ");
					}		
					System.out.println("");
					//개인적으로 변경과정을 확인위한 중간체크용 출력반복문입니다.(진행에 영향없음)-----------------------------------

				}//if end
			}//Comparison end 
			//flag가 true이면 더이상 정렬을 할 필요가 없으니 이만 종료한다.
			//flag가 flase이면 아직은 정렬을 해야 한다는 의미이니 계속진행하라를 결정한다.
			if(flag) break;

			
			
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
