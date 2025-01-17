/*
| 2.1 입력시 준수사항																			|
|     (1) 주민번호 14자리를                                                                     |
|     (2) 예외입력(이상한 입력)은 아래와 같이 규정한다.                                                 |
|         예외입력1-입력문자열의 길이가 14자리가 아닌 경우                                               |
|         예외입력2-주민번호의 규격(123456-1234567)을 맞추지 않은경우                                   |             
|         예외입력3-숫자이외의 값들을 입력한 경우.(중간의 '-'제외)								        |
|                                                                                           |
*/	
import java.util.Scanner;
import java.util.Calendar;

public class SocialSecurityNumberCheck
{

	

	public void SSNCheck()
	{
//변수선언구간------------------------------------------------------------------------------------
	String inputSSN; //SSN : 주민번호(SocialSecurityNumber)의 약어. 문자열로 입력받은 후 숫자값으로 변환.	
	Scanner in = new Scanner(System.in);
	Calendar cal = Calendar.getInstance(); //주민번호의 출생일 정상입력 확인용
	int now_year=cal.get(Calendar.YEAR);



	int birth_year;	//윤년확인위해 20xx식으로 년도를 4자리로 저장하는 변수.
	int birth_month;
	int birth_day;
	String sex="";		//주민번호로 남/여 성별 확인
	char check;			//예외입력3에서 숫자이외의 값이 입력되었는지 확인.	


	boolean ContinueFalg=true; //사용자의 입력이 정확해야 입력이 종료된다.	
//변수선언파트 끝------------------------------------------------------------------------------
		
		
		
		while(ContinueFalg)
		{
			System.out.println("주민등록번호를 입력해주세요. (예)123456-1234567  : ");
			inputSSN = in.next();
				
			//예외입력1 체크_글자수 14자 확인-----------------------------------------------
			if (inputSSN.length()!=14)//참일시 계속 예외입력2,3을 체크진행. 
			{	
				System.out.println("주민번호를 14자 입력해주세요(-포함)" );
				continue;
			}

			//예외입력2_체크 6번째 문자 위치에 '-'가 들어갔는지 확인.--------------------------------
			if (inputSSN.charAt(6)!= '-')
			{
				System.out.println(" '-'입력오류입니다." );
				continue;
			}
			//예외입력2_체크 6번째 문자 위치에 '-'가 들어갔는지 확인 END-------------------------------------------------
			
			//예외입력3_체크 숫자이외의 값 입력을 확인.(6번쨰 문자는 '-' 체크)-----------------------------------------		
			for(int point=0; point < inputSSN.length() ;point++)//예외입력 2,3 체크용 반복문
			{
				check=inputSSN.charAt(point);
				if( point!= 6 &&(check < 48 || check > 57))
				{// point!= 6 : 6번째 자리는 '-'이니 체크하지않도록 설정함.
					System.out.println("숫자이외의 값 감지. 다시 입력해주세요." );
				continue;
				}
			}
			//예외입력3_숫자이외의 값 입력을 확인 END------------------------------------------------------------		


			//남녀 구분
			switch (inputSSN.charAt(7))
			{
				/*            남자     /     여자 
				---------------------------------------------
				1800년대 출생 :    9     /      0
				---------------------------------------------
				1900년대 출생 :    1     /      2
				---------------------------------------------
				2000년대 출생 :    3     /      4
				*/
				//남자일 경우 : 9,1,3		
				case '9' : case '1' : case '3' :
				sex="남자";
				break; 				
					
				//여자일 경우 : 0,2,4		
				case '0' : case '2' : case '4' :
				sex="여자";
				break; 				
				
				default :System.out.println("예외입력입니다");			
			}//switch END

			ContinueFalg=false;
		}//while END
	
	}//	public void SSNCheck() END

}//Class END
