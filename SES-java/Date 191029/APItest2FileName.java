import java.util.Scanner;

class APItest2FileName
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		System.out.print("파일명 입력 : ");
		String file = scan.nextLine();
		
		System.out.println("file 의 값 :" + file);

		//-----------------------------------------------------------------------------------------------------------------------------
		//[문제1]"exe", "com" 확장자의 파일일 경우 "올릴수 없다고 하십시오.
		//contains는 금지하심(파일명이 company같은거면 파일명땜에 튕기는 불상사가 생김...)

		//내가한 방식
		//System.out.print(file.substring(file.lastIndexOf(".")+1,file.length()));//출력 체크용
		if (file.substring(file.lastIndexOf(".")+1,file.length()).equals("exe") || file.substring(file.lastIndexOf(".")+1,file.length()).equals("com"))
		{
			System.out.println("exe와 com은 안돼 ");
		}
		
		//선생님의 방식
		if(file.endsWith(".exe") || file.endsWith(".com") )
		{
			System.out.println(" \"exe\"또는 \"com\" 확장자를 가진 파일은 올릴 수 없습니다. ");	
		}

		//선생님 방식 - 대/소문자 보완(전부 소문자로 변환)
		if(file.toLowerCase().endsWith(".exe") || file.toLowerCase().endsWith(".com") )
		{//문자열을 무조건 소문자로 변환 후 exe/com 여부를 확인
			System.out.println(" \"exe\"또는 \"com\" 확장자를 가진 파일은 올릴 수 없습니다. ");	
		}	

		//-----------------------------------------------------------------------------------------------------------------------------

		//[문제2]	확장자만 출력하세요. 또는 "확장자가 없습니다라고 출력하십시오.
		//나의방식(확장자 있는 경우로만 알고 확장자 없을시는 미작성)
		System.out.println("파일명 : "+file.substring(file.lastIndexOf(".")+1));
		
		//선생님
		String ext="";
		String sa[];
		System.out.println("file.contains : " + file.contains("."));
		

		//확장자 체크(.통해 체크)
		if (!file.contains("."))//결과를 뒤집어서 사용한다. 뒤집어 사용함으로써 없을 경우를 판단한것.
		{						//file.contains(".")만 쓰면 .이 없을 시 false가 되는데 !를 통해 not시킴으로써 true으로 변환하여 조건문을 작동시킨다. 
			System.out.println("확장자가 없습니다.");
		}
		//확장자 출력
		else
		{
			//방법1 - lastIndexOf를 통해 발견 후 이후의 자리들부터 출력토록 한다.
			ext = file.substring(file.lastIndexOf('.')+1);
			System.out.println("확장자(ext) : "+ext);

			//2
			System.out.println("----------------------------------------------------");

			sa = file.split("[.]");
			/*
				split의 경우 그냥 .만 쓰면 정규식으로 이해하여 오작동을 한다.
				split의 경우 .만 검색하고 싶다면 [.]으로 하여 정규식이 아니라 .만 검색하고 싶다고 확실하게 말하자.
				
				자바 스크립트에서 정규식을 더 많이 사용하는데 
				이유는 사용자의 입력의 오작동시 바로바로 대응하기 위함이라한다.
			*/
			System.out.println("sa : "+ sa[1]);
			ext = sa[sa.length -1];
			System.out.println("확장자(ext) : "+ext);
		}

		//-----------------------------------------------------------------------------------------------------------------------------

	
	}
}
