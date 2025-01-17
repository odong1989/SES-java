class theoremStringClassMethod 
{
	public static void main(String[] args) 
	{
	/*
		(java.lang소속의) String 클래스의 활용이 매우 중요하다고 API에 적혀있는 모든 메소드를 테스트하고 있다.
		
		(1)반환형이 Boolean형인 경우	
		(2)반환하는 형태가 char형인 경우

	*/

//반환형이 Boolean형인 경우=======================================================================================
/*간략 목록
1)boolean contains(CharSequence s)															//contains : 포함
2)boolean contentEquals(CharSequence cs)													//content Equals : 내용이 같다
3)boolean contentEquals(StringBuffer sb)													//content Equals : 내용이 같다 
4)boolean endsWith(String suffix)															//endsWith : ~로 끝나다
5)boolean equals(Object anObject)															//equals : ~같다
6)boolean equalsIgnoreCase(String anotherString)											//equalsIgnoreCase : 대소 문자 무시
7)boolean isEmpty()																			//isEmpty : 비었다.
8)boolean matches(String regex)																//matches : 성냥(응?)
9)boolean regionMatches(boolean ignoreCase,int toffset, String other,int ooffset,int len)	//regionMatches : 지역일치
10)boolean regionMatches(int toffset, String other,int ooffset,int len)						//regionMatches : 지역일치
11)boolean startsWith(String prefix)														//startsWith : ~로 시작
12)boolean startsWith(String prefix,int toffset)											//startsWith : ~로 시작
*/
//---------------------------------------------------------------------------------------------------------
	/*	
		1)boolean contains(CharSequence s) 
		//Returns true if and only if this string contains the specifiedsequence of char values.
		//이 캐릭터 라인에 지정된 순서의 char 치가 포함되는 경우에 한정해 true를 리턴합니다.
	*/	
//---------------------------------------------------------------------------------------------------------		
	/*2,3)contentEquals시리즈(총2개)
		2)boolean contentEquals(CharSequence cs) 
		Compares this string to the specified CharSequence.
		//이 문자열을 지정된 CharSequence와 비교합니다.

		3)boolean contentEquals(StringBuffer sb) 
		Compares this string to the specified StringBuffer.
		//이 문자열을 지정된 StringBuffer와 비교합니다.
	*/
//---------------------------------------------------------------------------------------------------------		
	/*4)boolean endsWith(String suffix) 
		Tests if this string ends with the specified suffix.
	*/
//---------------------------------------------------------------------------------------------------------		
	/*5,6)equals시리즈(총2개)

		boolean equals(Object anObject) 
		Compares this string to the specified object.
		 
		boolean equalsIgnoreCase(String anotherString) 
		Compares this String to another String, ignoring caseconsiderations.
	*/
//---------------------------------------------------------------------------------------------------------		
/*7)boolean isEmpty() 
Returns true if, and only if, length() is 0.
*/
//---------------------------------------------------------------------------------------------------------		
/*8)boolean matches(String regex) 
Tells whether or not this string matches the given regular expression.
*/

//---------------------------------------------------------------------------------------------------------		
 /*
9)boolean regionMatches(boolean ignoreCase,int toffset, String other,int ooffset,int len) 
Tests if two string regions are equal.
 
10)boolean regionMatches(int toffset, String other,int ooffset,int len) 
Tests if two string regions are equal.
*/


//---------------------------------------------------------------------------------------------------------		

/* 
11)boolean startsWith(String prefix) 
Tests if this string starts with the specified prefix.
 
12)boolean startsWith(String prefix,int toffset) 
Tests if the substring of this string beginning at thespecified index starts with the specified prefix.
*/





//반환하는 형태가 char형인 경우=======================================================================================
/*간단목록
1)char charAt(int index)
2)char[] toCharArray() 


*/
//---------------------------------------------------------------------------------------------------------		
	//1)char charAt(int index)  
	//Returns the char value at thespecified index.
	//지정된 인덱스에서 char 값을 반환합니다.


//---------------------------------------------------------------------------------------------------------		
/*
2)char[] toCharArray() 
Converts this string to a new character array.	
*/
//---------------------------------------------------------------------------------------------------------	




//반환하는 형태가 int형인 경우=======================================================================================	
/*간단목록
1)int codePointAt(int index)							//codePointAt : 코드포인트
2)int codePointBefore(int index)						//codePointBefore : 이전 코드 포인트
3)int codePointCount(int beginIndex,int endIndex)		//codePointCount : 코드 포인트의 갯수
4)int compareTo(String anotherString)					//compareTo : 비교하다
5)int compareToIgnoreCase(String str)					//compareToIgnoreCase : 사례를 무시하기 위해 비교
6)int indexOf(int ch)									//indexOf : 색인
7)int indexOf(int ch,int fromIndex)						//※ (책 속에 다루어진 중요한 단어나 용어를 
8)int indexOf(String str)								//	  독자가 쉽게 찾을 수 있도록 페이지를 밝혀 벌여 놓은 것.)
9)int indexOf(String str,int fromIndex)					//자바의 String객체에서는 "검색"이라고 생각하면 되겠다.   
10)int lastIndexOf(int ch)								//lastIndexOf : 마지막색인
11)int lastIndexOf(int ch,int fromIndex)				//
12)int lastIndexOf(String str)							//
13)int lastIndexOf(String str,int fromIndex)			//
14)int hashCode()										//
15)int length()											//			
16)int offsetByCodePoints(int index,int codePointOffset)//

*/
//---------------------------------------------------------------------------------------------------------
	/*1~3) codePoint 시리즈(총3개)

	1)int codePointAt(int index) 
	Returns the character (Unicode code point) at the specifiedindex.
	//지정된 인덱스의 문자 (유니 코드 코드 포인트)를 반환합니다.
		
	2)int codePointBefore(int index) 
	Returns the character (Unicode code point) before the specifiedindex.
	//지정된 인덱스 앞에있는 문자 (유니 코드 코드 포인트)를 반환합니다.
		 
	3)int codePointCount(int beginIndex,int endIndex) 
	Returns the number of Unicode code points in the specified textrange of this String.
	//이 문자열의 지정된 텍스트 범위에서 유니 코드 코드 포인트 수를 반환합니다.

	*/  

//---------------------------------------------------------------------------------------------------------
	/*4~5) compareTo 시리즈(총2개)

		4)int compareTo(String anotherString) 
		Compares two strings lexicographically.
		 //두 문자열을 사전 식으로 비교합니다.
		5)int compareToIgnoreCase(String str) 
		Compares two strings lexicographically, ignoring casedifferences.
		//대소 문자 차이를 무시하고 사전 식으로 두 문자열을 비교합니다.
	*/


//---------------------------------------------------------------------------------------------------------		
/*
	6)int indexOf(int ch) 
	Returns the index within this string of the first occurrence ofthe specified character.
	 
	7)int indexOf(int ch,int fromIndex) 
	Returns the index within this string of the first occurrence of thespecified character, starting the search at the specified index.
	 
	8)int indexOf(String str) 
	Returns the index within this string of the first occurrence of thespecified substring.
	 
	9)int indexOf(String str,int fromIndex) 
	Returns the index within this string of the first occurrence of thespecified substring, starting at the specified index.
*/
//---------------------------------------------------------------------------------------------------------		
/*



10)int lastIndexOf(int ch) 
Returns the index within this string of the last occurrence ofthe specified character.
 
11)int lastIndexOf(int ch,int fromIndex) 
Returns the index within this string of the last occurrence ofthe specified character, searching backward starting at thespecified index.
 
12)int lastIndexOf(String str) 
Returns the index within this string of the last occurrence of thespecified substring.
 
13)int lastIndexOf(String str,int fromIndex) 
Returns the index within this string of the last occurrence of thespecified substring, searching backward starting at the specified index.

*/



//---------------------------------------------------------------------------------------------------------		
	/*14)int hashCode() 
		Returns a hash code for this string.
*/


//---------------------------------------------------------------------------------------------------------		

/*
15)int length() 
Returns the length of this string.
 */

//---------------------------------------------------------------------------------------------------------				
/*
16)int offsetByCodePoints(int index,int codePointOffset) 
Returns the index within this String that isoffset from the given index by codePointOffset code points.
*/






//반환형이 String형인 경우=======================================================================================
/*
//1)String concat(String str)  
2)static String copyValueOf(char[] data)							//copyValueOf : 복사 가치
3)static String copyValueOf(char[] data,int offset,int count)		//copyValueOf : 복사 가치
4)static String valueOf(boolean b)
5)static String valueOf(char c) 
6)static String valueOf(char[] data) 
7)static String valueOf(char[] data,int offset,int count)
8)static String valueOf(double d)
9)static String valueOf(float f)
10)static String valueOf(int i) 
11)static String valueOf(long l) 
12)static String valueOf(Object obj) 
13)static String format(Locale l, String format, Object... args) 
14)static String format(String format, Object... args) 
15)String intern() 
16)static String join(CharSequence delimiter, CharSequence... elements) 
17)static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) 
18)String replace(char oldChar,char newChar) 
19)String replace(CharSequence target, CharSequence replacement) 
20)String replaceAll(String regex, String replacement) 
21)String replaceFirst(String regex, String replacement) 
22)String[] split(String regex)  
23)String[] split(String regex,int limit) 
24)String substring(int beginIndex) 
25)String substring(int beginIndex,int endIndex) 
26)String toLowerCase() 
27)String toLowerCase(Locale locale) 
28)String toString() 
29)String toUpperCase() 
30)String toUpperCase(Locale locale) 
31)String trim() 
*/
//---------------------------------------------------------------------------------------------------------
	/*1)String concat(String str) 
	Concatenates the specified string to the end of this string.
	지정된 문자열을이 문자열의 끝에 연결합니다.
	*/


//---------------------------------------------------------------------------------------------------------
	/*2~3) copyValueOf 시리즈(총 2개)


		2)static String copyValueOf(char[] data) 
		//Equivalent to valueOf(char[]).
		 //valueOf (char [])와 같습니다.
		3)static String copyValueOf(char[] data,int offset,int count) 
		Equivalent to valueOf(char[], int, int).

	
	*/


//---------------------------------------------------------------------------------------------------------		

/*4~12)valueOf시리즈(총9개)
		4)static String valueOf(boolean b) 
		Returns the string representation of the boolean argument.
		//부울 인수의 문자열 표현을 리턴합니다.

		5)static String valueOf(char c) 
		Returns the string representation of the charargument.
		//charargument의 문자열 표현을 리턴합니다.
		
		6)static String valueOf(char[] data) 
		Returns the string representation of the char arrayargument.
		 //char 배열 인수의 문자열 표현을 리턴합니다.

		7)static String valueOf(char[] data,int offset,int count) 
		Returns the string representation of a specific subarray of the char array argument.
		 //char 배열 인수의 특정 하위 배열에 대한 문자열 표현을 리턴합니다.

		8)static String valueOf(double d) 
		Returns the string representation of the double argument.
		 //double 인수의 문자열 표현을 리턴합니다.

		9)static String valueOf(float f) 
		Returns the string representation of the float argument.
			
		10)static String valueOf(int i) 
		Returns the string representation of the int argument.
		 
		11)static String valueOf(long l) 
		Returns the string representation of the long argument.
		 
		12)static String valueOf(Object obj) 
		Returns the string representation of the Object argument. 

*/

//---------------------------------------------------------------------------------------------------------		
	/*13~14)format시리즈(총2개)

		13)static String format(Locale l, String format, Object... args) 
		Returns a formatted string using the specified locale, format string,and arguments.
		 
		14)static String format(String format, Object... args) 
		Returns a formatted string using the specified format string andarguments.
	*/

//---------------------------------------------------------------------------------------------------------		
/* 
15)String intern() 
Returns a canonical representation for the string object.
*/




//---------------------------------------------------------------------------------------------------------		
/*
16)static String join(CharSequence delimiter, CharSequence... elements) 
Returns a new String composed of copies of the CharSequence elements joined together with a copy ofthe specified delimiter.
 
17)static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) 
Returns a new String composed of copies of the CharSequence elements joined together with a copy of thespecified delimiter.
*/




//---------------------------------------------------------------------------------------------------------		
/*
18)String replace(char oldChar,char newChar) 
Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
 
19)String replace(CharSequence target, CharSequence replacement) 
Replaces each substring of this string that matches the literal targetsequence with the specified literal replacement sequence.
 
20)String replaceAll(String regex, String replacement) 
Replaces each substring of this string that matches the given regular expression with thegiven replacement.
 
21)String replaceFirst(String regex, String replacement) 
Replaces the first substring of this string that matches the given regular expression with thegiven replacement.
*/


//---------------------------------------------------------------------------------------------------------		
/*
22)String[] split(String regex) 
Splits this string around matches of the given regular expression.
 
23)String[] split(String regex,int limit) 
Splits this string around matches of the given regular expression.
*/


//---------------------------------------------------------------------------------------------------------		

/* 
24)String substring(int beginIndex) 
Returns a string that is a substring of this string.
 
25)String substring(int beginIndex,int endIndex) 
Returns a string that is a substring of this string.
*/





//---------------------------------------------------------------------------------------------------------		
/*
26)String toLowerCase() 
Converts all of the characters in this String to lowercase using the rules of the default locale.
 
27)String toLowerCase(Locale locale) 
Converts all of the characters in this String to lowercase using the rules of the given Locale.
 */


//---------------------------------------------------------------------------------------------------------		
/*
28)String toString() 
This object (which is already a string!) is itself returned.
*/


//---------------------------------------------------------------------------------------------------------		
/*
29)String toUpperCase() 
Converts all of the characters in this String to uppercase using the rules of the default locale.
 
30)String toUpperCase(Locale locale) 
Converts all of the characters in this String to uppercase using the rules of the given Locale.
*/


//---------------------------------------------------------------------------------------------------------		
/*
31)String trim() 
Returns a string whose value is this string, with any leading and trailingwhitespace removed.
*/






//---------------------------------------------------------------------------------------------------------		









//반환이 없거나, 현재 파악이 불가능한 것.=================================================================================================
/*
1)byte[] getBytes()													//getBytes : 바이트를 얻다
2)byte[] getBytes(Charset charset) 									//getBytes : 바이트를 얻다
3)void getBytes(int srcBegin,int srcEnd,byte[] dst,int dstBegin)	//getBytes : 바이트를 얻다
4)byte[] getBytes(String charsetName)								//getBytes : 바이트를 얻다
5)void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)	//getChars : 숯불(응?)
6)CharSequence subSequenceget Bytes(int beginIndex,int endIndex)	//subSequence : 서브 시퀀스
*/

//---------------------------------------------------------------------------------------------------------		
	/*1~4)getBytes시리즈(총4개)

		
		
		1)byte[] getBytes() 
		Encodes this String into a sequence of bytes using theplatform's default charset, storing the result into a new byte array.
		 
		2)byte[] getBytes(Charset charset) 
		Encodes this String into a sequence of bytes using the given charset, storing the result into anew byte array.
		 
		3)void getBytes(int srcBegin,int srcEnd,byte[] dst,int dstBegin) 
		Deprecated.  
		This method does not properly convert characters intobytes. As of JDK 1.1, the preferred way to do this is via the getBytes() method, which uses the platform's default charset.
		 
		4)byte[] getBytes(String charsetName) 
		Encodes this String into a sequence of bytes using the namedcharset, storing the result into a new byte array.
	*/

//---------------------------------------------------------------------------------------------------------		
	/*5)void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin) 
		Copies characters from this string into the destination characterarray.

*/


//---------------------------------------------------------------------------------------------------------		
/*
6)CharSequence subSequence(int beginIndex,int endIndex) 
Returns a character sequence that is a subsequence of this sequence.
*/




		
		System.out.println("Hello World!");
	}
}
