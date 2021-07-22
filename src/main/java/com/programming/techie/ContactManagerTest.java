package com.programming.techie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactManagerTest {
    @Test
    public void shouldCreateContact(){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("John","Doe","0758916877");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1,contactManager.getAllContacts().size());
        Assertions.assertTrue(contactManager.getAllContacts().stream()
                .filter(contact -> contact.getFirstName().equals("John") &&
                        contact.getLastName().equals("Doe") &&
                        contact.getPhoneNumber().equals("0758916877"))
                .findAny()
                .isPresent());
   
    }

    @Test
    @DisplayName("Ne pas créer de contact si le nom est vide (null)")
    public void shouldThrowRuntimeExceptionWhenFirstNameIsNull(){
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class,() -> {
            contactManager.addContact(null,"Doe","0758916877");
        });
    }

    @Test
    @DisplayName("Ne pas créer de contact si le nom est vide (null)")
    public void shouldThrowRuntimeExceptionWhenLastNameIsNull(){
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class,() -> {
            contactManager.addContact("John",null,"0758916877");
        });
    }

    @Test
    @DisplayName("Ne pas créer de contact si le nom est vide (null)")
    public void shouldThrowRuntimeExceptionWhenPhoneNumberIsNull(){
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class,() -> {
            contactManager.addContact("John","Doe",null);
        });
    }
}