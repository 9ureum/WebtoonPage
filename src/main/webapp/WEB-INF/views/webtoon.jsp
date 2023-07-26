<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<link href="${ pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>웹툰 정보 페이지</title>
</head>
<body>
<%@ include file="./inc/header.jsp" %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">웹툰 정보</h1>
			<!-- <h2>${ pageContext.request.contextPath }</h2> -->
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<p><img src="${ pageContext.request.contextPath }/resources/img/${webtoon.imgPath}"></p>
				<h3>${ webtoon.name }</h3>
				<p>${ webtoon.description }
				<br>
				<p><b>저자: </b>${ webtoon.author }
				<p><b>출판사 : </b>${ webtoon.website }
				<p><b>분류 : </b>${ webtoon.genre }
				<p><b>업데이트 날짜 : </b><span class="badge badge-info">${ webtoon.releaseDay }</span>
				<h4>${ webtoon.releaseDay } ${ webtoon.ranking }</h4>
				<br>
				<p><a href="${ webtoon.url }" class="btn btn-primary">웹툰보기 &raquo;</a>
				<a href="<c:url value='/webtoons/all'/>" class="btn btn-secondary">웹툰목록 &raquo;</a>
			</div>
		</div>
		<%@ include file="./inc/footer.jsp" %>

</body>
</html>