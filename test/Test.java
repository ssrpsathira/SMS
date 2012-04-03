/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import studentmanagementsystem.Student;
import studentmanagementsystem.SimpleStudentRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

public class Test {
    SimpleStudentRepository repo;
    Student st;

    @Before
    public void setUpClass() throws Exception {
        repo=new SimpleStudentRepository();
        st=new Student("Sathira", "Ruwanpathirana", "CSE", "080000", 4.1000);
        repo.save(st);
    }
    @org.junit.Test
    public void testSaveAndFindMethods(){
        Student temp=repo.find("080000");
        Assert.assertEquals("Test save and find methods",st,temp);
    }
    @org.junit.Test
    public void testUpdate(){
       Student temp=repo.find("080000");
       Assert.assertEquals("Test delete method",null,temp);
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

}