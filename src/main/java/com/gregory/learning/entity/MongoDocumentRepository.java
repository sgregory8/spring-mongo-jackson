package com.gregory.learning.entity;

import com.gregory.learning.json_reader.MappedMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDocumentRepository extends MongoRepository<MappedMessage, String> {

}
