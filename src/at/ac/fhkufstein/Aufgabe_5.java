package at.ac.fhkufstein;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe_5
{
    public static void main(String[] args)
    {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("axel", "123", 2018));
        studentList.add(new Student("maggi", "456", 2018));
        studentList.add(new Student("lari", "789", 2018));

        for(Student s: studentList)
        {
            System.out.println(s);
        }
    }
}

