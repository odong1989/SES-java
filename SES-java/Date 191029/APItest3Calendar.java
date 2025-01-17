import java.util.Calendar;
/* static int parseInt(String s)   

*/

class APItest3Calendar
{
	public static void main(String[] args) 
	{
		//문자열을 숫자로
		String a = "1234";
		//	System.out.println(a+1);				//출력 : 12341으로 나온다. String이니까. 
		System.out.println(Integer.parseInt(a)+1); //[NG사례]출력 : 12341으로 나온다. String이니까. 
		

		//숫자를 문자열로
		int b = 100;
		System.out.println(b+1+2);				//103이 출력된다.
		System.out.println(Integer.toString(b)+1+2); //10012으로 출력된다. b가 문자열이 이름이 되기에 수학의 사칙연산이 아닌 문자열의 뒤에 붙기처럼 된 것이다.


		//날짜, 시간 관련 정보
		Calendar c =Calendar.getInstance(); //이 순간의 시간정보
		//new Calendar 식으로 만들 수 없어요.
		//Calendar클래스의 getInstance에게 만들어주세요 부탁해야 하는 모양새랄까.
		//근데 이럴 수 밖에 없는게 한번 받고 끝내면 시간의 동기화가 안되니까.
		
				
		System.out.println("=========================================================");
		//System.out.println("Calendar c : "+c);//출력 내용은 아래의 주석 참고. 
		/*
			출력내용은 아래와 같다.
			Calendar c : java.util.GregorianCalendar
						[time=1572316455381,
						areFieldsSet=true,
						areAllFieldsSet=true,
						lenient=true,
						zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
						offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],
						firstDayOfWeek=1,
						minimalDaysInFirstWeek=1,ERA=1,
						
						
						YEAR=2019,
						MONTH=9,	//10월이지만 -1되어 9로 나오고 있다.
						
						WEEK_OF_YEAR=44, WEEK_OF_MONTH=5, 
						
						DAY_OF_MONTH=29, //값을 요청하고 받은 날의 일이 나온다.
					
						DAY_OF_YEAR=302,DAY_OF_WEEK=3, DAY_OF_WEEK_IN_MONTH=5,

						
						AM_PM=0,	//0 : 오전, 1 : 오후
						HOUR=11,		//시간
						HOUR_OF_DAY=11,//해당일의 시간?
						MINUTE=34,		//시간
						SECOND=15,MILLISECOND=381,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		*/

		//원하는 출력형식 : "2019년 10월 19일 화요일 오전 11시 30분입니다."
		//힌트 : 요일의 경우 배열을 사용하십시오.
		System.out.println(c.get(Calendar.YEAR)); //년도를 받을 수 있습니다.
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//System.out.println(c.get(Calendar.Date));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));//Calendar.Date()써도 된다고 하심.
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));

		System.out.println("------------------------------------------------------------");
		String AMPM[]={"오전","오후"};//0:오전, 1:오후
		String day[]={" ","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};//0번째칸은 숫자 맞추고자 일부러 공석기입.


		System.out.printf("오늘은 %d년 %d월 %d일 %s %s %d시 %d분 입니다.\n",
						    c.get(Calendar.YEAR),
							c.get(Calendar.MONTH)+1,
							c.get(Calendar.DAY_OF_MONTH),
							day[c.get(Calendar.DAY_OF_WEEK)],
							AMPM[c.get(Calendar.AM_PM)],
							c.get(Calendar.HOUR),
							c.get(Calendar.MINUTE));

		int[] calendar = { c.get(Calendar.YEAR),
							c.get(Calendar.MONTH)+1,
							c.get(Calendar.DAY_OF_MONTH),
							c.get(Calendar.DAY_OF_WEEK),
							c.get(Calendar.AM_PM),
							c.get(Calendar.HOUR),
							c.get(Calendar.MINUTE)};
		 

		System.out.printf("오늘은 %d년 %d월 %d일 %s %s %d시 %d분 입니다.\n",
							calendar[0], calendar[1], calendar[2]


	}
}
