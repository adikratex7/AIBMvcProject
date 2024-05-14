
<%@ page  isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
  padding: 0;
  background-color: #f5f5f5;
}

.container {
  max-width: 600px;
  margin: 50px auto;
  padding: 20px;
  background-color: white;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0,0,0,0.1);
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: calc(100% - 30px); /* Adjusted to match the container padding and margins */
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

<frm:form modelAttribute="highlight">
  <div class="container">
    <h1>Add Highlights</h1>
    <p>Please fill this to add highlights.</p>
    <hr>

    <label for="type"><b>Project Name</b></label>
    <input type="text" placeholder="Enter Type" name="projectName" id="type" required>

    <label for="technology"><b>Project Tech Stack</b></label>
    <input type="text" placeholder="Enter technology" name="projectTechStack" id="technology" required>

   <label for="projecttype"><b>Project Type</b></label>
    <input type="text" placeholder="Enter project type" name="projectType" id="technology" required>
    <hr>

    <button type="submit" class="registerbtn" >Add</button>
  </div>
  
  
</frm:form>

</body>
</html>


