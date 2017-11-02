<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" action="assign">

	<table width="100%">
		<tr>
			<td width="100%" align="right"><a href="/mdm"><H1>Home</H1></a>
				</br></td>
		</tr>
	</table>
	<table>

		<tr>
			<td><b>Mobile Assign To User</b></td>
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
			<td>Users *</td>
			<td><select name="user.id" id="user" required="required">
					<option value="">Select</option>
					<c:forEach items="${users}" var="us">

						<option value="${us.id}">${us.name}</option>

					</c:forEach>
			</select></td>

		</tr>
		
		<tr>
			<td colspan="3"></td>
		</tr>

		<tr>
			<td></td>
			<td>Mobiles *</td>
			<td><select name="mobile.id" id="mobile" required="required">
					<option value="">Select</option>
					<c:forEach items="${mobiles}" var="mb">

						<option value="${mb.id}">${mb.name}</option>

					</c:forEach>
			</select></td>

		</tr>

		<tr>
			<td colspan="3" align="center"><input type="submit"
				value="Assign" id="assign" /></td>
		</tr>
	</table>
</form:form>