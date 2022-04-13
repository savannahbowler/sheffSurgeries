<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title> Surgeries Management System - Advanced Search</title>
</head>
<body>
<div class="row">
	<h1>Surgeries Management System</h1>
<formset>
	<legend>Advanced Search for Prescriptions</legend>
<table>
	<g:form action="advResults">
	<tr>
		<td>Medicine</td>
		<td><g:textField name="medicine"/></td>
	</tr>
	<tr>
		<td>Query Type:</td>
	<td><g:radioGroup name="queryType" labels="['And','Not']" values="['and','not']" value="and">

${it.radio}${it.label}

	</g:radioGroup>
	</td>
	</tr>
	<tr>
	<td/>
	<td>
		<g:submitButton name="search" value="Search"/></td>
	</tr>
	</g:form>
</table>
</formset>
</div>
</body>
</html>

