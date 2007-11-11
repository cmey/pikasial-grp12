import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class Interface extends JFrame {

	public Interface(){
		super("Pikasial Groupe 12");
		
		JPanel pan = new JPanel();
		pan.setLayout(new BorderLayout());
	
		// JMenuBar
		JMenuBar barreMenu = new JMenuBar();
		// Fichier
		JMenu menuFichier = new JMenu("Fichier");
		menuFichier.add(new JMenuItem("Importer"));
		menuFichier.add(new JMenuItem("Ouvrir"));
		menuFichier.add(new JMenuItem("Enregistrer"));
		menuFichier.add(new JMenuItem("Imprimer"));
		menuFichier.add(new JMenuItem("Quitter"));
		barreMenu.add(menuFichier);
		// Edition
		JMenu menuEdition = new JMenu("Edition");
		menuEdition.add(new JMenuItem("Annuler"));
		menuEdition.add(new JMenuItem("Copier"));
		menuEdition.add(new JMenuItem("Coller"));
		barreMenu.add(menuEdition);
		setJMenuBar(barreMenu);
		
		// panneau arborescence
		JPanel panGauche = new JPanel();
		pan.add("West",panGauche);
		Border cadre = BorderFactory.createLineBorder(Color.black);
		panGauche.setBorder(cadre);

		// panneau droite
		JPanel panDroite = new JPanel();
		pan.add("East",panDroite);
		Border cadre3 = BorderFactory.createLineBorder(Color.black);
		panDroite.setBorder(cadre3);
		
		
		// panneau boutons
		JPanel panBouton = new JPanel();
		panBouton.setLayout(new FlowLayout());
		pan.add("North",panBouton);
		Border cadre2 = BorderFactory.createLineBorder(Color.black);
		panBouton.setBorder(cadre2);
		
		
		JButton nouveau = new JButton("New");
		panBouton.add(nouveau);
		
		JButton renommer = new JButton("Rename");
                panDroite.add(renommer);
		
		
		// fin affichage
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(pan);
		pack();
		setVisible(true);
		
		
		
	}
	
	
}
