import java.util.Scanner;
import java.util.Calendar;


class HW191028Ver2Update
//최초버전 : HW191028Ver1 
{
	public static void main(String[] args) 
	{
		String id=null; //주민등록번호이다. 입력받는 것으로 합니다. 이건 예제보여주느라 한거임.
		Scanner input = new Scanner(System.in);
		boolean flag=true;
		Calendar cal =Calendar.getInstance(); 

		while(flag)
		{
			System.out.println("주민번호를 입력해주십시오(예 : 900101-1234567 )"); 
			id=input.next();

			//14글자가 아니면 다시 입력받아 주십시오.

			if(id.length()!=7)
			{
				System.out.println("14글자 입력해주세요");
				continue;
			}
			//7번째 글자가 -인지 확인하십시오.
			if(id.substring(6,7) != "-")
			{
				System.out.println("-도 포함해주세요");
				continue;
			}


			break;
			/*무한반복문을 사용한다면 반드시 어떻게 끝낼수 있는,
				탈출구를 만들어야 합니다.
				본 예제 경우 14글자만 맞추면 탈출처리.*/
		}//while


		//다음의 정보를 출력하세요.
		//90년 01월 01일생 29세 남자입니다.
			 System.out.print(id.substring(0,2)+"년 "); 
			 System.out.print(id.substring(2,4)+"월 "); 
			 System.out.print(id.substring(4,6)+"일생 ");
//				 cal.get(Calendar.YEAR),
//				id.substring(0,2)
//올해년도 알아내서 나이계산할 것.
//그리고 나이계산시 주민번호913여부 따져서 년도를 반영할것.




				switch (id.substring(7,8))
				{
				/*                 남자     /     여자 
					---------------------------------------------
					1800년대 출생 :    9     /      0
					---------------------------------------------
					1900년대 출생 :    1     /      2
					---------------------------------------------
					2000년대 출생 :    3     /      4
				*/
					//남자일 경우 : 9,1,3		
					case "9" :
							 break;
					case "1" :
							 break; 				
					case "3" :
							 System.out.println("남자입니다.");
							 break; 				
					//여자일 경우 : 0,2,4		
					case "0" :
					case "2" :
					case "4" : System.out.println("여자입니다.");
							 break; 				
					default :System.out.println("예외입력입니다");
							
				}
				

				 flag=false;
			}



}
