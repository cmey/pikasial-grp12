/*
 * PikasialGUI.java
 *
 * Created on 14 novembre 2007, 19:02
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pikasialgrp12.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;
import pikasialgrp12.model.DataBase;

/**
 *
 * @author christophe
 */
public class PikasialGUI {
  
  private DataBase basemodel;
  
  private JFrame mainJFrame;
  
  private JMenuBar topMenuBar;
  private JMenu fileMenu;
  private JMenu albumMenu;
  
  private JMenuItem exit;
  
  private DataBaseView arboView;
  private FolderThumbnailView centerView;
  
  /** Creates a new instance of PikasialGUI */
  public PikasialGUI (DataBase base) {
    this.basemodel = base;
    createJFrame ();
    createTopMenu ();
    createDataBaseView();
    createImageView();
    createDummyRightPanel();
    show();
  }
  
  private void createJFrame(){
    mainJFrame = new JFrame("Pikasial-grp12");
    mainJFrame.setPreferredSize (new Dimension(900,700));
    mainJFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    mainJFrame.setLayout (new BorderLayout());
  }
  
  private void createTopMenu(){
   topMenuBar = new JMenuBar();
   
   fileMenu = new JMenu("Pikasial");
   fileMenu.add(new JMenuItem("Import photo folder"));
   exit = new JMenuItem("Exit");
   exit.addActionListener (new ActionListener () {
     public void actionPerformed (ActionEvent e) {
       System.exit(0);
     }
   });
   
   fileMenu.add(exit);
   topMenuBar.add(fileMenu);
    
   albumMenu = new JMenu("Albums");
   albumMenu.add(new JMenuItem("Create new album"));
   topMenuBar.add(albumMenu);
   
   mainJFrame.setJMenuBar(topMenuBar);
  }
    
  private void createDataBaseView(){
    arboView = new DataBaseView(basemodel);
    Border border = BorderFactory.createLineBorder(Color.black);
    arboView.setBorder(border);
    mainJFrame.add(arboView.getTreeView (), BorderLayout.WEST);
  }

  private void createDummyImageView(){
    JPanel centerSpacer = new JPanel();
    Border border = BorderFactory.createLineBorder(Color.black);
    centerSpacer.setBorder(border);
    JLabel text = new JLabel("Dummy Thumbnail Image View");
    centerSpacer.add(text);
    mainJFrame.add(centerSpacer, BorderLayout.CENTER);
  }
  
  private void createImageView(){
    JPanel imageView = new ImageView(new File("data/papillon.jpg"));
    Border border = BorderFactory.createLineBorder(Color.black);
    imageView.setBorder(border);
    mainJFrame.add(imageView, BorderLayout.CENTER);
  }

  private void createDummyRightPanel(){
    JPanel rightSpacer = new JPanel();
    Border border = BorderFactory.createLineBorder(Color.black);
    rightSpacer.setBorder(border);
    JLabel text = new JLabel("Right Spacer");
    rightSpacer.add (text);
    mainJFrame.add(rightSpacer, BorderLayout.EAST);
  }
  
  private void show() {
    mainJFrame.pack();
    mainJFrame.setVisible(true);
  }
  
}
