package global.sesoc.java1.io;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest4 {

	public static void main(String[] args) {
		FileWriter outFile = null;
		String filename = "b.txt";
		
		try {
			outFile = new FileWriter(filename); //파일 생성
			outFile.write(100);		//int형 전달받아 1문자 저장
			outFile.write('A');
			outFile.write('가');
			outFile.close();		//스트림 닫기
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
