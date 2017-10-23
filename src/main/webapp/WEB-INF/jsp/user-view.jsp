<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post">
	<table width="100%">
		<tr>
			<td width="100%" align="right"><a href="/mdm"><H1>Home</H1></a>
				</br></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><b>View User</b></td>
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
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td><b>Name:</b></td>
			<td>${user.name}</td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td><b>Email:</b></td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td><b>Mobile:</b></td>
			<td>${user.mobile}</td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>

		<tr>
			<td colspan="3"></td>
		</tr>

		<tr>
			<td colspan="3" align="center"><button type="button"
					onclick="javascript:window.close()">Close</button></td>
		</tr>
	</table>
</form:form>
