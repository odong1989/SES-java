import java.util.Scanner;

class ArrayTest10_RE 
{
	public static void main(String[] args) 
	{
		String name[]={"고길동","둘리","또치","도우너","관우","유비","한고조","조조","장비","제갈량"};
		Scanner input=new Scanner(System.in);
		String input_name;

		System.out.print("검색을 원하는 이름을 입력 : ");
		input_name = input.next();

		for (int i=0 ; i<name.length ; )
		{
			if(input_name.equals(name[i]))
			{
				System.out.println(name[i]+"를 찾았습니다.");
				System.out.println("발견위치 : " + i );
				break;
			}

			i++; //for i++
			if(i==name.length)
			{
				System.out.println("검색결과 조회되지 않습니다.");			
				break;
			}

		}

	}
}
