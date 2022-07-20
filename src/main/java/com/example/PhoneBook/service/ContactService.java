package com.example.PhoneBook.service;

import com.example.PhoneBook.DAO.ContactDAO;
import com.example.PhoneBook.model.Contact;
import com.example.PhoneBook.model.ContactUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactDAO contactDAO;

    public Collection<Contact> getContacts() {

        return contactDAO.getContacts();
    }

    public Contact createContact(Contact contact) {

        return contactDAO.createContact(contact);
    }

    public Optional<Contact> createContactById(String id) {
        return contactDAO.getContactById(id);
    }

    public Optional<Contact> deleteContactById(String id) {

        return contactDAO.deleteContactById(id);
    }

    public Optional<Contact> updateContactById(String id, ContactUpdatePayload contactUpdatePayload) {
        return contactDAO.updateContactById(id, contactUpdatePayload);
    }
}
