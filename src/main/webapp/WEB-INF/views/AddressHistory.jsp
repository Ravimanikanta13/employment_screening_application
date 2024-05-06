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
	<form name="AddressHistory" action="addressHistory" method="POST">
		<h1 style="color: orange; margin: 25px;">Address History</h1>
		<ul style="background-color: #D3D3D3;">
			<li>Please provide your current address</li>
			<li>If a Criminal Record Check is required please supply any
				other addresses you have lived at within the last 5 years, starting
				with the most recent and working back to the oldest.</li>
			<li>Include any non-UK addresses.</li>
			<li>Please provide the month and year you moved in for each
				address in the format MM/YYYY.</li>
			<li>Please repeat any addresses that you have returned to.</li>
		</ul>
		<h3 style="margin: 25px;">Current Address</h3>
		<table border='2' style="margin: 25px;">
			<tr>
				<td>Address</td>
				<td colspan='3'><input name="currentAddress"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Town/city</td>
				<td><input name="currentCity" style="width: 100%;"></td>
				<td>Postcode</td>
				<td><input name="currentPostcode" style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Country<br>(if not UK)
				</td>
				<td><input name="currentCountry" style="width: 100%;"></td>
				<td>Moved in</td>
				<td><input name="currentMovedIn" style="width: 100%;"></td>
			</tr>
		</table>
		<h3 style="margin: 25px;"> Address</h3>
		<table border='2' style="margin: 25px;">
			<tr>
				<td>Address</td>
				<td colspan='3'><input name="Address"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Town/city</td>
				<td><input name="City" style="width: 100%;"></td>
				<td>Postcode</td>
				<td><input name="Postcode" style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Country<br>(if not UK)
				</td>
				<td><input name="Country" style="width: 100%;"></td>
				<td>Moved in</td>
				<td><input name="MovedIn" style="width: 100%;"></td>
			</tr>
		</table>
		<table border='2' style="margin: 25px;">
			<tr>
				<td>Address</td>
				<td colspan='3'><input name="Address"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Town/city</td>
				<td><input name="City" style="width: 100%;"></td>
				<td>Postcode</td>
				<td><input name="Postcode" style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Country<br>(if not UK)
				</td>
				<td><input name="Country" style="width: 100%;"></td>
				<td>Moved in</td>
				<td><input name="MovedIn" style="width: 100%;"></td>
			</tr>
		</table>
		<table border='2' style="margin: 25px;">
			<tr>
				<td>Address</td>
				<td colspan='3'><input name="Address"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Town/city</td>
				<td><input name="City" style="width: 100%;"></td>
				<td>Postcode</td>
				<td><input name="Postcode" style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Country<br>(if not UK)
				</td>
				<td><input name="Country" style="width: 100%;"></td>
				<td>Moved in</td>
				<td><input name="MovedIn" style="width: 100%;"></td>
			</tr>
		</table>
		<table border='2' style="margin: 25px;">
			<tr>
				<td>Address</td>
				<td colspan='3'><input name="Address"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Town/city</td>
				<td><input name="City" style="width: 100%;"></td>
				<td>Postcode</td>
				<td><input name="Postcode" style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Country<br>(if not UK)
				</td>
				<td><input name="Country" style="width: 100%;"></td>
				<td>Moved in</td>
				<td><input name="MovedIn" style="width: 100%;"></td>
			</tr>
		</table>
		<table border='2' style="margin: 25px;">
			<tr>
				<td>Address</td>
				<td colspan='3'><input name="Address5"
					style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Town/city</td>
				<td><input name="City" style="width: 100%;"></td>
				<td>Postcode</td>
				<td><input name="Postcode" style="width: 100%;"></td>
			</tr>
			<tr>
				<td>Country<br>(if not UK)
				</td>
				<td><input name="Country" style="width: 100%;"></td>
				<td>Moved in</td>
				<td><input name="MovedIn" style="width: 100%;"></td>
			</tr>
		</table>
		<div style="text-align: center;">
			<input type="submit" value="Next">
		</div>
	</form>

</body>
</html>