import java.util.Scanner;

class ArrayTest9 
{
	public static void main(String[] args) 
	{
		/*
			조건① 배열을 생성하고 무작위로 5개의 숫자를 받으십시오
			    (랜덤범위 : 1 ~ 15)
			조건②사용자에게 1개의 숫자를 입력받습니다.
			조건③사용자가 입력한 값이 5개의 랜덤생성중에 있는지 확인
		*/
//===================================================================

	int input_save=0;
	Scanner input = new Scanner(System.in);
	int ar[];	
	ar = new int[5];

	System.out.print(" 1~15중 원하는 숫자 입력: ");
	input_save = input.nextInt();


	//랜덤5개 생성 및 배열 저장
	for (int i=0; i<ar.length ;i++ )
	{
		ar[i]=(int)(Math.random()*15)+1;
	}

	
	for(int j =0; j<ar.length ; j++)
	{
		if(ar[j] == input_save)
		{
			System.out.println(" 축하합니다! 당첨입니다!");
			break;
		}
		System.out.print(ar[j] + " ");
	}


//---------------------------------------------------------------




	}
}
