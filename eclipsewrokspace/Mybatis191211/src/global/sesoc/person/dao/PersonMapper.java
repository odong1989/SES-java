package global.sesoc.person.dao;

import java.util.ArrayList;

import global.sesoc.person.vo.Person;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface PersonMapper {
	//Person객체 저장
	public int insertPerson(Person p);//0리턴시 저장X, 1리턴시 저장?[맞는지 확인할것]
	//insertPerson과 매칭되는 SQL문은 어디에 있는가
	//답 : personMapper.xml
	//번호로 행 삭제
	public int deletePerson(int n);
}







