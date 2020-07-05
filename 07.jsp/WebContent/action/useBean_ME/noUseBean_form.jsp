<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 회원정보를 입력받아 처리페이지(noUseBean_action.jsp)를 요청하여 전달하는 jsp 문서  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<h1>회원정보 입력</h1>
	<hr>
	<form action="noUseBean_action.jsp" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>번호</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">입력완료</button></td>
			</tr>
		</table>
	</form>
</body>
</html>