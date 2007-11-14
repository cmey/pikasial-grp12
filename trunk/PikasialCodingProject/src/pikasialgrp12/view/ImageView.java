/*
 * ImageDisplayer.java
 *
 * Created on 5 novembre 2007, 15:14
 *
 */

package pikasialgrp12.view;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author cyberchrist
 */

public class ImageView extends JPanel {
    
  private JLabel imageview;
  private Image image;

  public ImageView(File file)
    {
        try {
            image = ImageIO.read(file);
            image = image.getScaledInstance (320,200,Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(image);                    
            imageview = new JLabel(file.getName(), icon, JLabel.CENTER);
            add(imageview);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

  }
