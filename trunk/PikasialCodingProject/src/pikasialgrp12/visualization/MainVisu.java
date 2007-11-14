/*
 * MainVisu.java
 *
 * Created on 5 novembre 2007, 16:02
 *
 */

package pikasialgrp12.visualization;

import java.io.File;
import javax.swing.JFrame;
import pikasialgrp12.view.ImageView;

/**
 *
 * @author cyberchrist
 */
public class MainVisu {
    
    /** Creates a new instance of MainVisu */
    public MainVisu() {
        File imageFile = new File("data/fox1.gif");
        System.out.println(imageFile.exists());
        ImageView imageDisplayer = new ImageView(imageFile);
        ImageFrame frame = new ImageFrame();
        frame.setImageDisplayer(imageDisplayer);
    }
    
    public static void main(String[] args){
      new MainVisu();
    }
    
  }