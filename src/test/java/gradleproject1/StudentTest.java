/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import gradleproject1.Student;
import gradleproject1.CourseProg;
import gradleproject1.Module;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dseok
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    
        /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "John Smith";
        Student instance = new Student();
        instance.setName(name);
        assertEquals(name,instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "John Smith";
        instance.setName("John Smith");
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    
    
        /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 21;
        Student instance = new Student();
        instance.setAge(age);
        assertEquals(age,instance.getAge());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student();
        int expResult = 21;
        instance.setAge(expResult);
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Student instance = new Student();
        String expResult = "John Smith21";
        instance.setName("John Smith");
        instance.setAge(21);
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    
    /**
     * Test of setDOB method, of class Student.
     */
    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        String dob = "10/10/90";
        Student instance = new Student();
        instance.setDOB(dob);
        assertEquals(dob,instance.getDOB());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getDOB method, of class Student.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Student instance = new Student();
        String expResult = "10/10/90";
        instance.setDOB(expResult);
        String result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
        /**
     * Test of setID method, of class Student.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int expResult = 0;
        Student instance = new Student();
        instance.setID(expResult);
        assertEquals(expResult,instance.getID());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

        /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        System.out.println("setCourses");
        ArrayList<CourseProg> courses = new ArrayList<CourseProg>();
        CourseProg c1 = new CourseProg();
        courses.add(c1);      
        Student instance = new Student();
        instance.setCourses(courses);
        assertEquals(courses,instance.getCourses());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        Student instance = new Student();
        ArrayList<CourseProg> expResult = new ArrayList<CourseProg>();
        CourseProg c1 = new CourseProg();
        expResult.add(c1);  
        instance.setCourses(expResult);
        ArrayList<CourseProg> result = instance.getCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

        /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        System.out.println("setModules");
        ArrayList<Module> modules = new ArrayList<Module>();
        Module m1 = new Module();
        Module m2 = new Module();
        modules.add(m1);
        modules.add(m2);
        Student instance = new Student();
        instance.setModules(modules);
        assertEquals(modules,instance.getModules());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        Student instance = new Student();
        ArrayList<Module> expResult = new ArrayList<Module>();
        Module m1 = new Module();
        Module m2 = new Module();
        expResult.add(m1);
        expResult.add(m2);
        instance.setModules(expResult);
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    
}
