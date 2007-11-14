/*
 * PikasialAppli.java
 *
 * Created on 14 novembre 2007, 19:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package pikasialgrp12.main;

import pikasialgrp12.model.DataBase;
import pikasialgrp12.view.PikasialGUI;

/**
 *
 * @author christophe
 */
public class PikasialAppli {
  
  /** Creates a new instance of PikasialAppli */
  public PikasialAppli () {
    DataBase model = new DataBase(); // model creation
    PikasialGUI gui = new PikasialGUI(model); // view creation over the model
  }
  
  public static void main(String[] args){
    new PikasialAppli();
  }
  
}
