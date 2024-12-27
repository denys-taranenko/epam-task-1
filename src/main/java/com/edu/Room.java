package com.edu;

public class Room {
    private String roomNumber;
    private boolean isOccupied;

    public boolean checkAvailability() {
        return !isOccupied;
    }

    public void setOccupied(boolean status) {
        this.isOccupied = status;
    }
}
