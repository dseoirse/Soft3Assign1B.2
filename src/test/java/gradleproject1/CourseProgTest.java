/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import gradleproject1.CourseProg;
import gradleproject1.Module;
import gradleproject1.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;
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
public class CourseProgTest {
    
    public CourseProgTest() {
        System.out.println(" ");
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
     * Test of getName method, of class CourseProg.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CourseProg instance = new CourseProg();
        String expResult = "BCT";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class CourseProg.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "BCT";
        CourseProg instance = new CourseProg();
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMoudles method, of class CourseProg.
     */
    @Test
    public void testGetMoudles() {
        System.out.println("getMoudles");
        CourseProg instance = new CourseProg();
        ArrayList<Module> expResult = new ArrayList<Module>();
        Module m1 = new Module();
        expResult.add(m1);
        Module m2 = new Module();
        expResult.add(m2);
        instance.setMoudles(expResult);
        
        ArrayList<Module> result = instance.getMoudles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMoudles method, of class CourseProg.
     */
    @Test
    public void testSetMoudles() {
        System.out.println("setMoudles");
        ArrayList<Module> moudles = new ArrayList<Module>();
        Module m1 = new Module();
        moudles.add(m1);
        Module m2 = new Module();
        moudles.add(m2);       
        CourseProg instance = new CourseProg();
        instance.setMoudles(moudles);
        
        ArrayList<Module> result = instance.getMoudles();
        assertEquals(moudles, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class CourseProg.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        CourseProg instance = new CourseProg();
        ArrayList<Student> expResult = new ArrayList<Student>();
        Student s1 = new Student();
        Student s2 = new Student();
        expResult.add(s1);
        expResult.add(s2);
        instance.setStudents(expResult);
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class CourseProg.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student();
        Student s2 = new Student();
        students.add(s1);
        students.add(s2);
        CourseProg instance = new CourseProg();
        instance.setStudents(students);
        
        ArrayList<Student> result = instance.getStudents();
        assertEquals(students, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class CourseProg.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        CourseProg instance = new CourseProg();
        DateTime expResult = new DateTime(2020,9,10,0,0);
        instance.setStartDate(expResult);
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class CourseProg.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime startDate = new DateTime(2020,9,10,0,0);
        CourseProg instance = new CourseProg();
        instance.setStartDate(startDate);
        assertEquals(startDate,instance.getStartDate());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class CourseProg.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        CourseProg instance = new CourseProg();
        DateTime expResult = new DateTime(2021,5,20,0,0);
        instance.setEndDate(expResult);
        DateTime result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class CourseProg.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime endDate = new DateTime(2021,5,20,0,0);
        CourseProg instance = new CourseProg();
        instance.setEndDate(endDate);
        DateTime result = instance.getEndDate();
        assertEquals(endDate, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
