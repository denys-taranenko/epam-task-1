package com.edu;

public abstract class User {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String eMail;
    private String password;

    public abstract void updateProfile(ProfileSettings settings);
}
