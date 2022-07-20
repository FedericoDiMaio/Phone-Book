package com.example.PhoneBook.DAO;

import com.example.PhoneBook.model.Contact;
import com.example.PhoneBook.model.ContactUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class ContactDAO {
    @Autowired
    private ContactRepository contactRepository;

    public Collection<Contact> getContacts(){

        return contactRepository.findAll();
    }
    public Contact createContact(Contact contact) {

        return contactRepository.insert(contact);
    }

    public Optional<Contact> getContactById(String id) {

        return contactRepository.findById(id);
    }

    public Optional<Contact> deleteContactById(String id) {
        Optional<Contact> contact = contactRepository.findById(id);
        contact.ifPresent(b -> contactRepository.delete(b));
        return contact;
    }
    public Optional<Contact> updateContactById(String id, ContactUpdatePayload contactUpdatePayload) {
        Optional<Contact> contact = contactRepository.findById(id);
        contact.ifPresent(b -> b.setName(contactUpdatePayload.getName()));
        contact.ifPresent(b -> b.setSurName(contactUpdatePayload.getSurName()));
        contact.ifPresent(b -> b.setNumber(contactUpdatePayload.getNumber()));
        contact.ifPresent(b -> contactRepository.save(b));
        return contact;
    }
}
