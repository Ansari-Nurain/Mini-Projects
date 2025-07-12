<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Report App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>

	<div class="container">

		<h1 class=" pb-3 pt-3">Insurance Report Information</h1>

		<form:form action="searchReq" modelAttribute="requestDTO"
			method="post">

			<table>

				<tr>
					<td>Plan Name :</td>
					<td><form:select path="planName">
							<form:option value="">-Select</form:option>
							<form:options items="${names}" />
						</form:select></td>


					<td>Plan Status :</td>
					<td><form:select path="planStatus">
							<form:option value="">-Select</form:option>
							<form:options items="${status}" />
						</form:select></td>


					<td>Gender</td>
					<td><form:select path="gender">
							<form:option value="">-Select</form:option>
							<form:option value="male">Male</form:option>
							<form:option value="female">Female</form:option>

						</form:select></td>
				</tr>

				<tr>

					<td>Start Date</td>
					<td><form:input type="date" path="startDate"/></td>

					<td>End Date</td>
					<td><form:input type="date" path="endDate"/></td>

				</tr>


				<tr>
				
				<td> <a href="/" class="btn btn-secondary">Reset</a> </td>
					<td>
						<button type="submit" value="search" class="btn btn-primary">Search</button>
					</td>

				</tr>

			</table>

		</form:form>

		<hr />

		<table class="table table-striped table-hover">

			<thead>

				<tr>
					<th>S.No</th>
					<th>Citizen Name</th>
					<th>Gender</th>
					<th>Plan Name</th>
					<th>Plan Status</th>
					<th>Start Date</th>
					<th>End Date</th>


				</tr>

			</thead>

			<tbody>

				<c:forEach items="${listInfo}" var="info" varStatus="index">
					<tr>
						<td>${index.count}</td>
						<td>${info.citizenName}</td>
						<td>${info.gender}</td>
						<td>${info.planName}</td>
						<td>${info.planStatus}</td>
						<td>${info.planStartDate}</td>
						<td>${info.planEndDate}</td>

					</tr>

				</c:forEach>

				<tr>
					<td colspan="7" style="text-align: center;"><c:if test="${empty listInfo}"> No Record Found</c:if></td>
				</tr>

			</tbody>
			

		</table>

		<hr />

		Export : <a href="pdf">PDF</a> <a href="pdf">Excel</a>


	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>

</body>
</html>