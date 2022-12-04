/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Lecturer extends Person{
    private String speciality;
    private int id;
    private static int autoId = 0;

    public Lecturer(String name, int age, String username, String email, String phoneNumb, String password, String speciality) {
        super(name, age, username, email, phoneNumb, password);
        this.id = ++autoId;
        this.speciality = speciality;
    }

    public Lecturer() {}

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }
}
