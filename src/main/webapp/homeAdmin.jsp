<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Liste des Etudiants</h1>
<table border="1" cellpadding="0" cellspacing="0"
      style="border-collapse: collapse" bordercolor="#111111"
      width="62%" id="AutoNumber1">
    <tr bgcolor="#0000FF">
        <td >email</td>
        <td >mot de passe</td>
        <td >actif</td>
        <td >nom</td>
           
        <td >prenom</td>
        <td>  <select NAME="choice"  > 
        	<option value="1"> actif</option>
        	<option value="0"> non actif</option>
         </select>  </td>
      
    </tr>
<c:forEach var="c" items="${listeEtudiants}" >
  <tr>
      <td ><c:out value="${c.email}"/></td>
      <td ><c:out value="${c.password}"/></td>
       <td ><c:out value="${c.actif}"/></td>
        <td ><c:out value="${c.nom}"/></td>
      <td >
      <c:out value="${c.prenom}"/>h</td>
      
  </tr>
</c:forEach> 
</table>

<br>



</body>
</html>