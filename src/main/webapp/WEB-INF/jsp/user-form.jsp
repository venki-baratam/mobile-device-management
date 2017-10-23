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
			<td><b>User Creation</b></td>
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
			<td>Mobile *</td>
			<td><form:input path="mobile" required="required" /></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>email *</td>
			<td><form:input path="email" required="required" /></td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td>Address *</td>
			<td><form:input path="address" required="required" /></td>
		</tr>
		
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><input type="submit" value="Create" /></td>
		</tr>
	</table>
</form:form>
