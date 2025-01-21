package PracticeOfList;

import java.util.*;


public class ArrayListClass {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(10, "Nayeem", 3.34));
        studentList.add(new Student(34, "Hasib", 2.79));
        studentList.add(new Student(1, "Samim", 3.97));
        studentList.add(new Student(3, "Sadib", 3.85));
        studentList.add(new Student(37, "Sadid", 2.68));
        studentList.add(new Student(14, "rakib", 2.98));
        studentList.add(new Student(7, "Fantasir", 3.43));

        //Sorting using comparator
        //Used lambda expression
        studentList.sort(Comparator.comparingInt(s -> s.getRollNo()));
        studentList.sort((s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()));
        studentList.sort(Comparator.comparing(Student::getName));

        //Used lambda expression with method reference, which is recommended
        studentList.sort(Comparator.comparing(Student::getRollNo));
        studentList.sort(Comparator.comparing(Student:: getCgpa));
        studentList.sort(Comparator.comparing(Student::getName));

        //Sort with multiple condition
        studentList.sort(
                Comparator.comparing(Student::getName).
                        thenComparing(Student::getCgpa)
        );

        //Sorting using comparable
        //If comparable class is implemented then passing null wouldn't throw any exception
        studentList.sort(null);

        //This is another way
        Collections.sort(studentList);

        System.out.println("Roll No. :\t Name: \t\t\t CGPA: ");
        System.out.println("__________\t ______\t\t\t ______");

        studentList.forEach(student -> System.out.println(student.getRollNo() + " \t\t\t" + student.getName() + " \t\t\t " + student.getCgpa()));


    }
}
