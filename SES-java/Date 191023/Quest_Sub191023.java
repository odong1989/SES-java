import java.util.Scanner;

class Quest_Sub191023 
{
	public static void main(String[] args) 
	{
		//�� �л����� �̸��� ��� �迭�� �����صӴϴ�.
		//���� ������ �ο��� �Է��մϴ�.
		//���������� �ο��� �����Ҽ��� �ֽ��ϴ�.
		//1�δ� 1���� ������ �� �� �ֽ��ϴ�.(�ߺ�, ������ �Ұ�)
		String unit[] ={"�輺��", "�����", "�ڼ���", "�� ��", "������", "����ȯ",
						"�躸��", "������", "�ڹο�", "������", "����ä",
						"������", "�迵��", "����", "�ڼ���", "����ȭ", "����ȯ", "�߰��",};

		
		String list[] = new String [unit.length];

		Scanner input = new Scanner(System.in);

		int number;	//input ����
//		int UN; //UN : unit number;
//		int TN; //Team number;
//		int LTU; //last team unit;
//		int cnt = 0;

		System.out.print("1���� ���� ������ �ο��� �Է� : ");
		number = input.nextInt();
//		TN =  unit.length / number;
//		LTU = unit.length % number;

		
		System.out.println("1���� ���� ������ �ο� ���� : " + number);
//		System.out.println("���� ����  : " + (TN+);
		//		System.out.println("���������� ������ �ο��� �Է� : " + LTU);



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
		//�� �ѹ�
		for(int teamEA=0; teamEA < TN ; teamEA++ )
		{
			System.out.print( (teamEA+1) +"�� : ");

			//1�� ����
			for(int select=0; select<number ; select++)
			{
//				selectname = unit[(int)Math.random()*unit.length];	
				list[cnt] = unit[(int)Math.random()*18];
			
				//�ߺ�üũ	
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