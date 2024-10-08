<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- include 지시자의 역할: 외부의 파일의 내용을 가져와서 삽입시켜줌 --%>
<%-- include 액션의 역할: 외부의 JSP를 실행하고 그 결과를 삽입시켜줌 --%>
<%@ include file="/WEB-INF/views/common/top.jsp" %>

<div class="card">
   <div class="card-header">
   		상품 목록
   </div>

   <div class="card-body">
      
		<div class="m-3">
      		<ul>
      			<c:forEach items="${productList}" var="item">
	      			<li class="m-2">
		      			<span>${item.pname}</span>
		      			<a href="cartadd?pno=${item.pno}&pname=${item.pname}" class="btn btn-info btn-sm">장바구니 보기</a>
	      			</li>      			
      			</c:forEach>
      		</ul>
		</div>
      
   </div>
</div>

<%@ include file="/WEB-INF/views/common/bottom.jsp" %>

<!-- 
<jsp:include page="/WEB-INF/views/common/bottom.jsp"></jsp:include>
 -->


