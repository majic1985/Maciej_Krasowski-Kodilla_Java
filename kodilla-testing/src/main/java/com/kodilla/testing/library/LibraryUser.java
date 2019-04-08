package com.kodilla.testing.library;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselId;

    public LibraryUser(String firstname, String lastname, String peselID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselID;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getPeselID() {
        return this.peselId;
    }

    public String toString() {
        return "LibraryUser{firstname='" + this.firstname + '\'' + ", lastname='" + this.lastname + '\'' + ", peselID='" + this.peselId + '\'' + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof LibraryUser)) {
            return false;
        } else {
            LibraryUser that = (LibraryUser)o;
            if (!this.firstname.equals(that.firstname)) {
                return false;
            } else {
                return !this.lastname.equals(that.lastname) ? false : this.peselId.equals(that.peselId);
            }
        }
    }

    public int hashCode() {
        int result = this.firstname.hashCode();
        result = 31 * result + this.lastname.hashCode();
        result = 31 * result + this.peselId.hashCode();
        return result;
    }
}
