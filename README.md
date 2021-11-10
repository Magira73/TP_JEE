# TP_JEE
Swan Launay - Silvio Dompnier   M1
Compte rendu du tp JEE

Implémentation:
    Nous avons une seule classe pour le modèle de l'application qui représente les colis. Colis contient tous les paramètres des colis, comme sont poids, 
sa valeur mais aussi une liste de tous les emplacements par lequel il est passé lors de son trajet et sont identifiant pour être distingué des autres colis.
Cette classe contient tous les getters et setters de ces paramètres et la méthode pour rajouter un emplacement dans sa liste. Et bien sûr, elle implemente Serializable pour que l'on puisse stocker le colis qui transite dans la base.

Ensuite nous utilisons le système des servlets pour communiquer avec notre interface et notre base de données.
Nous avons 3 servlets représentant les 3 clients du projet (les actions possibles sur le colis) : Enregistrement, Progression et Suivi.
Nous avons utilisé la méthode "doPost()" quand nous avions un formulaire à remplir comme pour enregistrer un colis, et la méthode "doGet()" pour rechercher une information et l'afficher, comme pour le suivi du colis ou nous demandons l'identifiant du colis pour rechercher ses informations.

Enfin, chaque Servlets possède son EJB avec son interface.
Chaque EJB possède une variable EntityManager pour interagir avec la classe persistante Colis, puis elles possèdent toutes les méthodes utiles comme "ajouterColis() (présent dans l'EJB Enregistrement pour enregistrer un nouveau colis dans la base).

Utilisation:
    Nous avons utilisé le serveur Payara 5 (5.2021.6) pour l'application sous le Jdk 1.8.
Il n'y a pas besoin de lancer un fichier en particulier, une fois le serveur lancé, lancer le projet sur le serveur pour atterrir sur un menu avec les 3 actions possibles (localhost:8080/TP_JEE)
Il y a une gestion d'erreur pour les formulaires et la demande de colis.
