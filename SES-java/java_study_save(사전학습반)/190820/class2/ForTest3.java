class ForTest3
{
	public static void main(String[] args) 
	{
		int total=0;
		//1~10까지의 합
		for(int cnt=1;cnt<=10;cnt++){
			if(cnt%4==0){
			//	break;		  //for을 종료한다
			//continue;		  //for문이 종료되는 것은 아니다. 대신, 밑의 문장들은 스킵처리 된다.
			//return;		  //치트키처럼 무조건 여기서 끝!
			System.exit(0);	  //현재프로그램 종료
			}
		total+=cnt;
		System.out.print(cnt+" ");
		}
		System.out.println("\n total : "+total);

		System.out.println("main()메소드의 나머지 부분");	
	}
}
