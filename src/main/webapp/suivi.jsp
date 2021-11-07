<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<title>Suivre un colis</title>
</head>
<body> 
    <style>
        body{
            background-image: url("https://wallpaperaccess.com/download/4k-flat-748988");
            background-position: center;
            background-size: cover;
            background-repeat: no-repeat;
            min-height: 100vh;
            min-width: 100vw;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        main{
            background-color: white;
            border-radius: 5px;
            width: 500px;
            padding: 20px;
            box-shadow: 0 0 50px rgba(0,0,0,0.2);
        }

        h1{
            font-size: 1.5rem;
        }
    </style>
    <main id="mainContainer">
        <h1>Informations de suivi du colis</h1>
        <hr>
        <div class="card" style="width: 100%;">
            <ul class="list-group list-group-flush">
                <li class="list-group-item">
                    <h5 class="card-title">Colis n°[numéro]</h5>
                    <h6 class="card-subtitle mb-2 text-muted">[poids] Kg</h6>
                </li>
                <div class="card-header">
                    Progression du colis (récent &#10140; ancien )
                </div>
                <li class="list-group-item">Destination : [destination]</li>
                <li class="list-group-item">Etape : [emplacement2]</li>
                <li class="list-group-item">Etape : [emplacement1]</li>
                <li class="list-group-item">Origine : [origine]</li>
              </ul>
          </div>
    </main>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>