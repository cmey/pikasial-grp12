/*
 * ImagePanel.java
 *
 * Created on 5 novembre 2007, 16:07
 *
 */

package pikasialgrp12.visualization;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import pikasialgrp12.view.ImageView;

/**
 *
 * @author cyberchrist
 */
public class ImageFrame extends JFrame{
    
    /** Creates a new instance of ImagePanel */
    public ImageFrame() {
        super("Visualization");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        setPreferredSize(new Dimension(200,200));
    }
    
    public void setImageDisplayer(ImageView image){
        Container con = getContentPane();
        con.add(image);
        pack();
        setVisible(true);
    }
}
