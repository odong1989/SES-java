class MemberTestBMI
{
	public static void main(String[] args) 
	{
		int array[];
		array = new int[5];
		array[0] = new MemberArray("김","110101");
		array[1] = new MemberArray("이","990909");
		array[2] = new MemberArray("박","880808");
 
		System.out.println(array[1].getName());

		//주의사항 : 마지막꺼부터 봐야합니다.
		//         마지막이전까지는 실행중인 것들이고 마지막꺼만이 결과물로서 눈에 보이죠.
		//         (#마지막의 .메소드들이 스트라이커이고, 그 이전의 것들은 어시스트들이랄까)
		System.out.println(array[1].getName().length);
		System.out.println(array[1].getBirth().charAt(0));
		System.out.println(array[1].getName());

		//첫번쨰 회원의 출생년도를 int형으로 읽어서 출력해주세요.
		System.out.println(Integer.parseInt(array[0].getBirth().substring(0,2)));		

	}
}
