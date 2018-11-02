

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta charset="utf-8" />
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

<!-- Chargement du fichier style.css -->
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
 
<!-- Inclusion du Header -->
 <%@ include file="_include/header.jsp"%>


	
	
	
<!-- Formulaire -->
<div class="MiseFormulaire">
    <h1>Louer un Topo</h1>

    <form method="post" action="espace_de_pret" class="form-horizontal">
        <div class="form-group">
            <label class="control-label col-sm-2" for="date_de_location">Date  :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="date_de_location" id="date_de_location" placeholder="date_de_location"  />
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pseudo_proprio">Pseudo :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="pseudo_proprio" id="pseudo_proprio" placeholder="Enter nom"  />
            </div>
        </div>
        
                <div class="form-group">
            <label class="control-label col-sm-2" for="ref">Nom du Topo :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="ref" id="ref" placeholder="Enter ref"  />
            </div>
        </div>
        
<!-- Bouton Reserver -->
        <div class="form-group">
            <div class="BoutonFormuPret">
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-log-in"></span> Réserver</button>
            </div>
        </div>
    </form>

</div>
</body>
</html>
