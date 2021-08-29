<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    

  <html>
  <body>
           <table border="3">
               <th>EmployeeID</th>
               <th>EmployeeName</th>
               <th>EmployeeSalary</th>

              <c:forEach items="${list}" var="emp">
                  <tr>

                     <td><c:out value="${emp.empId}" /></td>
                     <td><c:out value="${emp.empName}" /></td>
                     <td><c:out value="${emp.empSalary}" /></td>



                  </tr>
                  </c:forEach>
           </table>


           <a href="http://localhost:9092/MVC_Assignment9-Naresh/f5">1</a>
           <a href="http://localhost:9092/MVC_Assignment9-Naresh/s5">2</a>
           <a href="http://localhost:9092/MVC_Assignment9-Naresh/t5">3</a>


  </body>
  </html>