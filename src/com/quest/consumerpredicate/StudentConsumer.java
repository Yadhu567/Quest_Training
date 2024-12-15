package com.quest.consumerpredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentConsumer {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(23,"ron"));
        studentList.add(new Student(44,"john"));
        studentList.add(new Student(17,"wilson"));
        studentList.add(new Student(28,"lane"));

        System.out.println("--consumer--");

        Consumer<Student> studentConsumer1= (std)->{
            System.out.println("Name: "+std.getName().toUpperCase());
        };

        Consumer<Student> studentConsumer2=(std2)->{
            System.out.println("Length: "+ std2.getName().length());
        };

//        studentList.forEach(studentConsumer1.andThen(studentConsumer2));

        for(Student s:studentList){
            studentConsumer1.accept(s);
            studentConsumer2.accept(s);
        }

        System.out.println("--predicate--");

        Predicate<Student> studentPredicate1=(std3)->{
            if (std3.getId()<20){
                System.out.println(std3.getId()+" "+std3.getName());
            }
            return false;
        };

        Predicate<Student> studentPredicate2=(std3)->{
            if (std3.getName().contains("s")){
                System.out.println(std3.getId()+" "+std3.getName());
            }
            return false;
        };
        for(Student s:studentList){
            studentPredicate1.test(s);
            studentPredicate2.test(s);
        }

        System.out.println("--supplier--");

        Supplier<Student> supplier1=()->new Student(45,"fedric");

        Student std5=supplier1.get();
        System.out.println(std5.getId()+" "+std5.getName());

        Function<Integer,String> newfun=(s)-> {
            String k = "hello";
            k=k+s;
            return k;
        };

        System.out.println(newfun.apply(2));
    }
}
