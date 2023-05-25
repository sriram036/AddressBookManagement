package com.bridgelabz;

public class Contact {

    String contactPersonName;
    int contactPersonAge;
    int contactPersonNumber;
    String contactPersonCity;
    String contactPersonState;

    public Contact(String contactPersonName, int contactPersonAge, int contactPersonNumber, String contactPersonCity, String contactPersonState) {
        this.contactPersonName = contactPersonName;
        this.contactPersonAge = contactPersonAge;
        this.contactPersonNumber = contactPersonNumber;
        this.contactPersonCity = contactPersonCity;
        this.contactPersonState = contactPersonState;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactPersonName='" + contactPersonName + '\'' +
                ", contactPersonAge=" + contactPersonAge +
                ", contactPersonNumber=" + contactPersonNumber +
                ", contactPersonCity='" + contactPersonCity + '\'' +
                ", contactPersonState='" + contactPersonState + '\'' +
                '}';
    }
}
