

package studentmanagementsystem;

import java.util.HashMap;


public class SimpleStudentRepository implements StudentRepository{
    HashMap<String, Student> studentMap;

    public Student find(String regNo) {
        return studentMap.get(regNo);
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void save(Student st) {
                studentMap.put(st.getRegistrationNumber(), st);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void update(Student st,String regNo) {
        studentMap.remove(regNo);
        studentMap.put(st.getRegistrationNumber(), st);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void edit(String regNo,String firstName,String lastName,String address,double GPA) {
        Student st=studentMap.get(regNo);
        st.setAddress(address);
        st.setCurrentGPA(GPA);
        st.setFirstName(firstName);
        st.setLastName(lastName);
        studentMap.remove(regNo);
        studentMap.put(regNo, st);
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setStudentsMap(HashMap<String, Student> studentsMap) {
        this.studentMap = studentsMap;
    }

    public HashMap<String, Student> getStudentsMap() {
        return studentMap;
    }







}
