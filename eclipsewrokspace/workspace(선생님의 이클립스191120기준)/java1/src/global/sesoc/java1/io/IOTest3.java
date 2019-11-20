package global.sesoc.java1.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest3 {

	public static void main(String[] args) {
		FileOutputStream outFile = null;
		String filename = "a.txt";
		
		try {
			outFile = new FileOutputStream(filename); //파일 생성
			outFile.write(100);		//int형 전달받아 1byte 저장
			outFile.write('A');
			outFile.write('가');
			outFile.close();		//스트림 닫기
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
