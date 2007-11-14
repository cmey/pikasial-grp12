package pikasialgrp12.model;

import java.util.ArrayList;

public class DataBase {
  private ArrayList<Folder> mFolder;

  public DataBase () {
  }

  public void Import (String path) {
  }

  public ArrayList<Folder> getFolder () {
    return mFolder;
  }

  public void setFolder (ArrayList<Folder> val) {
    this.mFolder = val;
  }
}
