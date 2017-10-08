<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" action="create">
	<table width="100%">
		<tr>
			<td width="100%" align="right"><a href="/mdm"><H1>Home</H1></a> </br></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><b>Mobile Creation</b></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>Name *</td>
			<td><form:input path="name" required="required" /></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>Colour *</td>
			<td><form:input path="colour" required="required" /></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>Model *</td>
			<td><form:input path="model" required="required" /></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>Brand *</td>
			<td><form:input path="brand" required="required" /></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>OS *</td>
			<td><form:input path="os" required="required" /></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>IMEI Number *</td>
			<td><form:input path="imei" required="required" /></td>
		</tr>
		
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><input type="submit" value="Create" /></td>
		</tr>
	</table>
</form:form>
