/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import constant.SpecialityConstant;
import constant.WorkplaceConstant;
import entity.Admin;
import entity.Clazz;
import entity.Lecturer;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import validator.Validator;

/**
 *
 * @author Admin
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static ArrayList<Admin> admins = new ArrayList<>(Arrays.asList(new Admin("An", 18, "an", "an2122004@gmail.com", "0859015893", "1"), new Admin("Tâm", 18, "tam", "tam2303@gmail", "0813815263", "1")));
    public static ArrayList<Clazz> clazzes = new ArrayList<>();
    public static Validator validator = new Validator();
    public static ArrayList<Lecturer> lecturers = new ArrayList<>(Arrays.asList(new Lecturer("Đạt", 24, "dat@gmail.com", "091231245"), new Lecturer("Trường", 26, "trương@gmail.com", "091231473")));
    public static void main(String[] args) {
  
    }

  
    
}
