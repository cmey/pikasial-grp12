package pikasialgrp12.model;

import java.util.ArrayList;

public class Folder {
  private String name;

  private ArrayList<PikasialImage> mPikasialImage;

  private ArrayList<MetaDonnee> mMetaDonnee;

  public Folder () {
  }

  public ArrayList<PikasialImage> getPikasialImages () {
    return mPikasialImage;
  }

  public void setPikasialImage (ArrayList<PikasialImage> val) {
    this.mPikasialImage = val;
  }

  public ArrayList<MetaDonnee> getMetaDonnee () {
    return mMetaDonnee;
  }

  public void setMetaDonnee (ArrayList<MetaDonnee> val) {
    this.mMetaDonnee = val;
  }

  public void removePikasialImage (PikasialImage val) {
  }

  public String getName () {
    return name;
  }

  public void setName (String val) {
    this.name = val;
  }
}
