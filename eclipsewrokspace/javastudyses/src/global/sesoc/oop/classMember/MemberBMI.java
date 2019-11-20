package global.sesoc.oop.classMember;


/**
| ��ǥ : ȸ���� �����ϸ� �Ʒ��� ������ �Է¹ް� ��¿�ó�� ���� �� �ֵ��� �Ͻʽÿ�.
|       191104 2���ÿ��� BMI����ɵ� �߰��մϴ�.
|		BMI��� : ������ / (Ű*Ű)
|
*/

import 

public class MemberBMI{
//public class��� �� �����Ͻÿ�!!!
//public�� �Է����� ���� ���
//���� ��Ű����� �ص� ���� �������� ������ ����� �Ұ��ϴ�!!!

	//1. ������ �ڷ��� ����
	 private String name;
	 private String dateOfBirth;
	 private String bloodType;
	 private double height;
	 private double weight;


		//2. ������ ����(�ּ��� �⺻�����ڴ� ����)
		public MemberBMI()
		{
			System.out.println("�⺻�������Դϴ�. ���ظ� ���ؼ� ����������� ��.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}

		public MemberBMI(String name, String dateOfBirth)
		{
			System.out.println("2��°(����1) ��Ÿ�� �������Դϴ�.");
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}
	


		public MemberBMI(String name, String dateOfBirth, double height, double weight, String bloodType)
		{
			 this.name = name;
			 this.dateOfBirth=dateOfBirth;
			 this.bloodType=bloodType;
			 this.height=height;
			 this.weight=weight;


			System.out.println("3��°(����2) ��Ÿ�� �������Դϴ�.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
			
				
		
		}
		
		//3.�޼ҵ� ����
		public int getAge(){
			Calendar cal = Calendar.getInstance();
			int year = Integer.parseInt(birth.substring(0,2));//���ڿ��� �޾ұ⿡ �⵵��Ʈ�� ���ڷ� �ٲ�.
			//Integer.parseInt �� �ܿ�������ּ���!!�Ф�
			int age = cal.get(Calengar.YEAR) - 1900 -year;
			if(age > 100) age -=100;
			return age;
		}


		void setHeight(double height){
			this.height = height;
			System.out.println("this.height : "+this.height);
			System.out.println("-----------------------------------");
		}


		String getName(){
			return this.name;	
		}
		
		double getBmi(){
		/*������ ���
			double bmi = weight / Math.pow(height / 100.0, 2);
			return bmi;
		*/
			return ((this.weight / (this.height*this.height))*10000);	
		}

		String getBmi(String text){
			double bmi = this.weight / (this.height*this.height);
			if(bmi <20.0){ return "���ϴ� �������Դϴ�."; }
			else if(bmi >=20 && bmi < 25){ return "���ϴ� �����Դϴ�."; }
			else if(bmi >=25 && bmi < 26.4){ return "���ϴ� �ణ ���Դϴ�."; }
			else if(bmi >=26.5){ return "���ϴ� ���Դϴ�."; }
			return "error";
		}
		/*������ ���
		public String getBmi(String msg){
		double bmi = getBmi();
		String s="";

		if(msg.equalsIgnoreCase("GRADE")){
		if(bmi <18.5) s="��ü��";
		if(bmi <23.0) s="����ü��";
		if(bmi <25.0) s="��ü��";
		else s="��";
		}
		return s;
		}
		*/

}