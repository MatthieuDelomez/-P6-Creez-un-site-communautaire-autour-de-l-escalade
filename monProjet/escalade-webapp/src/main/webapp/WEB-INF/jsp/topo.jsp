

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>${application.name}- A propos</title>



<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">


<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous" />

<!-- Chargement du fichier style.css -->
<link rel="stylesheet" href="resources/css/style.css" />

</head>
  <body>
    
 <!-- Page Header -->
 <!-- Inclusion du Header -->
 <%@ include file="_include/header.jsp"%>
       

    <header class="masthead" style="background-image: url('resources/img/topo01.jpg')">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="site-heading">
              <h1>Topo</h1>
              <span class="subheading">Guide de la région</span>
            </div>
          </div>
        </div>
      </div>
    </header>

    <!-- Main Content -->
    <!-- Appel à la méthode ListTopo-->
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
                <c:forEach var="topo" items="${topoList}">
          <div class="post-preview">
            <a href="${pageContext.request.contextPath}/publication">

                <h2 class="post-title">

           <p><c:out value="${topo.nom}"/></p>
              </h2>

              <h3 class="post-subtitle">
           <p><c:out value="${topo.descriptif}"/></p>
              </h3>
            </a>
           <p>Type de topo : <c:out value="${topo.type_de_topo}"/></p>

          </div>         
              </c:forEach>

          

        </div>
      </div>
    </div>
              

 <!-- Inclusion du Footer -->
  <%@ include file="_include/footer.jsp"%>



    <!-- Bootstrap core JavaScript -->
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="resources/js/clean-blog.min.js"></script>
    
    
   

  </body>

</html>
