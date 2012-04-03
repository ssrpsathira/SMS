/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;


public class Student {
    private String firstName;
    private String lastName;
    private String address;
    private String registrationNumber;
    private double currentGPA;

    public double getCurrentGPA() {
        return currentGPA;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, String address, String registrationNumber, double currentGPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.currentGPA = currentGPA;
    }

    public void setCurrentGPA(double currentGPA) {
        this.currentGPA = currentGPA;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
