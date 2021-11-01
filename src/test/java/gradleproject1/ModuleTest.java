/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import gradleproject1.Module;
import gradleproject1.Student;
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
public class ModuleTest {
    
    public ModuleTest() {
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
     * Test of setName method, of class Module.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "comp prog";
        Module instance = new Module();
        instance.setName(Name);
        assertEquals(Name,instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of getName method, of class Module.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Module instance = new Module();
        String expResult = "comp prog";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of getId method, of class Module.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Module instance = new Module();
        String expResult = "CT101";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Module.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String Id = "CT101";
        Module instance = new Module();
        instance.setId(Id);
        assertEquals(Id,instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class Module.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        Module instance = new Module();
        ArrayList<Student> expResult = new ArrayList<Student>();
        Student s1 = new Student();
        expResult.add(s1);
        Student s2 = new Student();
        expResult.add(s2);
        instance.setStudents(expResult);
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudents method, of class Module.
     */
    @Test
    public void testSetStudents() {
        System.out.println("setStudents");
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student();
        students.add(s1);
        Student s2 = new Student();
        students.add(s2);
        Module instance = new Module();
        instance.setStudents(students);
        assertEquals(students,instance.getStudents());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAssCourse method, of class Module.
     */
    @Test
    public void testGetAssCourse() {
        System.out.println("getAssiCourse");
        Module instance = new Module();
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("BCT");
        expResult.add("EEC");
        instance.setAssiCourse(expResult); 
        ArrayList<String> result = instance.getAssiCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAssCourse method, of class Module.
     */
    @Test
    public void testSetAssCourse() {
        System.out.println("setAssiCourse");
        ArrayList<String> assiCourse = new ArrayList<String>();
        assiCourse.add("BCT");
        assiCourse.add("EEC");
        
        Module instance = new Module();
        instance.setAssiCourse(assiCourse);
        assertEquals(assiCourse,instance.getAssiCourse());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
