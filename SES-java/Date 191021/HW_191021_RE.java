import java.util.Scanner;
import java.lang.Math;
 

class HW_191021_RE 
{
	public static void main(String[] args) 
	{
		//����
		Scanner input=new Scanner(System.in);
		int input_temp;
		int[] data;
		data = new int[10];
		int[] result= {0,0,Integer.MIN_VALUE,Integer.MAX_VALUE};


		//for-1 start
		for(int i=0; i < data.length; i++)
		{
			System.out.print(i+"��° �� �Է� : ");
			input_temp=input.nextInt();
			
			data[i]=input_temp;

			//�ִ밪üũ
			if(result[2] < input_temp)
			{
				result[2]=input_temp;
			}

			//�ּҰ�üũ
			if(result[3] > input_temp)
			{
				result[3]=input_temp;
			}
			result[0]+=input_temp;
		}//for-1 end


		result[1] = result[0] / data.length;
		System.out.println("�հ谪"+result[0]);				
		System.out.println("��հ�"+result[1]);				
		System.out.println("�ִ밪"+result[2]);				
		System.out.println("�ּҰ�"+result[3]);				

		for (int j =0; j < data.length ; j++)
		{
			if( Math.abs(result[1])-Math.abs(data[j]) >=10)
			{
			System.out.print(data[j]+" ");				
			}

		}

	}
}