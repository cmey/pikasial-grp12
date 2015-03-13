# Conception #

Samedi 20 octobre 2007 : conception des cas d'utilisation : Audrey     : 1h

Samedi 20 octobre 2007 : conception des cas d'utilisation : Christophe : 1h

Lundi 22 octobre 2007 : rassemblement des cas d'utilisation de chacun : tous : 1h

Mercredi 24 octobre 2007 : première réunion : tous : 20 min

Mercredi 7 novembre 2007 : deuxième réunion + Diagramme de classes du modèle : El-Mahdi, Sara, Christophe : 1h

Mercredi 21 novembre 2007 : l'idée est lancée d'utiliser une JList pour afficher les vignettes : Christophe : 1h

Jeudi 20 décembre 2007 : réunion de 3ème itération, on nous conseille de pouvoir avec Jickr, sélectionner un des Sets Flickr de l'utilisateur et télécharger les photos qui se trouvent dans ce Set là (pas bêtement toutes les photos de l'utilisateur). : tous : 0,5h

# Implantation #

Samedi 3 novembre 2007 : chargement d'une image et affichage dans une JFrame : Christophe : 2h

Mercredi 14 novembre 2007 : reprise de l'IG d'Audrey et incorporation d'un exemple de JTree (à gauche) et de ma vue d'une image (au centre) : Christophe : 2h

Mercredi 21 novembre 2007 : affichage par vignettes des images d'un dossier, importation d'images supplémentaires dans l'album de base et mise à jour de notamment FolderThumbnailView qui supporte maintenant la fonction d'Observer, PikasialImage a été mis à jour également dans ce sens (Observable), et application du pattern Composite sur Folder : Christophe : 3h

Dimanche 9 décembre 2007 : incorporation du Scan de El-mahdi dans Pikasial. Affichage par vignettes des images d'un dossier à l'aide d'une JList. Modif du scan des folder pour qu'il commence à System.getProperty("User.home") aulieu des racines. Modif de Diapo pour que ce ne soit plus des images hardcodées qui soient affichée mais les images contenue dans la Database. : Christophe : 1h

Samedi 16 décembre 2007 : web services : essai de FlickrJ, une API Java pour se connecter à Flickr basée sur les méthodes REST. Une exécution d'un exemple fournit génère un null pointer exception dans la bibliothèque elle-même => poubelle. Utilisation de Jickr à la place. Dans Pikasial : téléchargement des 10 images "les + intéressantes" (système de notation de Flickr) sur le disque de l'utilisateur qui peut ensuite les importer dans Pikasial. Panneau de config pour pouvoir setter son screenname et son password de connexion à Flickr. : Christophe : 2h

Samedi 22 décembre 2007 : concernant l'affichage par vignette, on visualise maintenant l'image qui est sélectionnée de la liste par un ajout de Border à sa miniature : Christophe : 0,5h

Dimanche 20 décembre 2007 : a propos des web services, interface de configuration de compte Flickr bien séparée et Model pour stocker la config : Christophe : 2h

Lundi 21 décembre 2007 : sélection d'un PhotoSet et téléchargement des photos qui se trouvent dedans, depuis Flickr, et sur le disque (dans Rep choisit par l'utilisateur grace à l'interface de config) : Christophe : 2h

Mardi 22 décembre 2007 : le download des images est maintenant asynchrone. L'upload est codé et en asynchrone, seulement je n'arrive pas à obtenir les permissions d'écriture sur mon accompte Flickr avec la lib Jickr que j'utilise :-/ Corrigé : l'upload fonctionne :) : Christophe : 2h

Mercredi 23 décembre 2007 : intégration d'une nouvelle version des albums de El-mahdi et intégration d'une nouvelle version des metadonnées de Sara. : Christophe : 2h

# Tests #

rien à signaler

# Documentation #

Samedi 10 novembre 2007 : ajout de quelques descriptions (et priorité) de use cases + proposition d'organisation "qui fait quoi" pour les 3 itérations : Christophe : 3h