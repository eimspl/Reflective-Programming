package com.kodilla.bytecode.reflection.book;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {

        Class<Book> descriptor = Book.class;

        for (Method method : descriptor.getMethods()) {
            System.out.println("method: " + method.getName());
        }

        int modifiers = descriptor.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isAbstract = Modifier.isAbstract(modifiers);

        System.out.println("Class Book is public: " + isPublic);
        System.out.println("Class Book is abstract: " + isAbstract);

        Constructor<Book> constructor
                = descriptor.getConstructor(new Class[]{String.class, String.class, int.class});

        Book book = constructor.newInstance("Title", "Signature", 2000);
        System.out.println("Title of new Instance of Book: " + book.getTitle());
    }

}