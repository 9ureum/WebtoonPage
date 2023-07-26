<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Webtoons</title>
</head>
<body>
	<%@ include file="./inc/header.jsp" %>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">웹툰 목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="center">
			<c:forEach items="${ webtoonList }" var="webtoon">
				<div class="col-md-4">
					<p>
						<img style="width:206px; height: 268px;" src="${ pageContext.request.contextPath }/resources/img/${webtoon.imgPath}">
					</p>
					<h3>${ webtoon.name }</h3>
					<p>${ webtoon.author }
						<br> ${ webtoon.genre } | ${ webtoon.releaseDay }
					<p align=left>${ fn:substring(webtoon.description, 0, 60) }...
					<p>${ webtoon.ranking }
					<p><a href="<c:url value="/webtoons/webtoon?name=${webtoon.name }" />" class="btn btn-secondary" role="button">상세보기 &raquo;</a>
				</div>
			</c:forEach>

		</div>
	</div>

	<%@ include file="./inc/footer.jsp" %>

</body>
</html>