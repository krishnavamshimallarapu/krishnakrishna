<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="formElement"	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:url value="/feedback"  var="formurl"/>

<form:form method="post" commandName="feedBackForm" action="${formurl}">
	
	<formElement:formInputBox idKey="register.firstName"
		labelKey="register.firstName" path="name" inputCSS="form-control"
		mandatory="true" />	
	<formElement:formInputBox idKey="register.email"
		labelKey="register.email" path="email" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="register.comment"
		labelKey="register.comment" path="comment" inputCSS="form-control"
		mandatory="true" />
	<div class="form-actions clearfix">
		<ycommerce:testId code="register_Register_button">
			<button type="submit" class="btn btn-default btn-block">
				<spring:theme code='feedback.submit.button' text="Submit" />
			</button>
		</ycommerce:testId>
	</div>
</form:form>

</body>
</html>