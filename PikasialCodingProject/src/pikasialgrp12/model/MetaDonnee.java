package pikasialgrp12.model;

import java.util.Date;

public class MetaDonnee {
  private Date date;

  private String description;

  private int type;

  private int size;

  public MetaDonnee () {
  }

  public Date getDate () {
    return date;
  }

  public void setDate (Date val) {
    this.date = val;
  }

  public String getDescription () {
    return description;
  }

  public void setDescription (String val) {
    this.description = val;
  }

  public int getType () {
    return type;
  }

  public void setType (int val) {
    this.type = val;
  }

  public int getSize () {
    return size;
  }

  public void setSize (int val) {
    this.size = val;
  }
}
