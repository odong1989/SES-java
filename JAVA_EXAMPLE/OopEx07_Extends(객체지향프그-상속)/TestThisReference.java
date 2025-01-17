//SES java book 255~256page

class TestThisReference 
{
	public static void main(String[] args) 
	{
		Truck truck = new Truck(6,"black",11.5);
		System.out.println(truck.printAll());		
		
		Truck newTruck = truck.changeColor("white");
		
		System.out.println(newTruck.printAll());
	}
}



class Truck{
		//1.변수
		private int numberOfWheel;
		private String color;
		private double maxLoad;

		//2.1생성자(파라미터 3개)
		public Truck(int numberOfWheel,String color, double maxLoad){
			this.numberOfWheel = numberOfWheel;
			this.color = color;
			this.maxLoad = maxLoad;
		}

		//2.2생성자(파라미터1개)
		public Truck(Truck truck){
			this.numberOfWheel = truck.numberOfWheel;
			this.color = truck.color;
			this.maxLoad = truck.maxLoad;	
		}

		//메소드(리턴 : Truck클래스형)
		public Truck changeColor(String color){
			Truck newTruck = new Truck(this);
			newTruck.color = color;
			return newTruck;
		}

		public String printAll(){
			return "바퀴 수 : " + this.numberOfWheel + " 색상 : " + this.color + " 최대적재량 : " + this.maxLoad;
		}
}



