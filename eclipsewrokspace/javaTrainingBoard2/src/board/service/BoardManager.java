package board.service;

import java.util.ArrayList;
import board.vo.Board;

/**
 * 하위 클래스에서 구현할 추상 메소드들을 정의한 인터페이스
 */
public interface BoardManager {
	/**
	 * 리스트에 새 글정보를 추가
	 * @param board 추가할 글 정보
	 * @return 저장 성공 여부
	 */
	public boolean add(Board board);//자세한 내용은 상속받는 애들이 알아서 정의해야한다.(#가이드만 지정)
	//-------------------------------------------------------------------------------------

	/**
	 * 리스트의 모든 내용 리턴
	 * @return 리스트 객체
	 */
	public ArrayList<Board> listAll();//자세한 내용은 상속받는 애들이 알아서 정의해야한다.(#가이드만 지정)
	//-------------------------------------------------------------------------------------
	
	
	/**
	 * 전달된 번호의 글 정보 리턴
	 * @param num 글번호
	 * @return 해당 번호의 글 정보
	 */
	public Board getBoard(int num);//자세한 내용은 상속받는 애들이 알아서 정의해야한다.(#가이드만 지정)
	//-------------------------------------------------------------------------------------
	
	/**
	 * 전달된 번호의 글 삭제
	 * @param num 삭제할 글번호
	 * @return 삭제 성공 여부
	 */
	public boolean remove(int num);
	//-------------------------------------------------------------------------------------
	
	
	public void saveFile();
	//-------------------------------------------------------------------------------------

}
