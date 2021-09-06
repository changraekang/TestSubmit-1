<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>



<!-- 네브바 시작  -->
<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="#">블로그</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="/WriteForm">글쓰기</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/CheckMyContents">내가 쓴 글 확인</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/UpdateUserForm">회원정보수정</a>
      </li>
    </ul>
  </div>  
</nav>
<br>


<h1>${sessionScope.principal.username }님 환영합니다</h1>



<div class="jumbotron text-center" style="margin-bottom:0">
  <p>강창래 9113</p>
  <p>📞010-9113-1917</p>
  <p>📬부산시 부산진구</p>
  <p>📝사업자번호: 055-232-1557</p>
</div>


</body>
</html>