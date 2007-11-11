import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class NewWindow extends JFrame{
    

    public NewWindow() {
        super("Aperçu");
        
        JPanel pan2 = new JPanel();
        pan2.setLayout(new BorderLayout());
        
        // panneau en bas contenant les boutons
        JPanel panBas = new JPanel();
        pan2.add("South",panBas);
        Border cadre = BorderFactory.createLineBorder(Color.black);
	panBas.setBorder(cadre);
        
        // panneau au milieu où la photo sera affichée
        JPanel panMilieu = new JPanel();
        pan2.add("Center",panMilieu);
        Border cadre2 = BorderFactory.createLineBorder(Color.black);
	panMilieu.setBorder(cadre2);
        
        // boutons
        JButton tourner = new JButton("pivoter droite");
        JButton tourner2 = new JButton("pivoter gauche");
        panBas.add(tourner2);
        panBas.add(tourner);
                
        // fin affichage
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setContentPane(pan2);
	pack();
	setVisible(true);
    }
    
}
