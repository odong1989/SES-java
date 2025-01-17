import java.util.Scanner;
import java.util.Calendar;

//주민등록번호(문자열/숫자아님!! 주의하삼!)를 입력받는 프로그램이다.
/*
			while(true)
			{
				if(조건){
					//에러메세지;
					continue;
				}
				//정상입력되어야 비로소 if문을 빠져나오고,
				break;
				//break문을 만남으로서 반복문을 빠져나가 프로그램 종료가 되게 된다.
			}

			//조언2 - 제대로 숫자들을 넣었으냐? 확인하기
			char ch = id.charAt(0);
			if(ch>='0' && ch<='9')


			완성하든, 못하든 이메일로 보내주세요.
			sypark@sesoc.global(박수연)
		*/

		/*
			잘못입력된 경우 확인 사항
			1)글자수 14자 확인하세요
			2)문자의 위치(6번, 작대기가 들어갔는가?)
			3)6번문자 '-'를 제외한 나머자가 숫자인지를 확인하세요.
			4)성별확안(9,0,1,2,3,4)
			5)생일은 1~12월, 1~31일이어야 합니다.
			6)윤년을 제외한 2월은 28일까지, 윤년은 29일까지
			7)월별로 마지막날이 다릅니다.
			
			정상입력경우
			-> 90년생 1월 1일생 29세 남자입니다.
*/

