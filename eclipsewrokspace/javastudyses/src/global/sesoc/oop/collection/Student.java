package global.sesoc.oop.collection;

//���� : StudentVer3Capsure


//����� ���� �ڷ���(Value Object)
//�����ϳ��� ǥ���ϴ� �ڷ����Դϴ�.
//���谡 ���� �� �ٷ� ���� ���۵Ǵ� �� �� �ϳ��Դϴ�.

class Student//���赵&�Ӽ�(����)�� �����ϴ� ����
{
	/*             ��ü
		�ͼӼ�(����)	|	���ൿ(�޼ҵ�)
	----------------��-------------------------
		1) �̸�		|
		2) �й� 		|
		3) �����	|
		4) �����	|
		5) ���м���	|
	*/
	
	//�ͼӼ� = ����(�������, �ʵ�)	
	//���漺����   : <-������-----------------------------������->
	//����㰡���� :    �㰡       �㰡          �㰡    |   ���㰡
	//����������   : (public > protected > (default) > private)
	

	//ĸ��ȭstep1.private�� �����Ͽ� ������ �����մϴ�. 
	//�ͼӼ� = ����(�������, �ʵ�)	�� �����մϴ�.
	private String name;
	private int kor;
	private int eng;
	private int math;

	/*final�� ���� �ȵǳ���?
	  1���� �Է¹ް� ��ĥ���� ����.
	  final�� ������ �ٲܼ� ���� ������������ ��쿡 Ȱ���մϴ�.
	*/
	/*	String name;�� public String name;�ΰ���?
		�ƴմϴ�.
	default String name;�� ���ĸ�Ī�ε� default�� �����ص� �Ǽ�
	���ݱ��� String name;���� �ۼ��ص� �����۵� �Ȱ�����.
	*/



	//�α�� = �޼ҵ�
	//����ڵ��� view�� ���ϰ� �ϱ����� ��±���� ������ �Ͽ���.


	//���� �������� �޼ҵ��-----------------------------------------------------------------
	public void setName(String inputName)
	{
		this.name = inputName;
	}

	public String getName(){
		return this.name;//���� �θ� ���α׷����� ���� ���� �ִ� ��������� �����ִ� ���Դϴ�.
	}
	//���� ���� �޼ҵ�� ����-----------------------------------------------------------------
	
	
	
	//���� �������� �޼ҵ��-----------------------------------------------------------------
	public void setKor(int inputKor)
	{
		if(inputKor < 0 || inputKor > 100)
		{return;}
		this.kor = inputKor;
	}

	public int getKor(){
		return this.kor;//���� �θ� ���α׷����� ���� ���� �ִ� ��������� �����ִ� ���Դϴ�.
	}
	//���� ���� �޼ҵ�� ����-----------------------------------------------------------------


	//���� �������� �޼ҵ��-----------------------------------------------------------------
	public void setEng(int inputEng)
	{
	//ĸ��ȭStep2. ���� �Է��ϴ� ����� �޼ҵ带 ���ϴ� ������ ������ �Ͽ����ϴ�.
		if(inputEng < 0 || inputEng > 100){return;}
		this.eng = inputEng;
	}

	
	public int getEng(){
		return this.eng;//���� �θ� ���α׷����� ���� ���� �ִ� ��������� �����ִ� ���Դϴ�.
	}
	//���� ���� �޼ҵ�� ����-----------------------------------------------------------------



	//���м����޼ҵ�
	public void setMath(int inputMath)
	{
		if(inputMath < 0 || inputMath > 100)
		{return;}
		this.math = inputMath;
	}
		
	public int getMath(){
		return this.math;//���� �θ� ���α׷����� ���� ���� �ִ� ��������� �����ִ� ���Դϴ�.
	}

	
	//�� ó�� ���� �޼ҵ��-------------------------------------------------------------
	public int getTotal(){
		return (this.kor + this.eng + this.math);
	}	

	public double getAvg(){
		return (this.kor + this.eng + this.math) / 3.0;
	}	

	public String getGrade(){
		String grade=null;

		switch((int)getAvg()/10)
		{
			case 10: case 9 : grade="��"; break;
			case  8 : grade="��"; break;
			case 7 : grade="��"; break;
			case 6 : grade="��"; break;
			default : grade="��"; break;
		}
		return grade;
	}	



	//----------��� 11��08�Ͽ� �߰���.-------------
	//1�⺻��
	public Student(){
	}

	//2�̸��� 4���� ������ �Է�.
	public Student(String inputName, int inputKor, int inputEng, int inputMath){
		this.name = inputName;

		if(inputKor < 0 || inputKor > 100){return;}
		this.kor = inputKor;

		if(inputEng < 0 || inputEng > 100){return;}
		this.eng = inputEng;

		if(inputMath < 0 || inputMath > 100){return;}
		this.math = inputMath;
	}

}