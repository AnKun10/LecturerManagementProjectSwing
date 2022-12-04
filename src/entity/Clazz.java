/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public final class Clazz {
    private String name;
    private String workplace;
    private String speciality;
    private String schedule;
    private Lecturer lecturer;
    private String lecturerName;
    
    private int id;
    private static int autoId = 0;

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public Clazz(String name, String workplace, String speciality, String schedule, Lecturer lecturer) {
        this.id = ++autoId;
        this.name = name;
        this.workplace = workplace;
        this.speciality = speciality;
        this.schedule = schedule;
        this.lecturer = lecturer;
    }

    public Clazz(String name, String workplace, String speciality, String schedule, String lecturerName) {
        this.name = name;
        this.workplace = workplace;
        this.speciality = speciality;
        this.schedule = schedule;
        this.lecturerName = lecturerName;
        this.id = ++autoId;
    }

    @Override
    public String toString() {
        return "Clazz{" + "name=" + name + ", workplace=" + workplace + ", speciality=" + speciality + ", schedule=" + schedule + ", lecturer=" + lecturer + ", lecturerName=" + lecturerName + ", id=" + id + '}';
    }
    
    
    
}
