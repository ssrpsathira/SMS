/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

public interface StudentRepository {
    public Student find(String x);
    public void save(Student x);
    public void update(Student s,String num);
    public void edit(String regNum,String firstName,String lastName,String address,double GPA);
}
