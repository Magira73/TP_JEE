<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="style.css">
	<title>Enregistrement d'un colis</title>
</head>
<body> 
    <main id="mainContainer">
        <h1 class="d-flex justify-content-between">Nouveau colis <a href="/TP_JEE/" role="button" class="btn btn-primary">Accueil</a></h1>
        <hr>
        <form action="/TP_JEE/registration" method="post">
            <div class="form-group">
                <label for="contentInput">Contenu</label>
                <input type="text" class="form-control" id="contentInput" required="required" name="valeur" placeholder="Ordinateur, Pantalon ...">
            </div>
            <div class="form-group">
                <label for="poidsInput">Poids</label>
                <input type="number" class="form-control" id="poidsInput" required="required" name="poids" step=".1">
                <small class="form-text text-muted">Indiquer le poids du colis en Kg</small>
            </div>
            <div class="form-group">
                <label for="origineInput">Origine</label>
                <input type="text" class="form-control" id="origineInput" required="required" name="origine" placeholder="Le Bourget du Lac, France">
            </div>
            <div class="form-group">
                <label for="destinationInput">Destination</label>
                <input type="text" class="form-control" id="destinationInput" required="required" name="destination" placeholder="Berne, Suisse">
            </div>
            <button type="submit"  class="btn btn-primary">Enregistrer</button>
        </form>
    </main>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>