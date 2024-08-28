<!-- 태그 주석(응답에 포함) -->
<%-- JSP 주석(응답에 포함안됨) --%>

<%-- page 지시자 --%>
<%--
language: 프로그래밍 언어의 종류
pageEncoding: JSP 소스를 작성할 때 사용할 문자셋(다국어 이용 => UTF-8)
contentType: JSP 실행결과(응답 내용)의 종류(MIME; charset-응답을 구성하는 문자셋)
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<nav class="navbar navbar-dark bg-dark">
         <div class="ms-2">
            <a href="${pageContext.request.contextPath}" class="navbar-brand">
               <img width="40"
               src="${pageContext.request.contextPath}/resources/image/logo-spring.png">
               <span class="align-middle">전자정부프레임워크(Spring Framework)</span>
            </a>
         </div>

         <div class="me-2">
            <a class="btn btn-success btn-sm" href="#">로그인</a>
         </div>
      </nav>