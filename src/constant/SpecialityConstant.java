/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package constant;

/**
 *
 * @author Admin
 */
public enum SpecialityConstant {
    WEBBACKEND("WEB BACK-END"),
    WEBFRONTEND("WEB FRONT-END"),
    DEVOPSAWS("DEVOPS & AWS"),
    MOBILE("MOBILE"),
    STEM("STEM");

    public String value;

    private SpecialityConstant(String value) {
        this.value = value;
    }
    
}
