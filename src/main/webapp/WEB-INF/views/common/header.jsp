<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  
	  <a class="navbar-brand" href="#">
	    <img src='<c:url value="/resources/img/bird.jpg"/>' alt="logo" style="width:40px;">
	  </a>
	  
	  <!-- Links -->
	  <ul class="navbar-nav">
	  <c:if test="${user == null}">
		  <li class="nav-item">
		      <a class="nav-link" href="<c:url value="/signup"/>">회원가입</a>
		    </li>
		    <li class="nav-item">
		      <a class="nav-link" href="<c:url value="/login"/>">로그인</a>
		    </li>
	  </c:if>
	  
	  <li class="nav-item">
	  		<a class="nav-link" href="<c:url value="/admin/board"/>">게시판 관리</a>
	  </li>
	  
	  <c:if test="${user != null}">
		   <li class="nav-item">
				<a class="nav-link" href="<c:url value="/logout"/>">로그아웃</a>
		   </li>
	  </c:if>
	    
	  </ul>
	</nav>
</head>
<body>
	
</body>
</html>
