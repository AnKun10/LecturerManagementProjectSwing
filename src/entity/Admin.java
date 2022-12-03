/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Admin extends Person{
    private int id;
    private static int autoId = 0;
    public Admin(){ }

    public Admin(String name, int age, String username, String email, String phoneNumb, String password) {
        super(name, age, username, email, phoneNumb, password);
        this.id = ++autoId;
    }
    
    public int getId() {return id;}
}
