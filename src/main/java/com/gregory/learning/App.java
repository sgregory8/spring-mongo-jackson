package com.gregory.learning;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gregory.learning.entity.MongoDocumentRepository;
import com.gregory.learning.json_reader.MappedMessage;
import com.gregory.learning.json_writer.CarDetails;
import com.gregory.learning.json_writer.GuitarDetails;
import com.gregory.learning.json_writer.Message;
import com.gregory.learning.json_writer.MessageContribution;
import java.io.IOException;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

  private final MongoDocumentRepository mongoDocumentRepository;

  @Autowired
  public App(MongoDocumentRepository mongoDocumentRepository) {
    this.mongoDocumentRepository = mongoDocumentRepository;
  }

  public static void main(final String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void run(String... args) throws IOException {

    // Create message parts
    MessageContribution messageContributionA = new MessageContribution("VOLVO",
        new CarDetails(4, 2000));
    MessageContribution messageContributionB = new MessageContribution("GIBSON",
        new GuitarDetails(6, "Cherry", "Cherry Sunburst"));

    // Create message
    Message message = new Message("ORDER_1",
        Arrays.asList(messageContributionA, messageContributionB));

    // Create the mapper and write to json
    ObjectMapper mapper = new ObjectMapper();
    String jsonString = mapper.writeValueAsString(message);

    // Map the message back
    MappedMessage mappedMessage = mapper.readValue(jsonString, MappedMessage.class);

    // Write the message to mongo
    mongoDocumentRepository.insert(mappedMessage);
  }
}

