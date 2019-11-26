<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <!DOCTYPE html>
 <html>
  <head>
      <meta charset="UTF-8">
      <title>Employee List</title>
  </head>
  <body>
      <div align="center">
          <h1>Employee List</h1>
          <table border="1">
              <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Designation</th>
              </tr>
              <c:forEach var="emp" items="${emps}" varStatus="status">
              <tr>
                  <td>${emp.id}</td>
                  <td>${emp.name}</td>
                  <td>${emp.salary}</td>
                  <td>${emp.designation}</td>                            
              </tr>
              </c:forEach>                
          </table>
      </div>
  </body>
</html>