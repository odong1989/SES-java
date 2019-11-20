package global.sesoc.java1.exception;

//예외 처리
public class ExTest1 {
	public static void main(String[] args) {
		String a = "0";
		String b = "0";
		int i, j, k;
		
		try {
			i = Integer.parseInt(a);
			j = Integer.parseInt(b);
			k = i / j;
			System.out.println(k);
		}
		catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			//return;
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("그 밖의 예외");
		}
		finally {
			System.out.println("finally 블럭");
		}
		System.out.println("프로그램을 종료합니다.");

	}
}



