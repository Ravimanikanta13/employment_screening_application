<!DOCTYPE html>
<html>
<head>
<title>Employee personal details</title>
<style>
table {
	border-color: #D3D3D3;
}
</style>
</head>
<body>
	<h1 style="color: orange;">Personal Details</h1>
	<form name="PersonalDetails" action="personalDetails" method="post">
		<table border='2'>
			<tr>
				<td style="background-color: #D3D3D3;">Title</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">First Name</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Middle Name(s)</td>
				<td><input type="text" name="middleName"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Family Name</td>
				<td><input type="text" name="familyName"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Date of Birth</td>
				<td><input type="text" name="dateOfBirth"></td>
			</tr>
		</table>

		<h3>Previous names</h3>
		<table border='2'>
			<tr>
				<td style="background-color: #D3D3D3;">Have you ever been known
					by a different name?<br> If 'Yes' please enter them below.
				</td>
				<td><input type="checkbox" name="hasPreviousName">Yes</td>
				<td><input type="checkbox" name="hasPreviousName">No</td>
			</tr>
		</table>
		<br>
		<div th:if="${employeeDetails.hasPreviousName}">
			<table border='2'>
				<tr style="background-color: #D3D3D3;">
					<td>First name</td>
					<td>Middle name(s)</td>
					<td>Family name</td>
					<td>Date of change</td>
				</tr>
				<tr th:each="previousName, stat : previousNames">
					<td><input type="text" name="firstName"></td>
					<td><input type="text" name="middleName"></td>
					<td><input type="text" name="familyName"></td>
					<td><input type="text" name="dateOfChange"></td>
				</tr>
			</table>
		</div>

		<h3>Additional Personal Details</h3>
		<table border='2'>
			<tr>
				<td style="background-color: #D3D3D3;">Town of birth</td>
				<td><input type="text" name="townOfBirth"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Country of birth</td>
				<td><input type="text" name="countryOfBirth"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Nationality</td>
				<td><input type="text" name="nationality"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Mother’s Maiden Family
					name</td>
				<td><input type="text" name="motherMaidenName"></td>
			</tr>
		</table>
		<br> <br>
		<table border='2'>
			<tr>
				<td colspan='2' style="background-color: #D3D3D3;">Do you have
					a UK National Insurance Number?</td>
				<td>if Yes insert National Insurance Number below</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="hasPassport">Yes</td>
				<td><input type="checkbox" name="hasPassport">NO</td>
				<td><input type="text" name="nationalInsuranceNumber"
					style="width: 100%;"></td>
			</tr>

		</table>

		<h3>Passport Details</h3>
		<table border='2'>
			<tr>
				<td style="background-color: #D3D3D3;">Do you have a passport?</td>
				<td><input type="checkbox" name="hasPassport">Yes</td>
				<td><input type="checkbox" name="hasPassport">NO</td>

			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Country of Issue</td>
				<td colspan='2'><input type="text"
					name="passportCountryOfIssue"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Passport Number</td>
				<td colspan='2'><input type="text" name="passportNumber"></td>
			</tr>
		</table>

		<h3>Driving License Details</h3>
		<table border='2'>
			<tr>
				<td style="background-color: #D3D3D3;">Do you have a driving
					licence?</td>
				<td><input type="checkbox" name="hasDrivingLicense">Yes</td>
				<td><input type="checkbox" name="hasDrivingLicense">NO</td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Country of Issue</td>
				<td colspan='2'><input type="text"
					name="drivingLicenseCountryOfIssue"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Driving Licence Number</td>
				<td colspan='2'><input type="text" name="drivingLicenseNumber"></td>
			</tr>
		</table>
		<br> <br>
		<div style="text-align: center;">
			<input type="submit" value="Next">
		</div>
	</form>
</body>
</html>
