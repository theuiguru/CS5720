package assignment1;
import java.util.*;
/**
 * CS5720 Assignment 1
 * StudentComparator.java
 * Purpose: Student Record Management System
 * 
 * @author Chris Thomas
 */
public class StudentComparator implements Comparator< Student >
{
    public int compare(Student s1, Student s2)
    {
        return s1.getBirthday().compareTo(s2.getBirthday());
    }
}
