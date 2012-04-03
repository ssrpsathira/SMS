/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

import java.util.LinkedList;
import java.util.List;


public class StudentManagementSystem {
    SimpleStudentRepository ssr=new SimpleStudentRepository();
    List l=new LinkedList();
    public void viewAll(){
        l=(List<?>) ssr.getStudentsMap();
        for(int i=0;i<l.size();i++){
            System.out.println(""+l.get(i));
        }
    }
    public void newStudent(Student s){
        ssr.update(s, s.getRegistrationNumber());
    }
}
