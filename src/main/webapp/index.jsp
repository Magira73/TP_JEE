<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="style.css">
	<title>Accueil</title>
</head>
<body> 
    <main id="mainContainer" style="width: 500px;">
        <div class="card" style="width: 100%;">
            <img class="card-img-top" src="https://static.vecteezy.com/ti/vecteur-libre/p1/1630620-suivi-colis-plat-vectoriel.jpg" alt="Card image cap">
            <div class="card-body">
              <h5 class="card-title">Gestion de colis</h5>
              <p class="card-text">Cette application J2E a été développée pour le cours d'INFO706 : applications réparties</p>
              <hr>
              <a href="/TP_JEE/registration" class="btn btn-outline-primary">Enregistrer un nouveau colis</a>
              <hr>
              <form class="form-inline" method="get" action="/TP_JEE/progress">
                <input type="number" class="main form-control mb-2" placeholder="42" name="id" required="required">
                <input type="submit" class="btn btn-outline-primary mx-sm-3 mb-2" value="Mettre à jour la position d'un colis">
              </form>
              <hr>
              <form class="form-inline" method="get" action="/TP_JEE/tracking">
                <input type="number" class="main form-control mb-2"  placeholder="69" name="id" required="required">
                <input type="submit" class="btn btn-outline-primary  mx-sm-3  mb-2" value="Suivre un colis">
              </form>
            </div>
        </div>
    </main>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>