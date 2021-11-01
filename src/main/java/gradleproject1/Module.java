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
public class Module {

    public Module() {
    }
    
    private String Name;
    private String Id;
    private ArrayList <Student> students;
    private ArrayList <String> assiCourse;
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<String> getAssiCourse() {
        return assiCourse;
    }

    public void setAssiCourse(ArrayList<String> assCourse) {
        this.assiCourse = assCourse;
    }

    
    
    
    
}
