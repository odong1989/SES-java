DROP TABLE BOOKLIST;
DROP SEQUENCE BOOKLIST_SEQ;
CREATE TABLE BOOKLIST(
--(1)칼럼명		(2)자료형			(3)제약조건
 BOOKCODE		NUMBER			PRIMARY KEY, --코드
 BOOKNAME		VARCHAR2(100)  	NOT NULL,			  --서적명 	
 BOOKFORMAT	    VARCHAR2(20)	NOT NULL,			  --서적종류(종이책,전자책,pdf등)	
 SAlES			NUMBER			DEFAULT 0,			  --판매량			
 BOOKKINDS		VARCHAR2(100)	NOT NULL             --서적종류(경영도서, 참고서등) hashmap 실시
 );

CREATE SEQUENCE BOOKLIST_SEQ;