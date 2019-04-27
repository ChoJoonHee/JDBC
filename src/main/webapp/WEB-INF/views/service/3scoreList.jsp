<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>점수 등록 결과</h2>
	
	<!-- 
	onclick속성 안에는 클릭했을 때 실행되는 자바스크립트 함수가 들어갑니다. 
	location.href = '경로'   기능은 자바스크립트 페이지 이동 기능 
	
	현재 포문의 index번호를 알수있는 상태변수 num
	-->
	
	<c:forEach var="good" items="${scoreList }" varStatus="num">
		번호: ${good.num}
		이름: ${good.name }
		국어: ${good.kor }
		영어: ${good.eng }
		수학: ${good.math }
		<input type="button" value="삭제" onclick="location.href='scoreDelete?num=${good.num}' ">
		
		<br>
	</c:forEach>
	
	<a href="1scoreRegister">점수 등록하러 가기</a>
	
	
	
	
</body>
</html>