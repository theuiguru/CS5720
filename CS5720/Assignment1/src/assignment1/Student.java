package assignment1;
import java.util.*;
/**
 * CS5720 Assignment 1
 * StudentComparator.java
 * Purpose: Student Record Management System
 * 
 * @author Chris Thomas
 */
public class Student {
    private String firstName, lastName, id;
    private Calendar birthDay;
    //Calendar.set(Calendar.YEAR, year);
    //Calendar.set(Calendar.MONTH, month-1);
    //Calendar.set(Calendar.DAY_OF_MONTH, day);
    public Student(String firstName, String lastName, String id, Calendar birthDay)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.birthDay = birthDay;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getStudentId()
    {
        return firstName;
    }
    public void setStudentId(String id)
    {
        this.id = id;
    }
    public Calendar getBirthday()
    {
        return birthDay;
    }
    public void setBirthday(Calendar birthDay)
    {
        this.birthDay = birthDay;
    }
    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n" + "Student ID:" + id + "\n" + "Birthday:" + birthDay.get(1) + "/" + birthDay.get(2) + "/" + birthDay.get(3) + "\n" + "\n";
    }
}