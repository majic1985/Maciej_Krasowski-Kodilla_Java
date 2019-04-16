package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public final class User {
    private final String user;
    private final String userName;
    private final String userSurname;
    private final LocalDate dOB;
    private String streetAddress;
    private String cityAddress;
    private String postalCode;
    private String country;
    private int phoneNumber;
    public LocalDate lastSeen;

    public User(String user, String userName, String userSurname, LocalDate dOB, String streetAddress, String cityAddress, String postalCoode, String country, int phoneNumber) {
        this.user = user;
        this.userName = userName;
        this.userSurname = userSurname;
        this.dOB = dOB;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.postalCode = postalCoode;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public User(String user, String userName, String userSurname, LocalDate dOB) {
        this.user = user;
        this.userName = userName;
        this.userSurname = userSurname;
        this.dOB = dOB;
    }

    public String getUser() {
        return this.user;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserSurname() {
        return this.userSurname;
    }

    public LocalDate getdOB() {
        return this.dOB;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public String getCityAddress() {
        return this.cityAddress;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public LocalDate getLastSeen() {
        return this.lastSeen;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            User user1 = (User)o;
            if (!this.user.equals(user1.user)) {
                return false;
            } else {
                if (this.userName != null) {
                    if (this.userName.equals(user1.userName)) {
                        return this.userSurname != null ? this.userSurname.equals(user1.userSurname) : user1.userSurname == null;
                    }
                } else if (user1.userName == null) {
                    return this.userSurname != null ? this.userSurname.equals(user1.userSurname) : user1.userSurname == null;
                }

                return false;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.user.hashCode();
        result = 31 * result + (this.userName != null ? this.userName.hashCode() : 0);
        result = 31 * result + (this.userSurname != null ? this.userSurname.hashCode() : 0);
        return result;
    }
}

