package global.sesoc.oop.classMember;


/**
| 목표 : 회원이 가입하면 아래의 정보를 입력받고 출력예처럼 행할 수 있도록 하십시오.
|       191104 2교시에는 BMI계산기능도 추가합니다.
|		BMI기능 : 몸무게 / (키*키)
|
*/

import 

public class MemberBMI{
//public class라고 꼭 기재하시오!!!
//public를 입력하지 않을 경우
//같은 패키지라고 해도 같은 폴더내에 없으면 사용이 불가하다!!!

	//1. 변수의 자료형 선언
	 private String name;
	 private String dateOfBirth;
	 private String bloodType;
	 private double height;
	 private double weight;


		//2. 생성자 설정(최소한 기본생성자는 설정)
		public MemberBMI()
		{
			System.out.println("기본생성자입니다. 이해를 위해서 출력포함했을 뿐.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
		}

		public MemberBMI(String name, String dateOfBirth)
		{
			System.out.println("2번째(임의1) 스타일 생성자입니다.");
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


			System.out.println("3번째(임의2) 스타일 생성자입니다.");
			System.out.println("name : "+this.name);
			System.out.println("dateOfBirth : "+this.dateOfBirth);
			System.out.println("name : "+this.bloodType);
			System.out.println("dateOfBirth : "+this.height);
			System.out.println("dateOfBirth : "+this.weight);
			System.out.println("-----------------------------------");
			
				
		
		}
		
		//3.메소드 선언
		public int getAge(){
			Calendar cal = Calendar.getInstance();
			int year = Integer.parseInt(birth.substring(0,2));//문자열로 받았기에 년도파트를 숫자로 바꿈.
			//Integer.parseInt 꼭 외워기억해주세요!!ㅠㅠ
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
		/*선생님 방식
			double bmi = weight / Math.pow(height / 100.0, 2);
			return bmi;
		*/
			return ((this.weight / (this.height*this.height))*10000);	
		}

		String getBmi(String text){
			double bmi = this.weight / (this.height*this.height);
			if(bmi <20.0){ return "귀하는 마른편입니다."; }
			else if(bmi >=20 && bmi < 25){ return "귀하는 보통입니다."; }
			else if(bmi >=25 && bmi < 26.4){ return "귀하는 약간 비만입니다."; }
			else if(bmi >=26.5){ return "귀하는 비만입니다."; }
			return "error";
		}
		/*선생님 방식
		public String getBmi(String msg){
		double bmi = getBmi();
		String s="";

		if(msg.equalsIgnoreCase("GRADE")){
		if(bmi <18.5) s="저체중";
		if(bmi <23.0) s="정상체중";
		if(bmi <25.0) s="과체중";
		else s="비만";
		}
		return s;
		}
		*/

}
