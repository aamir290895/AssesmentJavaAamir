package com.java.orm;

public class WebTest {

}
/*

	1. Core Java App		vs			1. Java Web App
	
	   AnyJavaProject					ProjectFolder
	   |										|
	   src							------------------------------------------------
	   |								|	 |		|		|		|		|	|
	   com.java						WEB-INF lib		.html	.css	.jpeg	.js	.jsp
	   |							|				index.html
--------------					---------			
|			|					|		|			
Abc.java	Abc.class		classes		web.xml
							|
						Your.java <-- logic to run on the server
	    				Your.class
	
	
	
	apache-tomcat 9.0  zip file 
	
	1. web server - apache - web request / response
	2. tomcat - servlet container - is used to hold servlets
				servlet - program to generate web output.
	3.
	
c:\> notepad abc.html
	<html>
		<h1> hello </h1>
	</html>
	
			OR
	YourServlet.java
	-----
	public void service(....) {
	
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
			pw.println("<h1>");
				pw.println("hello");
			pw.println("</h1>");
		pw.println("</html>");
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	



*/







