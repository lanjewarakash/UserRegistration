package com.blz;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");

        UserRegistration ur = new UserRegistration();
        ur.checkFirstName();
        ur.checkLastName();
        ur.checkEmailId();
        ur.checkMobileNumber();
        ur.checkPassword();
        ur.checkUppercase();
        ur.checkNumericNum();
        ur.checkSpecialChar();
        ur.checkEmailIdSample();
    }
}
