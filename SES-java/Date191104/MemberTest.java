class MemberTest
{
	public static void main(String[] args) 
	{
		Member memb001 = new Member();//모든 멤버변수가 null 또는0.0으로 초기화
		Member memb002 = new Member("홍길동","010101");//이름과 생년월일만 초기화
		Member memb003 = new Member("김철수","991111",161.0,56.0,"AB");//모든 변수 초기화



		System.out.println("Hello World!");
	}
}
