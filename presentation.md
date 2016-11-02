# ![alt text](img/lotussm.png)  Uge 1:  HTTP og Java Servlets
Læsning: Head First with Servlet and JSP  



##Browsere og HTML, CSS, JS - en reminder
- Hvad er HTML
- Hvad er CSS
- Hvad er JS
```
		<!DOCTYPE html>  
		<html>  
			<head>  
				<title>Nested Elements Example</title>  
			</head>  
			<body>  
				<h1>This is <i>italic</i> heading</h1>  
				<p>This is <u>underlined</u> paragraph</p>  
			</body>  
		</html>  
```
See her for [mere info](https://www.tutorialspoint.com/html/html_basic_tags.htm).  



##HTTP
![alt](img/internet.png)
[Klik her for materiale om HTTP](https://www.ntu.edu.sg/home/ehchua/programming/webprogramming/HTTP_Basics.html)  

![alt](img/demoman.png)  
Kig på Chrome developer tools -> network. Se hvad der bliver sendt med når vi laver requests til et web site.  





## Java Servlets

![alt text](img/clientServer.png "client server image")  
[Servlet tutorial](http://www.tutorialspoint.com/servlets/):   
(read the sections from 'home' to 'http codes')  <br><br>
- The architecture (client server with HTTP, POST and GET)  
  - Look at dev. tools. i chrome to see what is communicated  between client and Server.
- The anatomy of a java servlet  
  - url annotationen
  - DoPost() and DoGet()  
  - ProcessRequest() - run through the template  
    - PrintWriter  
    - getContextPath  
  - HttpServletRequest and HttpServletResponse objects 
  - Generer HTML med med link til images, css, js med mere.   




## Ugens øvelse
Find den [her](https://github.com/CphBusAUwpss/exercises/blob/master/week1/HTTP_servlet_EX.pdf)  

