package ru.AndJava2020.Ex13;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student [] students1=new Student[]{
                new Student(5),
                new Student(4.5),
                new Student(3),
                new Student(4.5),
                new Student(5)
        };
        Student [] students2=new Student[]{
                new Student(5),
                new Student(4.5),
                new Student(3),
                new Student(4.5),
                new Student(5)
        };


        for (Student t: students1
        ) {
            System.out.println(t.getiDNumber() +" "+t.getGPA());
        }
        System.out.println();

        Student[] answer2=SortingStudentsByGPA.mergeStudents(students1,students2);
        for (Student t: answer2
        ) {
            System.out.println(t.getiDNumber() +" "+t.getGPA());
        }
    }
}
