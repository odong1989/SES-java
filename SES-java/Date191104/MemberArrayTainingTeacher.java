import java.util.Scanner;

class MemberArrayTainingTeacher
{
		public static void main(String[] args) 
	{
		//[1]5誤税 噺据舛左研 眼聖 壕伸 持失

		Scanner input = new Scanner(System.in);
		int MemArrayLength=5;//引薦澗 5誤戚走幻 獣娃雌 2誤生稽 酔識遭楳
		String tempSt;
		Double tempDb;

		MemberArrayTaining MemArray[];
		MemArray = new MemberArrayTaining[MemArrayLength];

		//[2]徹左球稽 鋼差庚聖 戚遂馬食 5誤税 噺据舛左研 脊径閤澗陥.
		for (int create =0 ; create< MemArrayLength ; create++)
		{
			MemArray[create]=new MemberArrayTaining();
		}
		
		for (int repeatIn =0; repeatIn < MemArrayLength ; repeatIn++)
		{
			tempSt = input.nextLine();
			System.out.print("噺据税 戚硯聖 脊径馬淑獣神. :");
			tempSt = input.nextLine();		
			MemArray[repeatIn].setName(tempSt);

			System.out.print("噺据税 窒持析聖 脊径馬淑獣神. (950101縦生稽) :");
			tempSt= input.nextLine();		//	tempSt= input.nextLine();
			MemArray[repeatIn].setDateOfBirth(tempSt);

			System.out.print("噺据税 迫衝莫聖 脊径馬淑獣神. :");
			tempSt=input.nextLine();			//tempSt=input.nextLine();
			MemArray[repeatIn].setBloodType(tempSt);

			System.out.print("噺据税 徹研 脊径馬淑獣神. :");
			tempDb= input.nextDouble();			//tempDb= input.nextDouble();
			MemArray[repeatIn].setHeight(tempDb);

			System.out.print("噺据税 倖巷惟研 脊径馬淑獣神. :");
			tempDb= input.nextDouble();		//	tempDb= input.nextDouble();
			MemArray[repeatIn].setWeight(tempDb);
			
			System.out.println("");
			System.out.println("");

		}

		//[3]焼掘人 旭戚 窒径廃陥.
			/*
			沿しし 28室 18.7 舛雌
			沿しし 21室 33.7 搾幻
			沿しし 28室 18.7 舛雌
			沿しし 28室 18.7 舛雌
			沿しし 28室 18.7 舛雌
			*/
		for (int repeatOut =0; repeatOut<MemArrayLength ; repeatOut++)
		{

			System.out.println("噺据税 失誤 : " + MemArray[repeatOut].getName());
			System.out.println("噺据税 蟹戚 : " + MemArray[repeatOut].getAge());
			System.out.println("噺据 BMI繊呪 : " + MemArray[repeatOut].getBmi());
			System.out.println("噺据税 BMI厭 : " + MemArray[repeatOut].getBmi("GRADE"));
			System.out.println("噺据税 持鰍析 : " + MemArray[repeatOut].getDateOfBirth());
			System.out.println("噺据税 迫衝莫 : " + MemArray[repeatOut].getBloodType());

			System.out.println("噺据税 徹    : " + MemArray[repeatOut].getHeight()); 
			System.out.println("噺据税 倖巷惟 : " + MemArray[repeatOut].getWeight());
			
			System.out.println("");		
			System.out.println("");
		}
		System.out.println("Hello World!");

	}
}
