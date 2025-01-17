import java.util.Scanner;

class ArrayTest2
{
	public static void main(String[] args) 
	{
		//배열 선언방법1 : 선언&객체주소 지정동시에 하기(#평소에 늘 하던 방식)	
		int b[] = 	new int[0];

		//배열 선언방법2 : 선 배열변수 선언, 후 객체주소 저장
		int a[]=null; //배열은 아직 미지정하고 변수 a[]만 있는 상태.
		a = new int[10]; //나중에 객체의 주소를 알려주는 방식


		//아래의 사항들을 실시하기 위한 변수들을 선언		
		Scanner input = new Scanner(System.in);
		int sum=0;



		//======================================================================================================================		
		//10개의 정수를 입력받아 a배열의 각 원소(인덱스)에 저장하십시오.
		for(int i =0; i <a.length ; i++)
		{
			System.out.print(i+"번째 배열인덱스에 넣을 값을 입력하세요.");
			a[i] = input.nextInt();
		}
		System.out.println("");


		//입력받은 10개의 값들을 출력하십시오.
		System.out.println("배열인덱스에 입력된 값은 아래와 같습니다.");
		for(int i =0; i <a.length ; i++)
		{
			System.out.println(i+"번째 배열인덱스의 값 : " + a[i]);
		}
		System.out.println("");


		//입력받은 10개의 값들을 출력하십시오.
		//part1. 각 배열들의 입력한 값들 나열 및 각 +기호 삽입
		System.out.println("간략한 계산과정 & 합계는 아래와 같습니다.");
		for(int i =0; i <a.length ;)
		{
			System.out.print(a[i]);
			i++;
			if(i > a.length) break;
			System.out.print("+");
		}

		//part2. sum변수에 배열들이 저장한 합계를 도출
		for(int i =0; i <a.length ;i++)
		{
			sum+=a[i];
		}		
		System.out.println(sum);


		/*선생님의 경우 아래와 같이 처리.
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+"+");
			sum+=a[i];
		}	
			System.out.println("="+sum)
		//급하게 적느라 빠뜨린 사항이 있을수도 있음.
		*/

		//======================================================================================================================

	}
}
