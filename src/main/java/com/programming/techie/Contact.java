package com.programming.techie;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void validateFirstName() {
        if (this.firstName.isBlank())
            throw new RuntimeException("First Name ne peut pas être vide ou null");
    }

    public void validateLastName() {
        if (this.lastName.isBlank())
            throw new RuntimeException("Last Name ne peut pas être vide ou null");
    }

    public void validatePhoneNumber() {
        if (this.phoneNumber.isBlank()) {
            throw new RuntimeException("Phone Name ne peut pas être vide ou null");
        }

        if (this.phoneNumber.length() != 10) {
            throw new RuntimeException("Phone Number doit avoir 10 chiffres");
        }
        if (!this.phoneNumber.matches("\\d+")) {
            throw new RuntimeException("Phone Number ne contient que des chiffres");
        }
        if (!this.phoneNumber.startsWith("0")) {
            throw new RuntimeException("Phone Number doit commenter par 0");
        }
    }


}

