<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta charset="utf-8" />
<meta name=?viewport? content=?width=device-width, initial-scale=1, shrink-to-fit=no?>
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



<link rel="stylesheet" href="resources/css/style.css" />

</head>




<body>
    
       <%@ include file="_include/header.jsp"%>
       
 

    <!-- Page Header -->
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
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="post-preview">
            <a href="${pageContext.request.contextPath}/postopo">
              <h2 class="post-title">
               Topo du diable
              </h2>
              <h3 class="post-subtitle">
                Topo du diable explicite dans son titre quasi impossible
              </h3>
            </a>
            <p class="post-meta">Niveau: 9c de type
              Falaise</p>
          </div>         

            
            
          
          
          <hr>
          <div class="post-preview">
            <a href="post.html">
              <h2 class="post-title">
                Topo de la comète
              </h2>
              <h3 class="post-subtitle">
                Topo assez complexe regroupant plusieurs sites classés
              </h3>
            </a>
            <p class="post-meta">Niveau: 5a à 8b de type
              Bloc</p>
          </div>
          
          
          
          
          
          
          <hr>
          <div class="post-preview">
            <a href="post.html">
              <h2 class="post-title">
                Failure is not an option
              </h2>
              <h3 class="post-subtitle">
                Many say exploration is part of our destiny, but it?s actually our duty to future generations.
              </h3>
            </a>
            <p class="post-meta">Posted by
              <a href="#">Start Bootstrap</a>
              on July 8, 2018</p>
          </div>
          <hr>
          

        </div>
      </div>
    </div>
              


       <%@ include file="_include/footer.jsp"%>

          
          
          

    

    <!-- Bootstrap core JavaScript -->
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="resources/js/clean-blog.min.js"></script>
    
    
   

  </body>

</html>
