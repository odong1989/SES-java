import java.util.Scanner;
/*
   3. 태어난 해를 입력받아 띠를 출력한다(1989년 -> 뱀띠)
[조언] 기준년도를 확인후 %12 나머지연산을 활용하여 띠를 확인한다.
*/
class HW3_190809_SwitchVersion
{
	public static void main(String[] args) 
	{
		/*	본 프로그램에서는 1924년(쥐띠)를 기준으로 계산한다.

		(출생년도-1924)%나머지연산->나머지값에 0은 쥐띠, 1은 소띠... 순으로 실시한다.

	   	        쥐  |   소  |  호랑이 | 토끼  |  용  |   뱀  |  말  |  양   | 원숭이 |  닭  |  개  |  돼지 |   쥐  |  ...
		년도    1924 | 1925 |  1926 | 1927 | 1928 | 1929 | 1930 | 1931 | 1932 | 1933 | 1934 | 1935 | 1936 |  ...
	   나머지 값   0  |   1  |    2  |  3   |   4  |   5  |  6   |  7   |   8  |   9  |  10  |  11  |  12  |
		*/ 

		int birth_year=0;
		int birth_Switch=0;
		String birth_line=" ";
		Scanner scan = new Scanner(System.in);

		System.out.println("출생띠를 계산합니다. 출생년도를 입력해주세요.");
		birth_year = scan.nextInt();

		birth_Switch=(birth_year-1924)%12;

		switch(birth_Switch){
			case 0 : birth_line="쥐";
					break;
			case 1 : birth_line="소";
					break;
			case 2 : birth_line="호랑이";
					break;			
			case 3 : birth_line="토끼";
					break;			
			case 4 : birth_line="용";
					break;
			case 5 : birth_line="뱀";
					break;
			case 6 : birth_line="말";
					break;
			case 7 : birth_line="양";
					break;
			case 8 : birth_line="원숭이";
					break;
			case 9 : birth_line="닭";
					break;
			case 10: birth_line="개";
					break;
			case 11: birth_line="돼지";
					break;
			default : birth_line="입력에러";
					break;
		}

		System.out.println("입력하신 출생년도는" + birth_year);
		System.out.println(birth_line + "입니다.");
	}
}
