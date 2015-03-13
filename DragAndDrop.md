# Introduction #

Implentation du Drag & Drop dans le JTree de la vue de gauche de l'interface générale.


# Details #

Bon je travaille encore dessus c'est pas évident. En fait implementer un drag & drop dans un JTree est plus difficile que pour un composant GUI ( j'ai même lu dans quelques pages de forum que c'était impossible... )

La vérité c'est que chaque node est complétement pas au courant qu'il est contenu dans un JTree, il y a pas de getTree() dans l'interface TreeNode. Donc, les interfaces drag & drop doivent être implémentées par la classe listening pour les évenements JTree.

Je vais continuer de travailler dessus je vous mettrai au courant de l'avancement au fur et à mesure. Bien sur il va me falloir le JTree de la vue de gauche pour pouvoir travailler dessus.