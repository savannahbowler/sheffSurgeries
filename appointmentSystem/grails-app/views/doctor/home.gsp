<!doctype html>
<html>
<head>

<style>
button {
  background-color: #328ba8; 
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  width: 40%;
}

body{
  background-color: #d3e9f0;

}
h2{
text-align: center;
}
h4{
text-align: center;
}
</style>
</head>
<div class="second">
<p></p>
<body>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
<div class="row">
 <asset:image src="banner.jpg" width="2000" height="300"/>
 </div>
</nav>
<br/>
<br/>
<h2>Welcome To The Surgery Management Site</h2>
<br/>
<h4>From here you can click on several buttons to add new patients, appointments and prescriptions.</h4>
<br/>
<br/>
<button type="button" width=250px>
	<g:link controller="appointment" action="index">Show Appointments</g:link>
</button>
<br/>
<br/>
<button type="button">
	<g:link controller="patient" action="index">Show Patients</g:link>
</button>
<br/>
<br/>
<button type="button">
	<g:link controller="prescription" action="create">Create Prescriptions</g:link>
</button>
<br/>
<br/>
<button type="button">
	<g:link controller="prescription" action="index">Show Prescriptions</g:link>
</button>
<br/>
<br/>
<button type="button">
	<g:link controller="prescription" action="advSearch">Search Prescriptions</g:link>
</button>
</div>
</body>
</html>
