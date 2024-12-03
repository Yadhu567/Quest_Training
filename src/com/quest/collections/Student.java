package com.quest.collections;

public class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private double marks;
    public Student(int studentId,String name,double marks){
        setStudentId(studentId);
        setName(name);
        setMarks(marks);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        return Double.compare(this.marks, o.marks);
    }

    @Override
    public boolean equals(Object obj) {
        Student s=(Student) obj;
        return this.getStudentId()==s.getStudentId();
    }
//we can use containsAll method
    @Override
    public int hashCode() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + getStudentId() +
                ", name='" + getName() + '\'' +
                ", marks=" + getMarks() +
                '}';
    }
}
