package com.gregory.learning.json_writer;

public class MessageContribution {

  public MessageContribution() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditDetails getAuditDetails() {
    return auditDetails;
  }

  public void setAuditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
  }

  public MessageContribution(String name, AuditDetails auditDetails) {
    this.name = name;
    this.auditDetails = auditDetails;
  }

  private String name;
  private AuditDetails auditDetails;

}
