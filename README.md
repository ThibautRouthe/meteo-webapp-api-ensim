Description succincte des dépendances du projet :
TP3 :
Etape 13 :
1. Avec "@GetMapping("/greeting")" dans HelloWorldController
2. Avec "return "greeting";" dans HelloWorldController
3. On le recupère avec "public String greeting(@RequestParam(name="nameGET", required=false, defaultValue="World") String
   nameGET, Model model)" dans HelloWorldController. On l'envoi avec "model.addAttribute("nomTemplate", nameGET);" dans HelloWorldController

Etape 17 :
L'addresse de la base de données a changer et une table adresse c'est rajouter dans la console

Etape 22 :
Elle remplace les balises <bean/> pour l'instanciation de classes

Etape 30 :
il suffit d'ajouter < link rel="stylesheet" href="../static/css/bootstrap.min.css"> dans le head des fichiers html et < script src="../static/js/jquery.min.js"></script>
< script src="../static/js/bootstrap.min.js"></script> au pied du body

TP4 :
Etape 6 :
* Il faut une clé API pour appeler MeteoConcept
* Il faut appeler cette url : https://api.meteo-concept.com/api/forecast/daily
* Il faut utiliser la methode GET
* Il faut les ajouter à la fin de l'url
* La réponse est un fichier json, les informations qui nous interessent sont dans la balise forecast
* Pour obtenir la temperature il faut utiliser les valeurs tmin et tmax
* Pour afficher les previsions, il faut il faut prendre les données dans la balise où datetime correspond au jour que l'on veut connaitre

Lien GitHub :
https://github.com/PapayeRavage/App
