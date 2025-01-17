package global.sesoc.study191121;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//사용자가 입력한 내용으로 텍스트 파일 만들기
public class TextEditorVersionBasic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String filename = null;
		File file = null;
		BufferedWriter out = null;
		String text = null;
		int num = 0;
		
		//파일명 입력받아 File객체 생성. 있는 이름이면 다시 입력받음
		while (true) {
			System.out.print("파일명 : ");
			filename = scan.nextLine();
			file = new File(filename + ".txt");
			if (!file.isFile()) break;
			System.out.println("이미 사용중인 이름입니다. 다시 입력하세요.");
		}
		
		//출력스트림생성
		try {
			out = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류");
		}
		
		//반복적으로 한줄 입력받아 한줄 저장
		//입력없이 엔터치면 반복 종료
		//스트림 닫고 프로그램 종료
		try {
			System.out.println("내용을 입력하세요. 종료는 새로운 행에서 엔터");
			while (true) {
				System.out.print(++num + ": ");
				text = scan.nextLine();
				if (text.equals("")) break;
				out.write(text);		//입력한 내용 저장
				out.newLine();			//줄 바꿈
			}
			out.close();
			System.out.println(file.getName() + " 파일이 저장되었습니다.");
		}
		catch (IOException e) {
			System.out.println("파일 저장 중 오류 발생");
		}
	}
}

/*
파일명 : abc
내용을 입력하세요. 종료는 새로운 행에서 엔터
가나다라
abcd

abc.txt파일이 저장되었습니다.
*/













