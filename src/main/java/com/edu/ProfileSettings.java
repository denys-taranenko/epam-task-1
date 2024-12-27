package com.edu;

public class ProfileSettings {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String eMail;
    private String password;

    public void updateFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void updateLastName(String lastName) {
        this.lastName = lastName;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEMail(String eMail) {
        this.eMail = eMail;
    }

    public void updatePassword(String password) {
        this.password = password;
    }
}
