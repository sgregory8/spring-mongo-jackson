package com.gregory.learning.json_writer;

import java.util.List;

public class Message {

  public Message() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<MessageContribution> getMessageContributions() {
    return messageContributions;
  }

  public void setMessageContributions(
      List<MessageContribution> messageContributions) {
    this.messageContributions = messageContributions;
  }

  public Message(String id,
      List<MessageContribution> messageContributions) {
    this.id = id;
    this.messageContributions = messageContributions;
  }

  private String id;
  List<MessageContribution> messageContributions;

}
