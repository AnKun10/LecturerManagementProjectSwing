/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

import entity.Admin;
import java.util.ArrayList;

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
}
