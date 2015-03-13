Le dessin des cas d'utilisation :
![http://img411.imageshack.us/img411/5276/umlmodelusecasesdiagramfi1.png](http://img411.imageshack.us/img411/5276/umlmodelusecasesdiagramfi1.png)

# Package Visualisation #

| **Nom du cas d'utilisation** | **Priorité** | **Itération n°** |
|:-----------------------------|:--------------|:-------------------|
| Visualiser une photo | Haute | 1 |
| Sélectionner une photo | Haute | 1 |
| Affichage par diaporama | Faible | 2 |
| Imprimer | Faible | 3 |

_Visualiser une photo_
  * **précondition** : la photo est sélectionnée ET la photo existe sur l'emplacement indiqué ET Java supporte l'affichage de la photo
  * **en cas de succès** : photo affichée à l'écran
  * **en cas d'échec** : afficher un message d'erreur ( soit "Une image doit être sélectionnée", "Aucun aperçu n'est disponible, vérifiez la validité du raccourci" ou "Java ne supporte pas l'affichage de cette photo" )
  * **déclenchement** : l'utilisateur double clique sur une photo + bouton « afficher » + bouton Entrée
  * **actions** :
    1. on double clique sur la photo sélectionnée OU on clique sur le bouton « afficher » OU on appuye sur Entrée
    1. chargement vue image : une nouvelle fenêtre apparaît
    1. affichage de la photo
  * **Priorité** : Importante
  * **Cas utilisé par ce cas** : Sélectionner une photo
  * **Question** : On suppose qu'on supprime jamais une photo en dehors de picasa alors que picasa est ouvert; à remettre en question !


_Sélectionner une photo_
  * **précond** : le fichier sélectionné existe (ça peut être juste un raccourci)
  * **succès** : photo sélectionnée
  * **echec** : on affiche un message d'erreur (on a supprimé la source ? voir cas d'erreur numéro 2 de visualiser une photo ). On peut éventuellement afficher le chemin du raccourci non valide
  * **déclenchement** : simple clic sur une photo OU être dans un carré de sélection avec la souris
  * **actions** :
    1. on simple clic sur la photo OU on sélectionne avec le carré de sélection
    1. photo sélectionnée
  * **Priorité** : Importante
  * **Cas utilisé par ce cas** : rien


_Affichage par diaporama_
  * **précond** : des photos sont sélectionnées OU un album est sélectionné
  * **succès** : affichage du diaporama, la première photo est affichée
  * **echec** : aucun, si une photo n'est pas valide ( voir cas visualiser une photo ), afficher le message d'erreur dans la fenêtre et continuer le diaporama
  * **déclenchement** : menu contextuel « afficher en diaporama » OU un bouton « afficher en diaporama »
  * **actions** :
    1. sélectionner les images OU l'album
    1. appuyer sur la commande
    1. visualiser une photo (la première)
    1. attendre et sélectionner la prochaine photo
    1. répéter 3-4
  * **Priorité** : faible
  * **cas utilisé par ce cas** : visualisation d'une photo, sélection d'une photo

_Imprimer photo_
  * **précond** : des photos sont sélectionnées OU un album est sélectionné
  * **succès** : photos ou album envoyés à l'imprimante
  * **echec** : erreur de synchronisation avec l'imprimante
  * **déclenchement** : menu contextuel « imprimer » OU un bouton de même nom
  * **actions** :
    1. sélectionner une ou plusieurs photos OU un album
    1. appuyer sur la commande
  * **Priorité** : faible
  * **cas utilisé par ce cas** : sélection d'une photo


# Package Meta #

| **Nom du cas d'utilisation** | **Priorité** | **Itération n°** |
|:-----------------------------|:--------------|:-------------------|


rien à signaler

# Package Album #

| **Nom du cas d'utilisation** | **Priorité** | **Itération n°** |
|:-----------------------------|:--------------|:-------------------|
| Créer un album | Haute | 2 |
| Placer photo dans album | Haute | 2 |

_Créer un album_
  * **précond** :
  * **succès** : l'album est créé
  * **echec** :
  * **déclenchement** : appui sur le menuItem « créer nouvel album » du menu Albums OU clic sur le bouton « créer nouvel album »
  * **actions** :
  * **priorité** : importante
  * **cas utilisé par ce cas** : rien


_Placer photo dans album_
  * **précond** : photo(s) sélectionnée(s) ET album créé
  * **déclenchement** : drag & drop OU copier / coller OU couper / coller
  * **actions** :
    1. on déplace ou coupe ou colle photo(s)
    1. si le nom de la photo déjà existante : proposer : écraser ? renommer ? annuler la copie ?
    1. l'album destination est composée de ces photos (+ les anciennes)
  * **priorité** : moyenne
  * **cas utilisé par ce cas** : sélectionner une photo, sélectionner un album
  * **Question** : chaque photo d'un album doit avoir un nom unique ; à remettre en question!

# Package Web #

| **Nom du cas d'utilisation** | **Priorité** | **Itération n°** |
|:-----------------------------|:--------------|:-------------------|
| Se connecter | Faible | 3 |
| Accéder à dossier web | Faible | 3 |
| Rappatrier | Faible | 3 |
| Envoyer | Faible | 3 |


rien à signaler


# Package Traitement #

| **Nom du cas d'utilisation** | **Priorité** | **Itération n°** |
|:-----------------------------|:--------------|:-------------------|
| Rotation image | Faible | 2 |
| Zoomer image | Faible | 2 |
| Redimensionner image | Faible | 2 |


_Rotation image_
  * **précond** : une seule image est affichée
  * **déclenchement** : sélection de l'item « rotation 90° » dans une liste déroulante
  * **actions** :
    1. l 'image est affichée
    1. on sélectionne le degré de rotation
    1. la rotation se fait
  * **Priorité** : faible
  * **cas utilisé par ce cas** : visualisation d'une photo