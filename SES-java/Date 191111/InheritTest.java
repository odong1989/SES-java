//연계파일 : a.java(정확히는 a.class, b.class, c.class)

class InheritTest 
{
	public static void main(String[] args) 
	{
		A ob1 = new A();
		ob1.print();
		System.out.println(ob1.num);
		System.out.println("--------------------------------------------------");

		B ob2 =new B();
		ob2.print();
		System.out.println(ob2.num);
		System.out.println("--------------------------------------------------");	

		A ob3 =new B();
		ob3.print();
		System.out.println(ob3.num);
		((B)ob3).bMethod();

		System.out.println("--------------------------------------------------");	
		B ob4 = (B) ob3;
		ob4.bMethod();
		System.out.println(ob4.num);
	}
}
