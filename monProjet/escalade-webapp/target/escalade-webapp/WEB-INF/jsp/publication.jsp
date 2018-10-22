<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

 
 
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
       <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>${application.name}- A propos</title>
        
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



    <!-- Page Header -->
    <header class="masthead" style="background-image: url('resources/img/topo03.jpg')">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="post-heading">
              <h1>Le Topo du diable</h1>
              <h2 class="subheading">Topo de type falaise</h2>
              <span class="meta">Niveau: 9c
               </span>
            </div>
          </div>
        </div>
      </div>
    </header>
    
    
    
        <div class="topoBouton">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary"<span class="glyphicon glyphicon-log-in"></span><a href="${pageContext.request.contextPath}/espace_de_pret"> Réserver un Topo</button>
            </div></div>

    <!-- Post Content -->
    <article>
      <div class="container">
        <div class="row">
            
          <div class="col-lg-8 col-md-10 mx-auto">
              
              
            <p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe, a round earth in which all the directions eventually meet, in which there is no center because every point, or none, is center — an equal earth which all men occupy as equals. The airman's earth, if free men make it, will be truly round: a globe in practice, not in theory.</p>

            <p>Science cuts two ways, of course; its products can be used for both good and evil. But there's no turning back from science. The early warnings about technological dangers also come from science.</p>

            <p>What was most significant about the lunar voyage was not that man set foot on the Moon but that they set eye on the earth.</p>

            <p>A Chinese tale tells of some men sent to harm a young girl who, upon seeing her beauty, become her protectors rather than her violators. That's how I felt seeing the Earth for the first time. I could not help but love and cherish her.</p>

            <p>For those who have seen the Earth from space, and for the hundreds and perhaps thousands more who will, the experience most certainly changes your perspective. The things that we share in our world are far more valuable than those which divide us.</p>

          </div>
        </div>
      </div>
    </article>
    

    <!-- Changer le formulaire ==> Ajouter simplement paragraphe -->
    <div class="commentaire">
	<div class="comment">
		<h3>Publication</h3>
        </div></div>
    
    
      <article>
 <div class="row">
                        <c:forEach var="publication" items="${publicationList}">


    
    <div class="publication">
            
          <div class="col-lg-8 col-md-10 mx-auto">
              
              
              
            <p> <div class="pseudoPub">
                Message écrit par : <c:out value="${publication.pseudo}"/>
            </div>
                <br>
                <c:out value="${publication.description}"/>
                                 
            </p>

         
          </div>
        </div> 
      </div></c:forEach>
    </article>
           
   
          
          
              <div class="row">
    
    <div class="col-md-6">

          <div class="widget-area no-padding blank">

                 <div class="status-upload">

                     <form method="post" action="publication">
                                         <input type="text" class="form-control" name="titre" id="titre" placeholder="Enter titre" value="Titrage" />
                         <textarea name="description" placeholder="Post Ur publication !" >

                         </textarea>
	          <ul>
	                   <li><a title="" data-toggle="tooltip" data-placement="bottom" data-original-title="Audio"><i class="fa fa-music"></i></a></li>
		<li><a title="" data-toggle="tooltip" data-placement="bottom" data-original-title="Video"><i class="fa fa-video-camera"></i></a></li>
		<li><a title="" data-toggle="tooltip" data-placement="bottom" data-original-title="Sound Record"><i class="fa fa-microphone"></i></a></li>
		<li><a title="" data-toggle="tooltip" data-placement="bottom" data-original-title="Picture"><i class="fa fa-picture-o"></i></a></li>
	          </ul>
	
                        <button type="submit" class="btn btn-success green"><i class="fa fa-share"></i> Share</button>
									</form>
								</div><!-- Status Upload  -->
							</div><!-- Widget Area -->
						</div>


        
    </div>
</div>






 <!-- Bootstrap core JavaScript -->
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="resources/js/clean-blog.min.js"></script>
    
  </body>
</html>
