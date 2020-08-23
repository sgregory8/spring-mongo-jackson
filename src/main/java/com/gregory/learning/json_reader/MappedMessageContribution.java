package com.gregory.learning.json_reader;

import java.util.Map;

public class MappedMessageContribution {

  public MappedMessageContribution() {
  }

  public MappedMessageContribution(String name,
      Map<String, Object> auditDetails) {
    this.name = name;
    this.auditDetails = auditDetails;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<String, Object> getAuditDetails() {
    return auditDetails;
  }

  public void setAuditDetails(Map<String, Object> auditDetails) {
    this.auditDetails = auditDetails;
  }

  private String name;
  private Map<String, Object> auditDetails;

}
