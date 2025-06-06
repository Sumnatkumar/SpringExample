package com.tight.coupling;

// A - MySQL, PostgresSQL
// B - Web Service, MongoDB

public class UserDatabase {
    public String getUserDetails() {
        // Directly access database her
        return "User Details From Database";
    }
}
