import java.util.Scanner;

//�迭�� ���� ����ġ���� ������ ���� �ʾƵ� �˴ϴ�.
class SwitchTest1
{
	public static void main(String[] args) 
	{
		System.out.print("�¾ �ش�?");
		//���� ����� �� �� ���� ���ΰź��� ��� ������ ���Ⱑ ���� ����ϵ��� ����.

		
		/*
		Scanner in = new Scanner(System.in);
		final int stand_year = 1900; //���
		final int birth;

		birth = in.nextInt();
			
		switch ((int)((birth-stand_year)%12))
		//���� ��� : ���س⵵��ŭ ������ ���������� �ǽ�
		//���� : 1900�� ���� ����� ��� ����Ұ�(�����غ��� case ��¾��� �׳� ����)
		
		{
		case 0 : System.out.println("����Դϴ�.");	break; //������ ���� ����
		case 1 : System.out.println("�Ҷ��Դϴ�.");break;
		case 2 : System.out.println("ȣ���̶��Դϴ�.");break;
		case 3 : System.out.println("�䳢���Դϴ�."); break;
		case 4 : System.out.println("����Դϴ�."); break;
		case 5 : System.out.println("����Դϴ�."); break;
		case 6 : System.out.println("�����Դϴ�."); break;
		case 7 : System.out.println("����Դϴ�.");	 break;
		case 8 : System.out.println("�����̶��Դϴ�."); break;
		case 9 : System.out.println("�߶��Դϴ�."); break;
		case 10 : System.out.println("�����Դϴ�."); break;
		case 11 : System.out.println("�������Դϴ�.");	break;
		}
		*/


		Scanner in = new Scanner(System.in);
		final int birth;
		birth = in.nextInt();
			
		switch ((int)(birth%12))
		{
		case 3 : System.out.println("�������Դϴ�."); break;
		case 4 : System.out.println("����Դϴ�.");	break;
		case 5 : System.out.println("�Ҷ��Դϴ�.");break;
		case 6 : System.out.println("ȣ���̶��Դϴ�.");break;
		case 7 : System.out.println("�䳢���Դϴ�."); break;
		case 8 : System.out.println("����Դϴ�."); break;
		case 9 : System.out.println("����Դϴ�."); break;
		case 10 : System.out.println("�����Դϴ�."); break;
		case 11 : System.out.println("����Դϴ�.");	 break;
		case 0 : System.out.println("�����̶��Դϴ�."); break;
		case 1 : System.out.println("�߶��Դϴ�."); break;
		case 2 : System.out.println("�����Դϴ�."); break;
		}
		

	
	}
}
