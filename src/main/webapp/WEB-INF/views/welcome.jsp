<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./home">Home</a> <a
					class="navbar-brand" href="./home">게시판</a> <a class="navbar-brand"
					href="./home">쇼핑몰</a>
			</div>
		</div>
	</nav>

	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">${ hello }</h1>
		</div>
	</div>

	<div class="container">
		<div class="text-center">
			<h3>${ strapline }</h3>
		</div>
	</div>

	<footer class="container">
		<hr>
		<p>&copy; Webtoon</p>
	</footer>

</body>
</html>