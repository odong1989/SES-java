package global.sesoc.java1.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest5 {

	public static void main(String[] args) {
		BufferedWriter outFile = null;
		String filename = "c.txt";
		
		try {
			outFile = new BufferedWriter(new FileWriter(filename));
			outFile.write("alsfjlwiejflskgjlsjf");
			outFile.write("\r\n");
			outFile.write("가나다라 일이삼사");
			outFile.newLine();
			outFile.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
