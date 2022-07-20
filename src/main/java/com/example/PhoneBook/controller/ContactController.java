package com.example.PhoneBook.controller;


import com.example.PhoneBook.model.Contact;
import com.example.PhoneBook.model.ContactUpdatePayload;
import com.example.PhoneBook.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class ContactController {
    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/contact/viewAll", method = RequestMethod.GET)
    public Iterable<Contact> getContacts() {
        return contactService.getContacts();
    }

    @RequestMapping(value = "/contact/view/{id}", method = RequestMethod.GET)
    public Optional<Contact> getContactById(@PathVariable("id") String id) {
        return contactService.createContactById(id);
    }

    @RequestMapping(value = "/contact/create", method = RequestMethod.POST)
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.createContact(contact);
    }

    @RequestMapping(value = "/contact/{id}", method = RequestMethod.PUT)
    public Optional<Contact> updateContactById(@PathVariable("id") String id, @RequestBody ContactUpdatePayload contactUpdatePayload) {
        return contactService.updateContactById(id, contactUpdatePayload);
    }

    @RequestMapping(value = "/contact/deleteById/{id}", method = RequestMethod.DELETE)
    public Optional<Contact> deleteContactById(@PathVariable("id") String id) {
        return contactService.deleteContactById(id);
    }
}