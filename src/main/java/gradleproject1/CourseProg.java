/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import gradleproject1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author dseok
 */
public class CourseProg {
    private String name;
    private ArrayList<Module> moudles;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getMoudles() {
        return moudles;
    }

    public void setMoudles(ArrayList<Module> moudles) {
        this.moudles = moudles;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
    
    
    
}
