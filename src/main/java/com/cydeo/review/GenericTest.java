package com.cydeo.review;

import java.util.*;

public class GenericTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1,2,3,82,34,56,24);

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

//        printInfo(studentList);
//        printInfo(teacherList);

//        printInfo2(studentList);
//        printInfo2(teacherList);

//        System.out.println(getLastItem(studentList));
//        System.out.println(getLastItem(teacherList));

//        System.out.println(teacherList);
        System.out.println(studentList);
        Collections.sort(studentList, Comparator.comparing(o -> o.getName()));
        studentList.sort(Comparator.comparing(Student::getName).thenComparing(Student::getId));
        System.out.println(studentList);

//        System.out.println(intList);
//        Collections.sort(intList);
//        System.out.println(intList);

    }

    // Write a method that takes a list of students, prints each student and the total student count.
    public static void printInfo(List<Student> students) {

        for (Student student : students) {

            System.out.println(student);

        }

        System.out.println(students.size());

    }

    // Write a method that takes a list, prints each item in it and its total item count.
    public static <T> void printInfo2(List<T> list) {

        for (T item : list) {

            System.out.println(item);

        }

        System.out.println(list.size());

    }

    // Write a method that takes a list and returns the last item of the list.
    public static <I> I getLastItem(List<I> list) {
        return list.get(list.size() - 1);
    }
}
