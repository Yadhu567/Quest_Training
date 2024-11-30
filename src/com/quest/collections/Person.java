package com.quest.collections;

public class Person implements Comparable<Person>  {
    private String name;
    private int age;
    private String gender;
    private String phoneNUmber;

    public Person(String name,int age,String gender,String phoneNUmber){
        setName(name);
        setAge(age);
        setGender(gender);
        setPhoneNUmber(phoneNUmber);
    }
    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