class BoSeong_test
{
	public static void main(String[] args) 
	{

		String id;	//문자열로 입력받은 후 숫자값으로 변환.
		String sex=""; //주민번호로 남/여 성별 확인후 저장, 최종결과에서 출력
		Scanner in = new Scanner(System.in);
		Calendar cal = Calendar.getInstance(); //주민번호의 출생일 정상입력 확인용
	
		char check;
		
		int id_birth_year; //윤년확인위해 20xx식으로 년도를 4자리로 저장하는 변수.
		int id_birth_month;
		int id_birth_day;
		int now_year=cal.get(Calendar.YEAR);

		System.out.println("주민번호 활용한 출생일 및 성별 해설프로그램입니다.");
		System.out.println("주민등록번호를 입력해주세요. (예)123456-1234567  : ");
		id = in.next();


		//첫번째 확인파트 시작---------------------------------------------------------------------
		/*	첫번째 확인 파트이다.
			첫번째 파트는 입력이 정상적인가를 체크하며,
			논리적인 부분은 두번째 파트에서 체크한다.
			(예)891535-1234567라고 입력할 경우
			   사람은 15월 35일은 달력이론상 틀렸다고 바로 처리하지만
			   본 첫번째 파트는 맞다고 처리한다.
			   나중의 업데이트를 생각하면 부분별로 나누는 것이 좋다고 판단함.

			첫번째 파트에서는 아래의 3가지 사항을 확인한다.
			1)글자수 14자 확인하세요
			2)문자의 위치(6번, 작대기가 들어갔는가?)
			3)6번문자 '-'를 제외한 나머자가 숫자인지를 확인하세요.
		*/

		//체크1_글자수 14자 확인
		if (id.length()==14) 
		{
			//체크2_문자의 6번 위치 작대기(-) 확인 &  체크3_주민번호에 숫자값들이 맞는지 확인.			
			//반복문통해서 체크문항2,3번 체크 실시.
			for(int point=0; point < id.length() ;point++)
			{
				//체크2_ 6번째 문자 위치에 '-'가 들어갔는지 확인.
				check=id.charAt(point);
				if (point == 6)
				{
					if (id.charAt(6)!= '-')
					{
						System.out.println(" '-'입력오류입니다." );
						System.exit(0);
					}
				}

				//체크3_숫자값이 들어갔는지 확인.(6번쨰 문자는 '-' 체크.)
				if( point!= 6 &&(check < 48 || check > 57))
				{
					System.out.println("숫자이외의 값 감지. 다시 입력해주세요." );
					System.exit(0);
				}
			}//end_for
			//첫번째 확인파트 종료-------------------------------------------------------------------

			//두번째 확인파트 시작-------------------------------------------------------------------
			/* 생일 정보를 체크 및 입력 받도록 설정한다.
			   생일 정보의 논리적인 부분을 체크한다.
			   (예)891535-1234567라고 입력할 경우
			       15월 35일은 없는 것이므로 입력오류로 처리한다.
		   
			   첫번째 파트에서 실시하지 않은 
			   4)성별확안(9,0,1,2,3,4)
			   5)생일은 1~12월, 1~31일이어야 합니다.
			   6)윤년을 제외한 2월은 28일까지, 윤년은 29일까지
			   7)월별로 마지막날이 다릅니다.
			
				를 실시하며 체크사항 "5)생일은 1~12월, 1~31일이어야 합니다.", "7)월별로 마지막날이 다릅니다."는
				캘린더 클래스를 통하여 체크하는 것으로 실시.

			*/

			//체크4_성별확안(남자:9,1,3/여자:0,2,4)			
			if(id.charAt(7) == '9' || id.charAt(7) ==  '1' || id.charAt(7) == '3')
			{
				sex="남성";
			}
			else if(id.charAt(7) == '0' || id.charAt(7) ==  '2' || id.charAt(7) == '4')
			{
				sex="여성";
			}
			else
			{
				System.out.println("성별숫자 입력에러입니다." );		
				System.exit(0);
			}
			//체크6_윤년체크
			//6.step1.출생년도를 4자리로 조정.
			id_birth_year = Integer.parseInt(id.substring(0,2));
			if(id_birth_year<=(now_year-2000))//주민번호는 '1999년'처럼 4자리로 나오지 않으므로 4자리로 맞추는 작업실시.
			{
				id_birth_year = Integer.parseInt("20"+id.substring(0,2));
			}
			else
			{
				id_birth_year = Integer.parseInt("19"+id.substring(0,2));
			}

			//6.step2.윤년여부 판결
			if((id_birth_year%4 == 0)&&((id_birth_year%100 != 0)||(id_birth_year%400 == 0)))
			{
				System.out.println(id_birth_year+"는 윤년입니다");
			}
			else 
			{
				System.out.println(id_birth_year+"는 윤년이 아닙니다.");
			}

			// 체크5_생일은 1~12월, 1~31일이어야 합니다. & 체크7_월별로 마지막날이 다릅니다. 확인실시
			//step1.주민번호의 출생 년/월/일을 각 변수에 저장.
			id_birth_month=Integer.parseInt(id.substring(2,4));
			id_birth_day=Integer.parseInt(id.substring(4,6));

			/*step2.Calendar형 변수 cal의 날짜를 주민번호의 년/월/일로 설정.
			  자동제공되는 Calendar를 활용하여 주민번호의 출생일이 정상입력되었는지 체크.
			*/
			cal.set(Calendar.YEAR, id_birth_year);
			cal.set(Calendar.MONTH, id_birth_month);
			cal.set(Calendar.DATE, id_birth_day);			

			//1~12월 여부 체크,
			if(id_birth_month<1 || id_birth_month>12)
			{
				System.out.println("입력오류입니다. 주민번호의 월 정보를 확인해주세요."); 
				System.exit(0);
			}//이어서 일 체크
			else if(id_birth_day>cal.getMaximum(Calendar.DAY_OF_MONTH))
			{
				System.out.println("입력오류입니다. 주민번호의 일 정보를 확인해주세요."); 
				System.exit(0);
			}
			//두번째 확인파트 종료---------------------------------------------------------------


			//세번째 파트 시작------------------------------------------------------------------
			/* 첫번째, 두번째 파트를 통해 정상적으로 주민번호 정보가 입력되었음을 확인하였으므로
			   출생 년/월/일 연령/성별 을 출력한다.
			   (예) 90년생 1월 1일생 29세 남자입니다.
			*/
				System.out.println(id_birth_year+"년생 "+id_birth_month+"월 "+id_birth_day+"일 "+(now_year-id_birth_year)+"세 "+sex+"입니다"); 
			
			//세번째 파트 종료------------------------------------------------------------------
		}
	}
}
