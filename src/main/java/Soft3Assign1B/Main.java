/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soft3Assign1B;

import gradleproject1.Student;
import gradleproject1.Module;
import gradleproject1.CourseProg;
//import SoftwareAssign1.gradleproject1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;
//import com.github.dseoirse.Software3Assign1.src.main.java.gradleproject1.Student;
//import gradleprojectTest.StudentTest;
//import Software3Assign1.src.test.gradleprojectTest.StudentTest;
//import src..gradleprojectTest.ModuleTest;
//import com.github.dseoirse.Software3Assign1.c9bf06ef91;
//import gradleproject2.src.test.gradleprojectTest.StudentTest;
//import gradleprojectTest.CourseProgTest;

//import gradleprojectTest.StudentTest;
//import gradleprojectTest.StudentTest;
//import com.github.dseoirse.Software3Assign1.c9bf06ef91.gradle1;


//test
//import Software3-Assign1;

/**
 *
 * @author dseok
 */
public class Main  {
        private static ArrayList<Module> allModules;
        private static ArrayList<CourseProg> allCourses;
        
        
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
        
        s1.setName("John");
        s2.setName("Mary");
        s3.setName("Jane");
        s4.setName("Jim");
        s5.setName("Joe");
        
        s1.setAge(18);
        s2.setAge(22);
        s3.setAge(20);
        s4.setAge(21);
        s5.setAge(19);
        
        s1.setDOB("10/5/2003");
        s2.setDOB("1/2/1999");
        s3.setDOB("4/7/2001");
        s4.setDOB("8/9/2000");
        s5.setDOB("3/1/2002");
        
        s1.setID(139383);
        s2.setID(134584);
        s3.setID(130392);
        s4.setID(136678);
        s5.setID(134567);
        
        //TODO and courses and modules
        
        //s1.setCourses(courses);
        //s1.setCourses(courses);
        //s1.setCourses(courses);
        
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
        
        allModules = new ArrayList<>();
        allModules.add(mod1);
        allModules.add(mod2);
        allModules.add(mod3);
        allModules.add(mod4);
        allModules.add(mod5);
        allModules.add(mod6);
        
        
        mod1.setName("Systems Modelling");
        mod2.setName("Machine Learning");
        mod3.setName("Software Engineering 3");
        mod4.setName("Information Retrieval");
        mod5.setName("Graphics and Images");
        mod6.setName("Advanced Professional Skills");
         
        mod1.setId("CT561");
        mod2.setId("CT4101");
        mod3.setId("CT417");
        mod4.setId("CT4100");
        mod5.setId("CT404");
        mod6.setId("CT436");

        ArrayList<Student> mod1students = new ArrayList<>();
        mod1students.add(s1);
        mod1students.add(s2);
        mod1.setStudents(mod1students);
        
        ArrayList<Student> mod2students = new ArrayList<>();
        mod2students.add(s1);
        mod2students.add(s3);
        mod2.setStudents(mod2students);
              
        ArrayList<Student> mod3students = new ArrayList<>();
        mod3students.add(s4);
        mod3students.add(s5);
        mod3.setStudents(mod3students);       
        
        
        ArrayList<Student> mod4students = new ArrayList<>();
        mod4students.add(s1);
        mod4students.add(s2);
        mod4.setStudents(mod4students); 
        
        
        ArrayList<Student> mod5students = new ArrayList<>();
        mod5students.add(s4);
        mod5students.add(s5);
        mod5.setStudents(mod5students);
        
        
        ArrayList<Student> mod6students = new ArrayList<>();
        mod6students.add(s1);
        mod6students.add(s2);
        mod6students.add(s3);
        mod6students.add(s4);
        mod6students.add(s5);
        mod6.setStudents(mod6students);
        
        
        
        //assiCourse should be of typ ProgCours and not a list?      
        
   
        
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
        allCourses = new ArrayList<>();
        allCourses.add(course1);
        allCourses.add(course2);
        allCourses.add(course3);
        
        course1.setName("CS&IT");
        course2.setName("ECE");
        course3.setName("IT");
        //add modules to courses
        ArrayList<Module> course1modules = new ArrayList<>();
        course1modules.add(mod1);
        course1modules.add(mod2);
        course1modules.add(mod6);
        course1.setMoudles(course1modules);
        

        ArrayList<Module> course2modules = new ArrayList<>();
        course2modules.add(mod3);
        course2modules.add(mod4);
        course2modules.add(mod6);
        course2.setMoudles(course2modules);
        
        
        ArrayList<Module> course3modules = new ArrayList<>();
        course3modules.add(mod5);
        course3modules.add(mod6);
        course3.setMoudles(course3modules);
        
        
        //add students to courses
        ArrayList<Student> course1students = new ArrayList<>();
        course1students.add(s1);
        course1students.add(s2);
        course1.setStudents(course1students);
        
        
        ArrayList<Student> course2students = new ArrayList<>();
        course2students.add(s4);
        course2students.add(s3);
        course2.setStudents(course2students); 
        
        ArrayList<Student> course3students = new ArrayList<>();
        course3students.add(s5);
        course3.setStudents(course3students);
        
        
        
        DateTime courseStartDate = new DateTime(2021,9,1,0,0);
        //DateTime course2StartDate = new DateTime();
        //DateTime course3StartDate = new DateTime();
        //one start and end date will do
        course1.setStartDate(courseStartDate);
        course2.setStartDate(courseStartDate);
        course3.setStartDate(courseStartDate);
        
        
        
        DateTime courseEndDate = new DateTime(2021,11,20,0,0);
        //DateTime course2endDate = new DateTime();
        //DateTime course3endDate = new DateTime();
        course1.setEndDate(courseEndDate);
        course2.setEndDate(courseEndDate);
        course3.setEndDate(courseEndDate);
        
        

       //TODO printouts
       //todo toString?
       
       //System.out.println(course1.getName()+" "+course1.getMoudles().+" "+course1.getStudents());
       printCourse(course1);
       printCourse(course2);
       printCourse(course3);
       
       printStudent(s1);
       printStudent(s2);
       printStudent(s3);
       printStudent(s4);
       printStudent(s5);



    
  
        
    }//end main method
    
    public static void printCourse(CourseProg course){
        System.out.println(course.getName());
        
        for(Module m : course.getMoudles()){
            System.out.println(m.getName()+":"+m.getId()+" ");
        }//end for
        System.out.println("\n");
    }//end for course
    
    
    public static void printStudent(Student s){
        System.out.println("Name:"+s.getName()+" Username:"+s.getUsername());
            System.out.print("Reg module :");
            for(Module m : allModules){
                //System.out.println(m.getName());
                for(Student s1 : m.getStudents()){
                    if(s.equals(s1)){
                        System.out.print(m.getName()+", ");
                    }//end if
                }//nd get students for
                
            }//end all modules looop
        System.out.println();
        
        for(CourseProg c : allCourses){
            for(Student s2 : c.getStudents()){
                if(s.equals(s2)){
                    System.out.println("Registered in course: "+c.getName());
                }
            }
        }
        System.out.println("\n\n");
        
        
        
    }//end print students
    
}//end main class
