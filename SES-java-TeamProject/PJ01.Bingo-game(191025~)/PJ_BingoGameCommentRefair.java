/**
====문서화 구간 시작==================================================================
1.본 클래스 설명
 : 빙고게임입니다. 1개의 직선을 완성하면 승리합니다.
   2명의 플레이어가 있습니다.

2.import하는 클래스
①import java.util.Scanner;
(이하없음)

3.메소드(함수) 설명
메소드①DrawSquare(String[] field)   : 빙고게임의 사각형 틀 및 숫자를 배치합니다.(10월24일 과제를 참고함.)
메소드②BubbleSortFlag(int[] player) : 사용자가 선택한 숫자들을 정렬합니다. 승리조건의 비교를 위해 진행합니다.  
(이하없음)

4. 변수설명(main 메소드만)
변수①String field[];			   
   : 3*3의 빙고판의 숫자(String형 자료)들을 출력합니다.
변수②	int gameLimit=field.length;								
   : 빙고판의 숫자만큼만 게임플레이(턴횟수)를 제한합니다.
변수③	int[][] victoryCondition;		
   : 승리조건의 값들을 갖는 8*1의 배열입니다.(3*3빙고판 기준)
변수④	Scanner input = new Scanner(System.in);
   : 사용자의 입력값을 받습니다.
변수⑤	int inputValue=Integer.MIN_VALUE;					 
   : Scanner형 변수(변수④ Scanner input)
     가 받은 값을 저장합니다.
변수⑥	int[] player1={0,0,0,0};							 
변수⑦	int[] player2={0,0,0,0};						 	 
   : 플레이어 1,플레이어 2 입력값을 받고 저장합니다.    
   입력된 값들은 버블정렬메소드를 통해 값이 정렬됩니다.
   값이 정렬되어야 승리조건과의 비교가 가능합니다.
변수⑧	int turnplayer1=0;
변수⑨	int turnplayer2=0;
  : 플레이어 1이 선택해온 입력값(변수⑥	int[] player1)이
    승리조건(변수③	int[][] victoryCondition)에 부합하는지 값을 확인합니다.
	(3*3빙고 게임기준) 
변수⑩	int flagTurn=0;			 
   : 어느 플레이어의 차례인지를 결정합니다.
	 값이 0: 플레이어1의 차례입니다. 
	 값이 1: 플레이어2의 차례입니다.
변수⑪	int winFlag1=0;										 
변수⑫	int winFlag2=0;		
  : 플레이어들의 승리조건을 체크하기위한 변수입니다.
    boolean조건문의 결과에 따라 3이상의 값을 가질경우 승리조건에 해당됩니다.

====문서화 구간 종료==================================================================
*/

import java.util.Scanner;

