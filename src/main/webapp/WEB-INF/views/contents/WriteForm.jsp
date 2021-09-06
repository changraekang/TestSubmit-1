<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="write.jsp" method="post">
	<table>
	<caption><h2>새글 쓰기</h2></caption>	
	<tr>
		<th>제목</th>
		<td><input type="text" name="title" /></td>
		<input type="hidden" name="username" value="${sessionScope.principal.username }" />
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea name="content" rows="10" cols="80"></textarea></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="저장" />		
		</td>
	</tr>
	
	</table>
	</form>
</body>
</html>