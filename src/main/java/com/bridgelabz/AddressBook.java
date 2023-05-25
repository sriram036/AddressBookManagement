package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void getData(String contactPersonName, int contactPersonAge, int contactPersonNumber, String contactPersonCity, String contactPersonState) {
        Contact contact = new Contact(contactPersonName,contactPersonAge,contactPersonNumber,contactPersonCity,contactPersonState);
        contacts.add(contact);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                '}';
    }
}
