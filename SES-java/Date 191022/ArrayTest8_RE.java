import java.util.Scanner;

class ArrayTest8_RE
{
		//[1]����ڿ��� ��, ���� �Է¹޴´�
		//(��) 5��10���� ��� 
		// => 5, 10
		// * �� �ڵ忡���� �⵵�� �Է¹޴� ������ �߰��Ͽ����ϴ�.


		//[2] �Է��Ͻ� ��¥�� 00��° �Դϴ�.
		//(��) 2��3���� 34��°�� ���Դϴ�.

		//��� : ������ ������ �ּ���.
		//		������ ��� 29�Ϸ� �ݿ��ϴ� ����� ���Խ����ֽʽÿ�.	
		//		10��22�� �����ÿ��� �⵵�� 2019������ ����������,
		//		���ľ��۽ÿ��� �⵵�� �Է¹޵��� �� ���Դϴ�.

	public static void main(String[] args) 
	{
	    int YMD[]; 
		YMD = new int[3];	
		int days[] ={31,28,31,30,31,30,31,31,30,31,30,31}; //�� �������� ��¥��
		Scanner input = new Scanner(System.in);
		int total=0;

		for(int i=0 ; i < YMD.length ; i++)
		{
			switch (i)
			{
				case 0 : 
				System.out.print("�⵵�� �Է��ϼ���");
				YMD[0]=input.nextInt();
				break;
					

				case 1 :
				System.out.print("���� �Է��ϼ���");
				YMD[1]=input.nextInt();
				break;


				case 2 :
				System.out.print("�ϸ� �Է��ϼ���");
				YMD[2]=input.nextInt();
				break;


				default : 
				System.out.print("switch error");
				break;

			}

		}

		if(YMD[0]%4==0 &&(YMD[0]%100!=0 || YMD[0]%400==0))
		{
			System.out.println(YMD[0] + "�� �����Դϴ�.");
			days[1]=29;
		}

		
		for(int j=0; j < YMD[1]-1 ;)
		{
			total+=days[j];
			 j++;
			if(j==YMD[1])
			total+=YMD[2];
		}

		System.out.printf("�Է��� : %d�� %d %d�� \n %d��° �Ǵ� ���Դϴ�.",YMD[0],YMD[1],YMD[2],total);


	}
}