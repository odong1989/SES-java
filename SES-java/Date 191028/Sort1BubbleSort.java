//BubbleSort : ��������

class Sort1BubbleSort
{
	public static void main(String[] args) 
	{
		//������ ����
		int ar[] = {10,5, 1, 60, 35, 40, 90, 15, 3, 80};
		int temp=0;

		//���� ���� ���
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
			System.out.println("");

		//�� ��ȯ
		//Benchmark : ������
		for (int Benchmark=ar.length; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : ����, �������� �񱳸� ���� �������̿��� ������ �迭���� ����.
			System.out.println("Benchmark : "+Benchmark);
			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(ar[Comparison] > ar[Comparison+1])
				{
					temp=ar[Comparison];
					ar[Comparison]=ar[Comparison+1];
					ar[Comparison+1]=temp;

					for (int print=0; print <ar.length; print++)
					{		
						System.out.print(ar[print]+" ");
					}		
					System.out.println("");
				}//if end
			}//Comparison end 
			System.out.println("");
		}//interchangeSort end

		//����� ���� ���
		for (int print=0; print <ar.length; print++)
		{
			System.out.println("ar"+print+": " + ar[print]);
		}		
		System.out.println("");
	}
}