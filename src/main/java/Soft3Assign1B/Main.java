/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soft3Assign1B;

import gradleproject1.Student;
import gradleproject1.Module;
import gradleproject1.CourseProg;
import java.util.ArrayList;
import org.joda.time.DateTime;
//import Software3-Assign1;

/**
 *
 * @author dseok
 */
public class Main  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
// student variables
    
//    private String name;
//    private int age;
//    private String dob;
//    private int id;
//    private ArrayList<CourseProg> courses;
//    private ArrayList<Module> modules;
        
        //create students and their details
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        
        s1.setName("");
        s2.setName("");
        s3.setName("");
        s4.setName("");
        s5.setName("");
        
        s1.setAge(18);
        s2.setAge(22);
        s3.setAge(20);
        s4.setAge(21);
        s5.setAge(19);
        
        s1.setDOB("");
        s2.setDOB("");
        s3.setDOB("");
        s4.setDOB("");
        s5.setDOB("");
        
        //TODO id and courses and modules
        
        //s1.setCourses(courses);
        //s1.setCourses(courses);
        //s1.setCourses(courses);
        
        
        
// Course variables
//    private String name;
//    private ArrayList<Module> moudles;
//    private ArrayList<Student> students;
//    private DateTime startDate;
//    private DateTime endDate;
        
        //course details
        CourseProg course1 = new CourseProg();
        CourseProg course2 = new CourseProg();
        CourseProg course3 = new CourseProg();
        
        course1.setName("");
        course2.setName("");
        course3.setName("");
        
        ArrayList<Module> course1modules = new ArrayList<Module>();
        ArrayList<Module> course2modules = new ArrayList<Module>();
        ArrayList<Module> course3Modules = new ArrayList<Module>();
        
        ArrayList<Student> course1students = new ArrayList<Student>();
        ArrayList<Student> course2students = new ArrayList<Student>();
        ArrayList<Student> course3students = new ArrayList<Student>();
        
        DateTime course1StartDate = new DateTime();
        DateTime course2StartDate = new DateTime();
        DateTime course3StartDate = new DateTime();
        
        DateTime course1endDate = new DateTime();
        DateTime course2endDate = new DateTime();
        DateTime course3endDate = new DateTime();
        
        
        
// Module variables      
//    private String Name;
//    private String Id;
//    private ArrayList<Student> students;
//    private ArrayList<String> assiCourse;
        Module mod1 = new Module();
        Module mod2 = new Module();
        Module mod3 = new Module();
        Module mod4 = new Module();
        Module mod5 = new Module();
        Module mod6 = new Module();
        
        mod1.setName("");
        mod2.setName("");
        mod3.setName("");
        mod4.setName("");
        mod5.setName("");
        mod6.setName("");
        
        mod1.setId("");
        mod2.setId("");
        mod3.setId("");
        mod4.setId("");
        mod5.setId("");
        mod6.setId("");

        ArrayList<Student> mod1students = new ArrayList<Student>();
        ArrayList<Student> mod2students = new ArrayList<Student>();
        ArrayList<Student> mod3students = new ArrayList<Student>();
        ArrayList<Student> mod4students = new ArrayList<Student>();
        ArrayList<Student> mod5students = new ArrayList<Student>();
        ArrayList<Student> mod6students = new ArrayList<Student>();
        
        //assiCourse should be of typ ProgCours and not a list?
       
        
        
    }//end main method
    
}//end main class
