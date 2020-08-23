package com.gregory.learning.json_writer;

public class GuitarDetails implements AuditDetails {

  public GuitarDetails() {
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public GuitarDetails(int numberOfStrings, String material, String colour) {
    this.numberOfStrings = numberOfStrings;
    this.material = material;
    this.colour = colour;
  }

  private int numberOfStrings;
  private String material;
  private String colour;

}
