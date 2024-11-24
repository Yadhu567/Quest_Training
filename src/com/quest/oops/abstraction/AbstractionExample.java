package com.quest.oops.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Student online=new OnlineStudent(); // upcasting
        Student offline=new OfflineStudent(); // upcasting
        Student regular=new RegularStudent();  // upcasting
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
