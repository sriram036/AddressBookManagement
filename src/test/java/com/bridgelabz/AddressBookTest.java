package com.bridgelabz;

import org.junit.Test;

public class AddressBookTest {
    AddressBook addressBook = new AddressBook();

    @Test
    public void createContactInAddressBook(){
        String contactPersonName = "sri";
        int contactPersonAge = 25;
        int contactPersonNumber = 1234567890;
        String contactPersonCity = "Bangalore";
        String contactPersonState = "Karnataka";
        addressBook.getData(contactPersonName,contactPersonAge,contactPersonNumber,contactPersonCity,contactPersonState);
    }

    @Test
    public void displayContacts() {
        System.out.println(addressBook);
    }


}
