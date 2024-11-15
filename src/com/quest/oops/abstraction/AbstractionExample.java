package com.quest.oops.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Student online=new OnlineStudent();
        Student offline=new OfflineStudent();
        Student regular=new RegularStudent();
        online.attendClass();
        offline.attendClass();
        regular.attendClass();

        Student onlineStudent=StudentFactory.getStudent("online");
        Student offlineStudent=StudentFactory.getStudent("offline");
        Student regularStudent=StudentFactory.getStudent("regular");
        onlineStudent.attendClass();
        offlineStudent.attendClass();
        regularStudent.submitAssignment();
    }
}
