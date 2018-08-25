<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<meta charset="utf-8" />
<title>Test</title>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Connexion</span> 
				<span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">${application.name}</a>
		</div>
		
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
			
				<li class="active"><a href="/jsp/_include/accueil.jsp">Accueil</a></li>
				<li><a href="jsp/_include/topo.jsp">Topo</a></li>
				<li><a href="jsp/about.jsp">A propos</a></li>
				
			</ul>

		</div>
		<!--/.nav-collapse -->
	</div>
</nav>


