package com.edu;

public class Administrator extends User {

    public void manageApplication(Application application) {
        // Logic to approve or reject application
    }

    public void assignRoom(Room room, Resident resident) {
        // Logic to assign room to a resident
    }

    public Report generateReport() {
        // Logic to generate a report
        return new Report();
    }

    @Override
    public void updateProfile(ProfileSettings settings) {
        // Logic to update profile settings
    }
}
