package global.sesoc.oop.classMember;

class MemberTestBMI
{
	public static void main(String[] args) 
	{
		int array[];
		array = new int[5];
		array[0] = new MemberArray("��","110101");
		array[1] = new MemberArray("��","990909");
		array[2] = new MemberArray("��","880808");
 
		System.out.println(array[1].getName());

		//���ǻ��� : ������������ �����մϴ�.
		//         ���������������� �������� �͵��̰� ������������ ������μ� ���� ������.
		//         (#�������� .�޼ҵ���� ��Ʈ����Ŀ�̰�, �� ������ �͵��� ��ý�Ʈ���̶���)
		System.out.println(array[1].getName().length);
		System.out.println(array[1].getBirth().charAt(0));
		System.out.println(array[1].getName());

		//ù���� ȸ���� ����⵵�� int������ �о ������ּ���.
		System.out.println(Integer.parseInt(array[0].getBirth().substring(0,2)));		

	}
}