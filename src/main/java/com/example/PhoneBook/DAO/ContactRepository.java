package com.example.PhoneBook.DAO;

import com.example.PhoneBook.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
}