class PJ_BingoGameCommentRefair
{
	public static void main(String[] args) 
	{
	//[1]변수선언시작-------------------------------------------------
		String field[]={"1","2","3","4","5","6","7","8","9"};//변수①
		int gameLimit=field.length;							 //변수②
		int[][] victoryCondition={{1,2,3},
						  	 	  {4,5,6},
						  	 	  {7,8,9},
						  	 	  {1,4,7},
						  	 	  {2,5,8},
						  	 	  {3,6,9},
						  	 	  {1,5,9},
						  	 	  {3,5,7} };				 //변수③
		
		Scanner input = new Scanner(System.in);				 //변수④
		int inputValue=Integer.MIN_VALUE;					 //변수⑤
		int[] player1={0,0,0,0};							 //변수⑥
		int[] player2={0,0,0,0};						 	 //변수⑦
		int turnplayer1=0;									 //변수⑧
		int turnplayer2=0;									 //변수⑨
		int flagTurn=0;	//0: 플레이어1(X), 1: 플레이어2차례(O)		 //변수⑩
		int winFlag1=0;										 //변수⑪
		int winFlag2=0;										 //변수⑫
		//[1]변수선언종료--------------------------------------------------
			

		//[2]빙고게임시작--------------------------------------------------
		for (int turnCount=1 ; turnCount <= gameLimit ; turnCount++)
		{
			//step0.플레이어 선택 시작------------------------------------------
			DrawSquare(field); //빙고게임 필드 3*3 및 숫자 배치출력
			System.out.printf("턴 : %d \n",turnCount);
			System.out.printf("플레이어 %d의 차례입니다.\n",flagTurn+1);
			//step0.플레이어 선택 종료------------------------------------------
 
			//관리자 Log체크용 코드------------------------------------------------------
			//System.out.printf("player1 : %d, %d %d %d\n",player1[0],player1[1],player1[2],player1[3]);
			//System.out.printf("player2 : %d, %d %d %d\n",player2[0],player2[1],player2[2],player2[3]);
			//관리자 Log체크용 코드------------------------------------------------------
		

			//step1.플레이어의 값입력--------------------------------------------------------
			System.out.print("선택할 값을 입력하세요 : ");				
			inputValue=input.nextInt();
			//step1.플레이어의 값입력--------------------------------------------------------
	

			//step2.플레이어의 입력값 선택중복(중복입력) 체크---------------------------------------
			//		중복이 확인될경우 해당차수-처리하여 다시 입력받을 수 있도록 할것.			
			if(field[inputValue-1] == "X" || field[inputValue-1] == "O")
			{
				System.out.println("이미 선택된 값입니다. 다시 선택해주세요.");
				turnCount--; //카운트 증가처리를 막음으로써 중복선택이 턴카운트되는 오류를 삭제.
				continue;	 //이후의 실행내용들이 실행되지 않도록 통과처리.
			}	
			//step2.플레이어의 입력값 선택중복(중복입력) 체크 종료---------------------------------------
		
			//step3.선택된 숫자는 O/X으로 표기하기 시작--------------------------------------------
			else
			{
				switch (flagTurn)
				{
				case 0 : field[inputValue-1]="X";
						 player1[0]=inputValue;
					     System.out.println("turnplayer1 : "+turnplayer1);
				 		 System.out.printf("player1 : %d, %d %d %d\n",player1[0],player1[1],player1[2],player1[3]);
						 BubbleSortFlag(player1);

						 //관리자 Log체크용 코드//System.out.printf("<확인용>플레이어%d의 보유값 : %d\n",flagTurn+1,player[flagTurn]);
						 break;
				case 1 : field[inputValue-1]="O";
						 player2[0]=inputValue;
						 System.out.println("turnplayer2 : "+turnplayer2);
						System.out.printf("player2 : %d, %d %d %d\n",player2[0],player2[1],player2[2],player2[3]);
						 BubbleSortFlag(player2);

						//관리자 Log체크용 코드 //System.out.printf("<확인용>플레이어%d의 보유값 : %d\n",flagTurn+1,player[flagTurn]);//개발자확인용코드입니다. 완료시 삭제해주세요.
						 break;
				default : System.out.println("예상외의 에러발생입니다.");
						 break;
				}// switch end
			}//else end
			//step3.선택된 숫자는 O/X으로 표기하기 종료--------------------------------------------



			//step4.플레이어의 승리여부 확인---------------------------------------------------
			//		승리조건이 되는 victoryCondition배열의 값이 3개 이상 동일할 경우 승리로 판정한다.
				for(int CheckRow=0; CheckRow < victoryCondition.length; CheckRow++)
				{//승리조건victoryCondition에 여러행에 걸쳐 씌여있기에 행의라인수만큼 반복한다.
					for(int CheckCell=0 ; CheckCell <4 ; CheckCell++)
					{//승리조건이 {1,2,3}처럼 선언되어있기에 각 셀의 값을 확인한다.
						if(player1[CheckCell] == victoryCondition[CheckRow][0] 
						   || player1[CheckCell] == victoryCondition[CheckRow][1]
						   || player1[CheckCell] == victoryCondition[CheckRow][2])
						{
						  winFlag1++;
						}

						if(player2[CheckCell] == victoryCondition[CheckRow][0] 
						   || player2[CheckCell] == victoryCondition[CheckRow][1]
						   || player2[CheckCell] == victoryCondition[CheckRow][2])
						{
						  winFlag2++;
						}
					}	
					
					if(winFlag1>=3)//3*3판에 1라인 빙고이므로 3개가 동일선상일시 승리로 판단한다.
					{
						System.out.printf("플레이어 1이 승리하였습니다.");						
						System.out.println("게임을 종료합니다.");
						return;
					}
					else winFlag1=0; //승리조건에 부합못함을 확인했으므로 0으로 초기화.


					if(winFlag2>=3)	//3*3판에 1라인 빙고이므로 3개가 동일선상일시 승리로 판단한다.	
					{
						System.out.printf("플레이어 2이 승리하였습니다.");						
						System.out.println("게임을 종료합니다.");
						return;
					} 
					else winFlag2=0;//승리조건에 부합못함을 확인했으므로 0으로 초기화.

					
				}//승리확인 for 종료

				flagTurn=(flagTurn+1)%2; //증감후 나머지 연산하여 0,1으로 플레이어턴 결정

			//step4.플레이어의 승리여부 확인 종료---------------------------------------------------
		
		}//빙고게임 for end
	//[2]빙고게임종료--------------------------------------------------

	}//main method end

	

//Method-DrawSquare======================================================================================================
//사각형과 숫자를 그리는 메소드. main메소드가 너무 복잡해져서 DrawSquare라는 별도의 메소드로 분할하였다.
	public static void DrawSquare(String[] field) 
	{
		//String[] field : 메인메소드에서 빙고판의 숫자(String형 문자)들을 갖고 온다.
		int arraySellector=0;//사각형 생성 반복문으로는 적절한 숫자 생성을 할 수 없다.		

		for (int i=0; i<3; i++)//가로라인(숫자출력않는 부분만) 출력
		{
			switch (i)
			{
			case 0 : System.out.print("┌───────┬───────┬───────┐\n");	//맨위라인(바로출력)
					 break;
			case 1 : System.out.print("├───────┼───────┼───────┤\n");		//3우측 출력후, 6우측 출력후,9우측 출력후		
				     break;
			case 2 : System.out.print("├───────┼───────┼───────┤\n");		//3우측 출력후, 6우측 출력후,9우측 출력후		
					 break;
			default : System.out.print("정의되지않은 에러가 발생되었습니다.\n");
					  break;
			}
			
						
			for(int j=0; j<7 ;j++)// 숫자가 출력되는 라인들의 숫자들과 벽을 출력.
			{
				if(j%2==1) //출력할 숫자들을 선택한다.
				{
					System.out.printf("%s",field[arraySellector]);
					arraySellector++;	
				}

				switch (j)
				{
				case 0 : System.out.print("│   ");		//빙고판의 좌측벽을 그립니다.
						 break;							//1,4,7의 왼쪽 벽이 해당됩니다.

				case 2:  System.out.print("   │   ");	//빙고판의 중앙에서 왼쪽 직선을 그립니다.	
						 break;							//1~2, 4~5, 7~8 사이의 벽이 해당됩니다.

				case 4:  System.out.print("   │   ");	//빙고판의 중앙에서 오른쪽 직선을 그립니다.	
						 break;							//2~3, 5~6, 8~9 사이의 벽이 해당됩니다.

				case 6:  System.out.print("   │\n");	//빙고판의 우측벽을 그립니다.		
						 break;							//3,6,9의 우측 벽이 해당됩니다.
		
				default : System.out.print("");
						  break;
				}
			}
		}
		System.out.print("└───────┴───────┴───────┘\n");//마지막 부분 출력.		
	}// DrowSquare() method END
//Method-DrawSquare======================================================================================================



//Method-BubbleSort======================================================================================================
//BubbleSort : 버블정렬
//boolean형 Flag를 추가하여 
//정렬을 할 필요가 없다고 판단될 경우 임의종료(break)를 할 수 있도록 수정하였다.
	
