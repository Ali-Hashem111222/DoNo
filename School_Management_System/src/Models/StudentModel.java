/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDateTime;
import personal.Personal;

/**
 *
 * @author ITS
 */
public class StudentModel extends Personal {

    private int age;
    private String full_name, email, address, major;

    public StudentModel(int patient_id, String full_name, int age, String email, String address, String major) {
        this.age = age; 
        this.full_name = full_name;
        this.email = email;
        this.address = address;
        this.major = major;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public StudentModel(int age, String full_name, String email,String address, String major) {
        this.age = age;
        this.full_name = full_name;
        this.email = email;
        this.address = address;
        this.major = major;
    }

    public StudentModel() {
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getFull_name() {
        return full_name;
    }



    public String getAddress() {
        return address;
    }

}
