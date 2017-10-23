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
			<td><b>User</b></td>
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
			<td><select name="user" id="user" required="required">
					<option value="">Select</option>
					<c:forEach items="${users}" var="us">

						<option value="${us.id}">${us.name}</option>

					</c:forEach>
			</select></td>

		</tr>

		<tr>
			<td colspan="3" align="center"><input type="button"
				value="Search" id="search" onclick="onSubmit();" /></td>
		</tr>
	</table>
</form:form>


<script type="text/javascript">
	function onSubmit() {
		if (document.getElementById("user").value) {
			document.forms[0].action = "/mdm/user/view/"
					+ document.getElementById("user").value;
			document.forms[0].submit();
		} else
			alert("Please select user");
	}
</script>
