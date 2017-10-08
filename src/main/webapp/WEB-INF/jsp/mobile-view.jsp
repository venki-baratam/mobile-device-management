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
			<td><b>View Mobile</b></td>
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
			<td>${mobile.name}</td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td><b>Colour:</b></td>
			<td>${mobile.colour}</td>
		</tr>
		<tr>
			<td colspan="3"></td>
		</tr>
		<tr>
			<td></td>
			<td><b>Brand:</b></td>
			<td>${mobile.brand}</td>
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
