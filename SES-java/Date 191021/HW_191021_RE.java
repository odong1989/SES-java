import java.util.Scanner;
import java.lang.Math;
 

class HW_191021_RE 
{
	public static void main(String[] args) 
	{
		//선언
		Scanner input=new Scanner(System.in);
		int input_temp;
		int[] data;
		data = new int[10];
		int[] result= {0,0,Integer.MIN_VALUE,Integer.MAX_VALUE};


		//for-1 start
		for(int i=0; i < data.length; i++)
		{
			System.out.print(i+"번째 값 입력 : ");
			input_temp=input.nextInt();
			
			data[i]=input_temp;

			//최대값체크
			if(result[2] < input_temp)
			{
				result[2]=input_temp;
			}

			//최소값체크
			if(result[3] > input_temp)
			{
				result[3]=input_temp;
			}
			result[0]+=input_temp;
		}//for-1 end


		result[1] = result[0] / data.length;
		System.out.println("합계값"+result[0]);				
		System.out.println("평균값"+result[1]);				
		System.out.println("최대값"+result[2]);				
		System.out.println("최소값"+result[3]);				

		for (int j =0; j < data.length ; j++)
		{
			if( Math.abs(result[1])-Math.abs(data[j]) >=10)
			{
			System.out.print(data[j]+" ");				
			}

		}

	}
}
