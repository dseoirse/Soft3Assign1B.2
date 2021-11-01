/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.ArrayList;

/**
 *
 * @author dseok
 */
public class Student {

    private String name;
    private int age;
    private String dob;
    private int id;
    //private String username;
    private ArrayList <CourseProg> courses;
    private ArrayList <Module> modules;
    
    
    public String getUsername(){
         return name+age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }


//    public void setUsername(String username) {
//        this.username = username;
//    }

    public ArrayList <CourseProg> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList <CourseProg> courses) {
        this.courses = courses;
    }

    public ArrayList <Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList <Module> modules) {
        this.modules = modules;
    }


    
    

    
}
