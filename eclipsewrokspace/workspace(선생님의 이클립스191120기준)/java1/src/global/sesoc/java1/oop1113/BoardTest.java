package global.sesoc.java1.oop1113;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Board> list = new ArrayList<Board>();
		list.add(new Board(1,"aaa","글제목1", "글내용1"));
		list.add(new Board(2,"bbb","글제목2", "글내용2"));
		list.add(new Board(3,"aaa","글제목3", "글내용3"));
		System.out.println(list);
		
		System.out.print("읽을 글 번호 : ");
		int n = scan.nextInt();
		//해당 번호의 글 하나만 화면에 출력
		boolean check = true;
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			if (n == b.getNum()) {
				System.out.println(b);
				check = false;
			}
		}
		if (check) System.out.println("해당 번호의 글이 없습니다.");

	}

}