	public static void BubbleSortFlag(int[] player) 
	{
		int temp=0;	  //배열의 값 이동을 바꾸기 위해 임시 저장하는 변수.		
		boolean flag; //정렬을 하는 중에 일정기간 정렬이 발생않을 경우 
					  //'정렬완료'로 알고 BubbleSortFlag메소드 종료.
			
	//관리자 Log체크용 코드------------------------------------------------------
	//현재 상태 출력
/*		for (int print=0; print <player.length; print++)
		{
			System.out.println("player"+print+": " + player[print]);
		}		
			System.out.println("");
*/
	//관리자 Log체크용 코드------------------------------------------------------

		//Benchmark : 기준점/버블정렬의 경우 맨끝의 셀부터 정렬된다.
		for (int Benchmark=player.length; Benchmark > 0 ; Benchmark-- )
		{
			//Comparison : 비교점, 기준점과 비교를 위해 기준점이외의 나머지 배열들을 선택.
			//관리자 Log체크용 코드----------------------------------------------
			//System.out.println("Benchmark : "+Benchmark);
			//관리자 Log체크용 코드----------------------------------------------	

			flag=true; 
			//flag가 true이면 더이상 정렬을 할 필요가 없으니 이만 종료한다.
			//flag가 flase이면 아직은 정렬을 해야 한다는 의미이니 계속진행하라를 결정한다.
			
			//Comparison : 비교점 / 버블정렬의 경우 n번째 셀과 n-1번째의 셀이 비교된다.
			for (int Comparison=0 ; Comparison <Benchmark-1; Comparison++)
			{
				if(player[Comparison] > player[Comparison+1])
				{
					temp=player[Comparison];
					player[Comparison]=player[Comparison+1];
					player[Comparison+1]=temp;
					flag=false; 
					//관리자 Log체크용 코드----------------------------------
					/*for (int print=0; print <player.length; print++)
					{		
						System.out.print(player[print]+" ");
					}		
					System.out.println("");*/
					//관리자 Log체크용 코드----------------------------------
				}//if end

			}//Comparison end 


			if(flag) break; //끝까지 정렬을 않아도 정렬을 종료한다.
							//버블정렬 반복중에 해당턴에서 정렬이 1번도 발생없기에 정렬완료로 간주한다.


			System.out.println("");//출력개행용
		}//interchangeSort end

			
		//변경된 상태 출력
		for (int print=0; print <player.length; print++)
		{
			System.out.print(player[print]+",");
		}		
		System.out.println("");
	}//BubbleSortFlag END
//Method-BubbleSort======================================================================================================

}//class class PJ_BingoGame END
