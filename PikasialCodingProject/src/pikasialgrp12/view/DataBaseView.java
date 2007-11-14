package pikasialgrp12.view;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import pikasialgrp12.model.DataBase;

public class DataBaseView extends JPanel implements Observer{
  
  private DataBase mymodel;
  private DynamicTree tree; // temporary
  
  public DataBaseView (DataBase db) {
    mymodel = db;
    
    // dummy
    tree = new DynamicTree();
    populateTree (tree);
    getTreeView ().setPreferredSize(new Dimension(150, 150));
    // end dummy
    //add(tree);
  }
  
  public JPanel getTreeView(){
    return tree;
  }
  
  public void populateTree(DynamicTree treePanel) {
        String p1Name = new String("Parent 1");
        String p2Name = new String("Parent 2");
        String c1Name = new String("Child 1");
        String c2Name = new String("Child 2");

        DefaultMutableTreeNode p1, p2;

        p1 = treePanel.addObject(null, p1Name);
        p2 = treePanel.addObject(null, p2Name);

        treePanel.addObject(p1, c1Name);
        treePanel.addObject(p1, c2Name);

        treePanel.addObject(p2, c1Name);
        treePanel.addObject(p2, c2Name);
    }

  public void update (Observable o, Object arg) {
    
  }

}
