<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Book Form tag</title>
</head>
<body>
  	<%@ include file="./inc/header.jsp" %>

   <div class="jumbotron">
      <div class="container">
         <h1 class="display-3">웹툰 등록</h1>
      </div>
   </div>

   <div class="container">
      <div class="row">
         <div class="col-md-12">
            <form:form modelAttribute="newWebtoon" class="form-horizontal" method="POST" enctype="multipart/form-data">
            <fieldset>
            <legend>${ addTitle }</legend>

            <div class="form-group row">
               <label class="col-sm-2 control-label">웹툰 제목</label>
               <div class="col-sm-3">
                  <form:input path="name" class="form-control"/>
               </div>   
            </div>
            
            
            <div class="form-group row">
               <label class="col-sm-2 control-label">저자</label>
               <div class="col-sm-3">
                  <form:input path="author" class="form-control"/>
               </div>   
            </div>
            
            <div class="form-group row">
				<label class="col-sm-2 control-label">사진 추가</label>
				<div class="col-sm-3">
					<form:input style="border:0px;" path="imageFile" type="file" class="form-control" />
					<input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}" />
				</div>
			</div>
            <div class="form-group row">
               <label class="col-sm-2 control-label">상세설명</label>
               <div class="col-sm-5">
                  <form:textarea style="resize:none;" path="description" cols="50" rows="3" class="form-control"/>
               </div>
            </div>
            
            <div class="form-group row">
               <label class="col-sm-2 control-label">출판사</label>
               <div class="col-sm-3">
                  <form:input path="website" class="form-control"/>
               </div>   
            </div>
            
            <div class="form-group row">
               <label class="col-sm-2 control-label">장르</label>
               <div class="col-sm-3">
                  <form:input path="genre" class="form-control"/>
               </div>   
            </div>
            

            <div class="form-group row">
               <label class="col-sm-2 control-label">출판일</label>
               <div class="col-sm-3">
                  <form:input path="releaseDay" class="form-control"/>
               </div>   
            </div>
            
            <div class="form-group row">
               <label class="col-sm-2 control-label">링크</label>
               <div class="col-sm-3">
                  <form:input path="url" class="form-control"/>
               </div>   
            </div>
            
            <div class="form-group row">
               <div class="col-sm-offset-2 col-sm-10">
                  <input type="submit" class="btn btn-primary" value="등록">
               </div>
            </div>
            
            </fieldset>
            </form:form>
            
        	<%@ include file="./inc/footer.jsp" %>
        
         </div>
      </div>
   </div>

   
</body>
</html>