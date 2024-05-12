<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>


<h1  style="color:blue;text-align:center"> Project Highlights </h1>

<c:choose>
   <c:when  test="${!empty  projectHighlights}">
      <table border="1" align="center" bgcolor="yellow">
         <tr>
           <th>PROJECT-ID</th><th>PROJECT-NAME</th><th>PROJECT-TECH-STACK</th><th>PROJECT-TYPE</th>
         </tr>
        <c:forEach  var="highlight" items="${projectHighlights}">
            <tr>
              <td>${highlight.projectId} </td>
             <td>${highlight.projectName} </td>
             <td>${highlight.projectTechStack} </td>
             <td>${highlight.projectType} </td>
              
                  
             
            </tr>
        </c:forEach>
      </table>
   </c:when>
 
</c:choose>

                         
                            
                            