package global.sesoc.oop.collection;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class ListTestArrayList1
{
	public static void main(String[] args) 
	{
		ArrayList<String> listString = new ArrayList<String>(); 
		//ArrayList<String> : 자료형을 선언해야 작동하기에 <>안에 string형을 사용한다고 선언합니다.
		//new ArrayList<String>();의 ()안에 숫자를 안 넣을경우 10칸이 생성된다.(이것은 기본&자동설정이다.)
		//new ArrayList<String>(100);경우 100칸이 생성된다.
		//ArrayList는 배열이랑은 또다른 존재에요.

		System.out.println("listString : " + listString);

		listString.add("add");
		listString.add("bbb");
		//error list.add(bbb);//string형을 기입시에는 ""대괄호로 감쌉니다.
		System.out.println("listString : " + listString);


		listString.add("ccc");
		listString.add("ddd");
		listString.add("ccc");
		listString.add("ddd");//같은값이 중복으로 들어가도 에러로 처리하지 않는다.

		System.out.println("listString : " + listString);

		System.out.println(listString); //[출력방법1]저장된 모든요소를 출력시.
		System.out.println(listString.get(0)); //[출력방법2] get()메소드 - 원하는 칸만 출력.
		System.out.println(listString.size()); //[출력방법3]size()메소드 - 칸의 갯수만 확인하가.



		
		//[출력방법4] 대괄로호 감싸져서 출력되는 것이 싫다면? 낱개로 출력하면 되지요!
		//			(# for반복문 & get()메소드)
		System.out.println("반복문을 통하여 1개씩 출력해봅시다.");
		for (int printEA=0 ; printEA < listString.size() ; printEA++ )
		{					//null값이 아닌, 데이터가 들어간 칸의 갯수를 size()메소드가 해주니까 null==식으로 안해도 된다.(#삽질하지 말자.)
			System.out.println(listString.get(printEA));
		}


		System.out.println("원하는 문자열이 있는지 확인하기");
		//[출력방법5] for반복문 & get()메소드  
		for (int printEA=0 ; printEA < listString.size() ; printEA++ )
		{					//null값이 아닌, 데이터가 들어간 칸의 갯수를 size()메소드가 해주니까 null==식으로 안해도 된다.(#삽질하지 말자.)
			if(listString.get(printEA).equals("ccc"))
			{
				System.out.println(listString.get(printEA)+"는"+printEA+"번째에 있습니다.");
				//break; //선생님의 경우 break를 넣으셨다. 1개만 찾고 싶으셨다고.(여러개 찾고프면 break를 넣을 필요가 없다고하심)
			}
		}
			
		//
				System.out.println("ccc값이 있는 칸 : "+listString.indexOf("ccc"));
				

		System.out.println("1번째 칸을 지우려하는데 1번째 칸의 값 : "+listString.remove(1));
		System.out.println(listString); //[출력방법1]저장된 모든요소를 출력시.


		System.out.println(listString.indexOf(4));
		System.out.println(listString.contains("add"));
		listString.remove(0);
		System.out.println("0번째 칸이 삭제후 결과 : "+listString);
		listString.remove("ccc");
		System.out.println("가장먼저 발견된 ccc가 삭제됨이 확인됩니다. : "+listString);


		ArrayList<Integer> listInteger = new ArrayList<>();
		listInteger.add(new Integer(3));
		listInteger.add(new Integer(1));
		listInteger.add(new Integer(9));
		listInteger.add(new Integer(2));
		listInteger.add(2);
		System.out.println("listInteger 입력결과 : " +listInteger);

		Collections.sort(listInteger);
		System.out.println("Collections.sort(listInteger) 정렬명령 결과 : " +listInteger);
			
		
		System.out.println("9의 위치 : " +listInteger.indexOf(new Integer(9)));
		
		
		listInteger.remove(new Integer(9));//저는 "숫자9"를 삭제하길 원해요! => 그럼  new Integer(9)으로 숫자값 9임을 알려야 합니다.
		//		listInteger.remove(new Integer(9)); //이렇게하면 9번째 칸을 삭제로 오인함...
		System.out.println("9가 삭제되었는지 봅시다 : " +listInteger);

	
		//삭제할 숫자값을 키보드로 입력받아 지워보시오.
		System.out.println(listInteger);
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 값 : ");
		int n = scan.nextInt();
		
		if( listInteger.remove(new Integer(n)) )//삭제할 값과 같은 값이 있음을 확인한 경우 바로 삭제 ㄱㄱ
		{										//.remove() 메소드는 삭제되면서 값을 한번 리턴해줍니다(확인함 해보세요 의도일까?)
			System.out.println("삭제 후 결과 : " +listInteger);
		}
		else
		{
			System.out.println("삭제할 값이 없습니다.");
		}

	}
}
