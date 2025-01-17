package global.sesoc.java1.oop1113;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {
	}

	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return kor + eng + mat;
	}
	
	public double getAvg() {
		return getTot() / 3.0;
	}
	
	/*
	 * @Override public String toString() { String s = name + " " + kor + " " + eng
	 * + " " + mat; return s; }
	 */
	
	
	
	//  x.equals(y)
	@Override
	public boolean equals(Object obj) {
		//Student 타입의 객체가 아니면 false
		if (!(obj instanceof Student)) {
			return false;
		}
		Student st = (Student) obj;
		//이름과 국영수 점수가 모두 같으면 true
		if (this.name.equals(st.name) && this.kor == st.kor
				 && this.eng == st.eng && this.mat == st.mat) {
			return true;
		}
		else {
			return false;
		}
	
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
}




