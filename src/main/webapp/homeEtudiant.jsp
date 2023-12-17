<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <br>
  <br>
   <br>
    <br>
    <br>
     <br>
 <h1>Liste des reclamations</h1>
<table border="1" cellpadding="0" cellspacing="0"
      style="border-collapse: collapse" bordercolor="#111111"
      width="62%" id="AutoNumber1">
    <tr bgcolor="#0000FF">
        <td >titre</td>
        <td >description</td>
        <td >type</td>
       
    </tr>
<c:forEach var="c" items="${listeReclamations}" >
  <tr>
      <td ><c:out value="${c.titre}"/></td>
      <td ><c:out value="${c.description}"/></td>
      <td ><c:out value="${c.type}"/></td>
  </tr>
</c:forEach> 
</table>
 
 

 
  <h1>Ajout de reclamation</h1>
    <form method="POST" action="etudiant">
        titre   : &nbsp;&nbsp;  <input type="text" name="titre" value="${titre}" required="required"/>  <br>  <br>        
         description:   <input type="text" name="label" size="200" />   <br>  <br>  
         type  :  &nbsp;&nbsp; &nbsp;<select NAME="choice"  > <br> <br> 
              <c:forEach var="item" items="${listeTypeReclamations}">
                <option>
                  <c:out value="${item.id}" />
                </option>
              </c:forEach>
            </select>         <br>     
     <br>
      <input type="submit" value="ajouter" name="action" />
              <input type="reset" value="Reset" name="reset" />
       
    </form>
</body>
</html>