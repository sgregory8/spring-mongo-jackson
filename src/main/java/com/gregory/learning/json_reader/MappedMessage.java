package com.gregory.learning.json_reader;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class MappedMessage {

  public MappedMessage() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<MappedMessageContribution> getMappedMessageContributions() {
    return mappedMessageContributions;
  }

  public void setMappedMessageContributions(
      List<MappedMessageContribution> mappedMessageContributions) {
    this.mappedMessageContributions = mappedMessageContributions;
  }

  public MappedMessage(String id,
      List<MappedMessageContribution> mappedMessageContributions) {
    this.id = id;
    this.mappedMessageContributions = mappedMessageContributions;
  }

  private String id;

  @JsonProperty("messageContributions")
  List<MappedMessageContribution> mappedMessageContributions;

}
