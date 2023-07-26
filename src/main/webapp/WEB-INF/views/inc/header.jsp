<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
    <div class="container-fluid">
    <a class="navbar-brand" href="#">네이버 웹툰</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
			<div class="collapse navbar-collapse justify-content-between" id="collapsibleNavbar">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a class="navbar-brand" href="./all">Home</a>
					</li>
					<li class="nav-item">
						<a class="navbar-brand" href="./all">웹툰목록</a>
					</li>
					<li class="nav-item">
						<a class="navbar-brand" href="./add">웹툰추가</a>
					</li>
				</ul>
				<sec:authorize access="hasAuthority('ROLE_ADMIN')" var="isAdmin"></sec:authorize>
				<ul class="navbar-nav">
						<c:choose>
							<c:when test="${isAdmin}">
								<form action="${ pageContext.request.contextPath }/logout" method="POST">
									<button type="submit">로그아웃</button>
										<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />
										<!-- _csrf:는 보호되서 보내지게 해주는 기능 담당. 그리고 그걸 hidden으로 해서
										안보이게 -->
								</form>
							</c:when>
							<c:otherwise>
								<li class="nav-item"><a class="navbar-brand" href="${ pageContext.request.contextPath }/login">로그인</a></li>
							</c:otherwise>
						</c:choose>
					
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>