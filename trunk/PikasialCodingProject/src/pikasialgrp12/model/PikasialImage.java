package pikasialgrp12.model;

import java.awt.Image;
import java.util.ArrayList;

public class PikasialImage {
  private String path;

  private Image imageData;

  private float zoomFactor;

  private ArrayList<MetaDonnee> mMetaDonnee;

  public PikasialImage () {
  }

  public ArrayList<MetaDonnee> getMetaDonnee () {
    return mMetaDonnee;
  }

  public void setMetaDonnee (ArrayList<MetaDonnee> val) {
    this.mMetaDonnee = val;
  }

  public String getPath () {
    return path;
  }

  public void setPath (String val) {
    this.path = val;
  }

  public Image getImageData () {
    return imageData;
  }

  public void setImageData (Image val) {
    this.imageData = val;
  }

  public void zoom (float value) {
  }

  public void rotate (float value) {
  }

  public float getZoomFactor () {
    return zoomFactor;
  }

  public void setZoomFactor (float val) {
    this.zoomFactor = val;
  }
}
