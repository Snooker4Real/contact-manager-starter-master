package com.programming.techie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactManagerTest {
    @Test
    public void shouldCreateContact(){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("John","Doe","0758916877");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1,contactManager.getAllContacts().size());
   
   
    }
}