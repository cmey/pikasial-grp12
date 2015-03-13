# Introduction #

Pour pouvoir obtenir les informations suivantes : format de fichier, résolution de l'image, nombre de bits par pixel et éventuellement nombre d'images, les commentaires et la résolution physique des images de type JPEG, GIF, BMP, PCX, PNG, IFF, RAS, PBM, PGM, PPM et des fichiers PSD (ou les flux entrant).

Je propose d’utiliser une classe qui prends en argument les images en question

le code en résumé:

ImageInfo ii = new ImageInfo();
ii.setInput(in);
ii.setDetermineImageNumber(true); // default is false
ii.setCollectComments(true); // default is false
if (!ii.check()) {
> System.err.println("c’est un format non supporté.");
> return;
> }
System.out.println(ii.getFormatName() + ", " + ii.getMimeType() +
> > ", " + ii.getWidth() + " x " + ii.getHeight() + " pixels, " +
> > ii.getBitsPerPixel() + " bits per pixel, " + ii.getNumberOfImages() +
> > " image(s), " + ii.getNumberOfComments() + " comment(s).");

Un peu de commentaires :

---

//setDetermineImageNumber(true)
Indique si le nombre d'images d'un fichier est déterminé c’est faux par défaut. Il s'agit d'une option spéciale, car certains formats de fichiers nécessitent le parcourt de l’ensemble du dossier afin de connaître le nombre d'images. Il faut savoir qu’il ya des formats de fichiers supportant   plus d'une image (par exemple le type GIF), Si cette méthode est appelée avec comme argument vrai, le nombre réel d'images peut être calculer grâce à getNumberOfImages() après un appel de check()bien réussi.

//setCollectComments(true)
Indiquez si les commentaires textuels sont censés être extraits. Par défaut c’est faux. Si cette option est activée, les commentaires seront ajoutés à une liste interne.

//check()
C’est pour vérifier si le format est supporté

Pour faire des tests, l’image peut être donnée en argument. On peut donner plus d’une image pour être tester en même temps.





