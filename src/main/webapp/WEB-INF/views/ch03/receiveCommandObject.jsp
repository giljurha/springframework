<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/common/top.jsp" %>

	<div class="card">
		<div class="card-header">
			Get 방식 데이터 얻기
		</div>
			로그인 해야 볼 수 있는 내용
		<div class="card-body">
			<p>param1: ${ch03Dto.param1}</p>
			<p>param2: ${ch03Dto.param2}</p>
			<p>param3: ${ch03Dto.param3}</p>
			<p>param4: ${ch03Dto.param4}</p>
			<p>param5: ${ch03Dto.param5}</p>
		</div>
	</div>
	
<%@ include file="/WEB-INF/views/common/bottom.jsp" %>