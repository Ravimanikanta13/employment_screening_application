<html>
<head>
<title>Address History</title>

<style>
table {
	border-color: #D3D3D3;
}

ul {
	list-style-type: none;
	margin: 25px;
	padding: 10px;
}

li {
	padding-left: 20px;
	position: relative;
}

li:before {
	content: "\25A0";
	display: inline-block;
	position: absolute;
	left: 0;
}
</style>
</head>
<body>
	<form name="EmpoymentHistoryContinue"
		action="employmentHistoryContinue" method="post">
		<h1 style="color: orange; margin: 25px;">Employment History
			Continued</h1>
		<table border='2' style="margin: 25px;">
			<tr>
				<td style="background-color: #D3D3D3;">Employer</td>
				<td colspan='3'><input type="text" name="employer"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Address</td>
				<td colspan='3'><input type="text" name="address"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Phone Number</td>
				<td colspan='3'><input type="text" name="phoneNumber"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Your Job title</td>
				<td colspan='3'><input type="text" name="jobTitle"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Start date</td>
				<td><input type="text" name="startDate"></td>
				<td style="background-color: #D3D3D3;">Leaving date</td>
				<td><input type="text" name="leavingDate"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Reason for leaving</td>
				<td colspan='3'><input type="text" name="reasonForLeaving"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee Name</td>
				<td colspan='3'><input type="text" name="refereeName"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee job title</td>
				<td colspan='3'><input type="text" name="refereeJobTitle"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee Phone/Email</td>
				<td colspan='3'><input type="text" name="refereePhoneEmail"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Can we contact this
					employee</td>
				<td><input type="checkbox" name="canContact" value="Yes">Yes</td>
				<td><input type="checkbox" name="canContact" value="No">No?
					Enter the date when we contact</td>
				<td><input type="text" name="contactDate"></td>
			</tr>
		</table>
		<table border='2' style="margin: 25px;">
			<tr>
				<td style="background-color: #D3D3D3;">Employer</td>
				<td colspan='3'><input type="text" name="employer"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Address</td>
				<td colspan='3'><input type="text" name="address"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Phone Number</td>
				<td colspan='3'><input type="text" name="phoneNumber"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Your Job title</td>
				<td colspan='3'><input type="text" name="jobTitle"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Start date</td>
				<td><input type="text" name="startDate"></td>
				<td style="background-color: #D3D3D3;">Leaving date</td>
				<td><input type="text" name="leavingDate"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Reason for leaving</td>
				<td colspan='3'><input type="text" name="reasonForLeaving"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee Name</td>
				<td colspan='3'><input type="text" name="refereeName"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee job title</td>
				<td colspan='3'><input type="text" name="refereeJobTitle"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee Phone/Email</td>
				<td colspan='3'><input type="text" name="refereePhoneEmail"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Can we contact this
					employee</td>
				<td><input type="checkbox" name="canContact" value="Yes">Yes</td>
				<td><input type="checkbox" name="canContact" value="No">No?
					Enter the date when we contact</td>
				<td><input type="text" name="contactDate"></td>
			</tr>
		</table>
		<table border='2' style="margin: 25px;">
			<tr>
				<td style="background-color: #D3D3D3;">Employer</td>
				<td colspan='3'><input type="text" name="employer"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Address</td>
				<td colspan='3'><input type="text" name="address"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Phone Number</td>
				<td colspan='3'><input type="text" name="phoneNumber"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Your Job title</td>
				<td colspan='3'><input type="text" name="jobTitle"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Start date</td>
				<td><input type="text" name="startDate"></td>
				<td style="background-color: #D3D3D3;">Leaving date</td>
				<td><input type="text" name="leavingDate"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Reason for leaving</td>
				<td colspan='3'><input type="text" name="reasonForLeaving"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee Name</td>
				<td colspan='3'><input type="text" name="refereeName"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee job title</td>
				<td colspan='3'><input type="text" name="refereeJobTitle"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Referee Phone/Email</td>
				<td colspan='3'><input type="text" name="refereePhoneEmail"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Can we contact this
					employee</td>
				<td><input type="checkbox" name="canContact" value="Yes">Yes</td>
				<td><input type="checkbox" name="canContact" value="No">No?
					Enter the date when we contact</td>
				<td><input type="text" name="contactDate"></td>
			</tr>
		</table>

		<div style="text-align: center;">
			<input type="submit" value="Next">
		</div>
	</form>
</body>
</html>
