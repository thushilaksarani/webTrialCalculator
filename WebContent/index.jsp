<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link href="resource\CSS\calculation.css" rel="stylesheet">
<title>Insert title here</title>
</head>

<body>

	<div class="nav-bar-page">
		<h1>Loan Calculator</h1>
	</div>
	
	<div class="cal">
		<div class="form">
		<form class="cal-form" action="index" method="post">
		<table>
				<tr>
				<td><label>Prospect Name</label></td>
				<td></td>
				<td><input type="text" name="firstName" placeholder="First Name"/>
				<input type="text" name="lastName" placeholder="Last Name"/></td>
				</tr>
				
				<tr>
				<td><label>NIC Number</label></td>
				<td>&nbsp&nbsp&nbsp</td>
				<td><input type="text" name="nic"/></td>
				</tr>
				
				<tr>
				<td><label>Loan Amount</label></td>
				<td></td>
				<td><input type="text" name="loanAmt" id="loanAmt"/> </td>
				</tr>
				
				<tr>
				<td><label>Repayment Period</label></td>
				<td></td>
				<td><input type="text" name="repayPeriod" id="repayPeriod"/>&nbsp&nbsp<label>Months</label></td>
				</tr>
				
				<tr>
				<td><label>Interest Rate</label></td>
				<td></td>
				<td><input type="text" name="interestRate" id="interestRate" placeholder="Input in Decimal Form"/></td>
				</tr>
				
				<tr>
				<td><label>Installment Value</label></td>
				<td></td>
				<td><input type="text" id="installmentValue" name="installmentValue" /></td>
				</tr>
				
				<tr>
				<td></td>
				<td></td>
				<td><br><button class="button button1" name="computebutton" id="computebutton" value="compute" type="button" onclick="myFunction()">
							Compute</button>
				<button class="button button2" name="viewbutton" id="viewbutton" value="view" type="submit" >
							View Shedule</button>
				<button class="button button3" name="resetbutton" id="resetbutton" value="reset" type="reset" >
							Reset</button></td>
			
				</tr>
				
		</table>	
		
		
			
		</form>
		</div>
	</div>
	
	<script>
		function myFunction() {
 		
 			var l = document.getElementById("loanAmt").value;
 			var loanAmt =parseFloat(l);
 			var n = document.getElementById("repayPeriod").value;
 			var repayPeriod =parseFloat(n);
 			var i = document.getElementById("interestRate").value;
 			var interestRate=parseFloat(i);

 			var instalmentVal= (loanAmt*(interestRate/12))/(1-(Math.pow((1+interestRate/12), (-repayPeriod))));
 			var instalmentValue = instalmentVal.toFixed(2);
 			
 			document.getElementById("installmentValue").value = instalmentValue;
 			
		}
	</script>
	
</body>
</html>

























