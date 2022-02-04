package com.company;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private String group;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
//        if (group == Java){
//            System.out.println("Student of Java"+group);
//        }else if (group == JavaScript){
//            System.out.println("Student of JavaScript");
//        }else{
//            System.out.println("We have two courses");
//        }
        this.group = group;
    }
     public void showInfo(){
         System.out.println(" Our students :");
         System.out.println("name: "+ name);
         System.out.println("lastName: "+ lastName);
         System.out.println("student age: "+age);
         System.out.println("group of course: "+group);
     }
     public void has(){
         System.out.println("He has a computer");
     }



}

