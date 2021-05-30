package com.kodilla.bytecode.reflection.student;

import java.lang.reflect.Field;

public class StudentReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();

        Field indexNumber = Student.class.getDeclaredField("indexNumber");
        indexNumber.setAccessible(true);

        String value = (String) indexNumber.get(student);
        System.out.println("Value of Student's private field indexNumber: " + value);
    }
}
