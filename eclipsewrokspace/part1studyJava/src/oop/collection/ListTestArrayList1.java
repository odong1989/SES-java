package global.sesoc.oop.collection;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class ListTestArrayList1
{
	public static void main(String[] args) 
	{
		ArrayList<String> listString = new ArrayList<String>(); 
		//ArrayList<String> : �ڷ����� �����ؾ� �۵��ϱ⿡ <>�ȿ� string���� ����Ѵٰ� �����մϴ�.
		//new ArrayList<String>();�� ()�ȿ� ���ڸ� �� ������� 10ĭ�� �����ȴ�.(�̰��� �⺻&�ڵ������̴�.)
		//new ArrayList<String>(100);��� 100ĭ�� �����ȴ�.
		//ArrayList�� �迭�̶��� �Ǵٸ� ���翡��.

		System.out.println("listString : " + listString);

		listString.add("add");
		listString.add("bbb");
		//error list.add(bbb);//string���� ���Խÿ��� ""���ȣ�� ���Դϴ�.
		System.out.println("listString : " + listString);


		listString.add("ccc");
		listString.add("ddd");
		listString.add("ccc");
		listString.add("ddd");//�������� �ߺ����� ���� ������ ó������ �ʴ´�.

		System.out.println("listString : " + listString);

		System.out.println(listString); //[��¹��1]����� ����Ҹ� ��½�.
		System.out.println(listString.get(0)); //[��¹��2] get()�޼ҵ� - ���ϴ� ĭ�� ���.
		System.out.println(listString.size()); //[��¹��3]size()�޼ҵ� - ĭ�� ������ Ȯ���ϰ�.



		
		//[��¹��4] �����ȣ �������� ��µǴ� ���� �ȴٸ�? ������ ����ϸ� ������!
		//			(# for�ݺ��� & get()�޼ҵ�)
		System.out.println("�ݺ����� ���Ͽ� 1���� ����غ��ô�.");
		for (int printEA=0 ; printEA < listString.size() ; printEA++ )
		{					//null���� �ƴ�, �����Ͱ� �� ĭ�� ������ size()�޼ҵ尡 ���ִϱ� null==������ ���ص� �ȴ�.(#�������� ����.)
			System.out.println(listString.get(printEA));
		}


		System.out.println("���ϴ� ���ڿ��� �ִ��� Ȯ���ϱ�");
		//[��¹��5] for�ݺ��� & get()�޼ҵ�  
		for (int printEA=0 ; printEA < listString.size() ; printEA++ )
		{					//null���� �ƴ�, �����Ͱ� �� ĭ�� ������ size()�޼ҵ尡 ���ִϱ� null==������ ���ص� �ȴ�.(#�������� ����.)
			if(listString.get(printEA).equals("ccc"))
			{
				System.out.println(listString.get(printEA)+"��"+printEA+"��°�� �ֽ��ϴ�.");
				//break; //�������� ��� break�� �����̴�. 1���� ã�� �����̴ٰ�.(������ ã������ break�� ���� �ʿ䰡 ���ٰ��Ͻ�)
			}
		}
			
		//
				System.out.println("ccc���� �ִ� ĭ : "+listString.indexOf("ccc"));
				

		System.out.println("1��° ĭ�� ������ϴµ� 1��° ĭ�� �� : "+listString.remove(1));
		System.out.println(listString); //[��¹��1]����� ����Ҹ� ��½�.


		System.out.println(listString.indexOf(4));
		System.out.println(listString.contains("add"));
		listString.remove(0);
		System.out.println("0��° ĭ�� ������ ��� : "+listString);
		listString.remove("ccc");
		System.out.println("������� �߰ߵ� ccc�� �������� Ȯ�ε˴ϴ�. : "+listString);


		ArrayList<Integer> listInteger = new ArrayList<>();
		listInteger.add(new Integer(3));
		listInteger.add(new Integer(1));
		listInteger.add(new Integer(9));
		listInteger.add(new Integer(2));
		listInteger.add(2);
		System.out.println("listInteger �Է°�� : " +listInteger);

		Collections.sort(listInteger);
		System.out.println("Collections.sort(listInteger) ���ĸ��� ��� : " +listInteger);
			
		
		System.out.println("9�� ��ġ : " +listInteger.indexOf(new Integer(9)));
		
		
		listInteger.remove(new Integer(9));//���� "����9"�� �����ϱ� ���ؿ�! => �׷�  new Integer(9)���� ���ڰ� 9���� �˷��� �մϴ�.
		//		listInteger.remove(new Integer(9)); //�̷����ϸ� 9��° ĭ�� ������ ������...
		System.out.println("9�� �����Ǿ����� ���ô� : " +listInteger);

	
		//������ ���ڰ��� Ű����� �Է¹޾� �������ÿ�.
		System.out.println(listInteger);
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� : ");
		int n = scan.nextInt();
		
		if( listInteger.remove(new Integer(n)) )//������ ���� ���� ���� ������ Ȯ���� ��� �ٷ� ���� ����
		{										//.remove() �޼ҵ�� �����Ǹ鼭 ���� �ѹ� �������ݴϴ�(Ȯ���� �غ����� �ǵ��ϱ�?)
			System.out.println("���� �� ��� : " +listInteger);
		}
		else
		{
			System.out.println("������ ���� �����ϴ�.");
		}

	}
}