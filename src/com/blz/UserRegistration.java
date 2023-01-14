package com.blz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void checkFirstName() {
        System.out.println("Enter a FirstName");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Pattern p = Pattern.compile("[A-Z][a-z]{2}+[a-z]*");
        Matcher m = p.matcher(name);

        if (m.matches()) {
            System.out.println(name + " Is a Valid Name");
        } else {
            System.out.println(name + " Is a InValid Name");
        }
    }

    public void checkLastName() {
        System.out.println("Enter a LastName");
        Scanner sc = new Scanner(System.in);
        String lName = sc.nextLine();

        Pattern p = Pattern.compile("[A-Z][a-z]{2}+[a-z]*");
        Matcher m = p.matcher(lName);

        if (m.matches()) {
            System.out.println(lName + " Is a Valid LastName");
        } else {
            System.out.println(lName + " Is a InValid LastName");
        }
    }

    public void checkEmailId() {
        System.out.println("Enter a Email Id");
        Scanner sc = new Scanner(System.in);
        String eId = sc.nextLine();

        Pattern p = Pattern.compile("[a-zA-Z0-9.-]*@[a-zA-Z]+[.][a-zA-Z]+");
        Matcher m = p.matcher(eId);

        if (m.matches()) {
            System.out.println(eId + " Is a Valid EmailId");
        } else {
            System.out.println(eId + " Is a InValid EmailId");
        }
    }

    public void checkMobileNumber() {
        System.out.println("Enter a Mobile Number");
        Scanner sc = new Scanner(System.in);
        String mNum = sc.nextLine();

        Pattern p = Pattern.compile("(0|91)?[789][0-9]{9}");
        Matcher m = p.matcher(mNum);

        if (m.matches()) {
            System.out.println(mNum + " Is a Valid Mobile Number");
        } else {
            System.out.println(mNum + " Is a InValid Mobile Number");
        }
    }

    public void checkPassword() {
        System.out.println("Enter a Password");
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();

        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
        Matcher m = p.matcher(pass);
        if (m.matches()) {
            System.out.println("PassWord is Correct");
        } else {
            System.out.println("Password is Wrong");
        }
    }
    public void checkUppercase() {
        System.out.println("Enter a @least upperCase");
        Scanner sc = new Scanner(System.in);
        String pUpp = sc.next();

        Pattern p = Pattern.compile("(?=.*[A-Z])[0-9a-zA-Z@!+_.]{8,}");
        Matcher m = p.matcher(pUpp);
        if (m.matches()) {
            System.out.println("Valid ! It contains uppercase letter");
        } else {
            System.out.println("Enter @least one uppercase letter");
        }
    }

    public void checkNumericNum() {
        System.out.println("Enter a @least Numeric Number");
        Scanner sc = new Scanner(System.in);
        String nNum = sc.next();

        Pattern p = Pattern.compile("(?=.*[0-9])[0-9a-zA-Z@!+_.]{8,}");
        Matcher m = p.matcher(nNum);
        if (m.matches()) {
            System.out.println("Valid ! It contains Numeric Number");
        } else {
            System.out.println("Enter @least one Numeric Number");
        }
    }

    public void checkSpecialChar() {
        System.out.println("Enter a @least Special Character");
        Scanner sc = new Scanner(System.in);
        String sChar = sc.next();

        Pattern p = Pattern.compile("(?=.*[+._@!-])[0-9a-zA-Z@!+_.]{8,}");
        Matcher m = p.matcher(sChar);
        if (m.matches()) {
            System.out.println("Valid ! It contains Special Character");
        } else {
            System.out.println("Enter @least one Special Character");
        }
    }

}
