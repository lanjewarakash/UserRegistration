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
}