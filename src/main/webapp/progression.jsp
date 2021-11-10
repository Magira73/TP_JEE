<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>	
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="style.css">
	<title>Mettre a jour l'emplacement du colis</title>
</head>
<body> 
    <main id="mainContainer">
        <h1 class="d-flex justify-content-between">Mettre a jour<a href="/TP_JEE/" role="button" class="btn btn-primary">Accueil</a></h1>
        <hr>
        <div class="card" style="width: 100%;">
            <ul class="list-group list-group-flush">
                <li class="list-group-item">
                    <h5 class="card-title">Colis n°${ colis.id }</h5>
                    <h6 class="card-subtitle mb-2 text-muted"><c:out value="${ colis.val } - " default="Contenu inconnu "/><c:out value="${ colis.poids } Kg" default="non renseigné"/></h6>
                </li>
                <li class="list-group-item">origine : <c:out value="${ colis.origine }">indisponible</c:out></li>
                <li class="list-group-item">Destination : <c:out value="${ colis.destination }">indisponible</c:out></li>
                <li class="list-group-item">Dernier emplacement connu : <c:out value="${ colis.emplacements[fn:length(colis.emplacements)-1] }">indisponible</c:out></li>
              </ul>
          </div>
        <hr>
        <form action="/TP_JEE/progress" method="post">
            <div class="form-group">
                <label for="emplacementName">Emplacement actuel</label>
                <input type="text" class="form-control" required="required" id="emplacementName" placeholder="Paris" name="nom">
            	<input type="hidden" value="${ colis.id }" name="id"> 
            </div>
            <button type="submit" class="btn btn-primary">Mettre à jour</button>
        </form>
    </main>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>