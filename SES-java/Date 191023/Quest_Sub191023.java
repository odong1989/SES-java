import java.util.Scanner;

class Quest_Sub191023 
{
	public static void main(String[] args) 
	{
		//반 학생들의 이름을 모두 배열에 저장해둡니다.
		//조를 편성할 인원을 입력합니다.
		//마지막조는 인원이 부족할수도 있습니다.
		//1인당 1개의 조에만 들어갈 수 있습니다.(중복, 누락은 불가)
		String unit[] ={"김성현", "김언주", "박선미", "박 완", "이진원", "진동환",
						"김보성", "문지연", "박민열", "심재형", "조은채",
						"강수현", "김영수", "김대균", "박세훈", "유송화", "정수환", "추경민",};

		
		String list[] = new String [unit.length];

		Scanner input = new Scanner(System.in);

		int number;	//input 저장
//		int UN; //UN : unit number;
//		int TN; //Team number;
//		int LTU; //last team unit;
//		int cnt = 0;

		System.out.print("1개의 조당 편성될 인원수 입력 : ");
		number = input.nextInt();
//		TN =  unit.length / number;
//		LTU = unit.length % number;

		
		System.out.println("1개의 조당 편성될 인원 숫자 : " + number);
//		System.out.println("조의 갯수  : " + (TN+);
		//		System.out.println("마지막조의 편성될 인원수 입력 : " + LTU);



		for(int count=0; count < unit.length ; count++)
		{
			list[count] = unit[(int)(Math.random()*18)];	

			for(int check = 0 ; check < count ; check++)
			{
				if (list[count].equals(list[check]))
				{
					count--;
				}
			}//for3 check end		
		}


		for(int count=0; count < list.length ;)
		{
			System.out.print(list[count] + " ");
			 count++;
			if(0==count%number)
			{
				System.out.println("");
			}
		}
		System.out.println("");

/*
		//조 넘버
		for(int teamEA=0; teamEA < TN ; teamEA++ )
		{
			System.out.print( (teamEA+1) +"조 : ");

			//1명 선택
			for(int select=0; select<number ; select++)
			{
//				selectname = unit[(int)Math.random()*unit.length];	
				list[cnt] = unit[(int)Math.random()*18];
			
				//중복체크	
				for(int check = 0 ; check < cnt ; check++)
					{
						if (list[cnt].equals(list[check]))
						{
							select--;
						}
					}//for3 check end		
	
				System.out.print(list[cnt] + " ");

				cnt++;
				
			}//for2 select END 
			System.out.println("");
		}//for1 teamEA END
*/


	}
}
