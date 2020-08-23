package com.gregory.learning.json_writer;

public class CarDetails implements AuditDetails {

  public CarDetails() {
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  public int getEngineSize() {
    return engineSize;
  }

  public void setEngineSize(int engineSize) {
    this.engineSize = engineSize;
  }

  public CarDetails(int numberOfDoors, int engineSize) {
    this.numberOfDoors = numberOfDoors;
    this.engineSize = engineSize;
  }

  private int numberOfDoors;
  private int engineSize;

}
