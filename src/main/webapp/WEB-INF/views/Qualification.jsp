<html>
<head>
<title>Qualification</title>
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
	<form name="Qualification" action="qualifications" method="post">
		<h1 style="color: orange; margin: 25px;">Qualifications</h1>
		<ul style="background-color: #D3D3D3;">
			<li>Please provide details of your highest qualifications.</li>
			<li>If you do not know the exact dates for your course just
				default to the first of the month e.g. 01/10/2000 - 01/06/2003</li>
		</ul>

		<h3 style="margin: 25px;">Qualification 1:</h3>
		<table border='2' style="margin: 25px;">
			<tr>
				<td style="background-color: #D3D3D3;">University/ College</td>
				<td colspan='3'><input type="text" name="university"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Start date</td>
				<td><input type="text" name="startDate1"></td>
				<td style="background-color: #D3D3D3;">Leaving date</td>
				<td><input type="text" name="leavingDate"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Course studied</td>
				<td colspan='3'><input type="text" name="course"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Qualification & grade
					awarded</td>
				<td colspan='3'><input type="text" name="qualificationGrade"
					style="width: 100%;"></td>
			</tr>
		</table>

		<h3 style="margin: 25px;">Qualification 2:</h3>
		<table border='2' style="margin: 25px;">
			<tr>
				<td style="background-color: #D3D3D3;">University/ College</td>
				<td colspan='3'><input type="text" name="university"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Start date</td>
				<td><input type="text" name="startDate"></td>
				<td style="background-color: #D3D3D3;">Leaving date</td>
				<td><input type="text" name="leavingDate"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Course studied</td>
				<td colspan='3'><input type="text" name="course"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td style="background-color: #D3D3D3;">Qualification & grade
					awarded</td>
				<td colspan='3'><input type="text" name="qualificationGrade"
					style="width: 100%;"></td>
			</tr>
		</table>
		<div style="text-align: center;">
			<input type="submit" value="Next">
		</div>
	</form>

</body>