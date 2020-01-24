<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
	<h2>welcome spring page</h2>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>first</th>
				<th>age</th>
			</tr>
		</thead>
		<tbody>
			<tr th:each="stud : ${values}">
				<td th:text="${stud.id}">id</td>
				<td th:text="${stud.first}">first</td>
				<td th:text="${stud.age}">age</td>
			</tr>
		</tbody>
	</table>
</body>
</html>