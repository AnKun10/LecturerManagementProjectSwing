/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

import constant.RegexConstant;
import entity.Admin;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Validator {
    public Admin loginInfo(String username, String password, ArrayList<Admin> admins) {
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return admin;
            }
        }
        return null;
    }
    
    public boolean isValidName(String name){
        Pattern pattern = Pattern.compile(RegexConstant.NAME.value);
        Matcher matcher = pattern.matcher(name);
        boolean isValid = matcher.matches();
        if (isValid){
            return true;
        }
        return false;
    }
    
    public boolean isValidPassword(String password){
        Pattern pattern = Pattern.compile(RegexConstant.PASSWORD.value);
        Matcher matcher = pattern.matcher(password);
        boolean isValid = matcher.matches();
        if (isValid){
            return true;
        }
        return false;
    }
    
    public boolean isValidEmail(String email){
        Pattern pattern = Pattern.compile(RegexConstant.EMAIL.value);
        Matcher matcher = pattern.matcher(email);
        boolean isValid = matcher.matches();
        if (isValid){
            return true;
        }
        return false;
    }
    
    public boolean isValidPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile(RegexConstant.PHONENUMBER.value);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean isValid = matcher.matches();
        if (isValid){
            return true;
        }
        return false;
    }
}
