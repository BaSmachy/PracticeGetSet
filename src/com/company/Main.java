package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PeakSoft peakSoft = new PeakSoft();
        peakSoft.setName("PeakSoft");
        String [] courses = {"Java", "JavaScript"};
        peakSoft.setCourses(courses);
        PeakSoft peakSoft1 = new PeakSoft();
        String [] room = {"1:Google", "2:SpaceX","3:FaceBook","4:Apple","5:PlayZone"};
        peakSoft.setRooms(room);
        peakSoft.showInfo();



        Student s1 = new Student();
        s1.setName("Beksultan");
        s1.setAge(18);
        s1.setLastName("Barpiev");
        s1.setGroup("Java");
        s1.showInfo();
       // System.out.println("********************");
        s1.has();

        Laptpop mac = new Laptpop();
        mac.setLaptopName("MacBook Pro");
        mac.setColor("White");
        mac.setMemory(512);
        mac.setCPU("Apple M1");
        System.out.println(mac.toString());
        System.out.println("**********");


        Student s2 = new Student();
        s2.setName("Marlen");
        s2.setAge(20);
        s2.setLastName("Atambaev");
        s2.setGroup("JavaScript");
        s2.showInfo();
        s2.has();

        Laptpop mac1 = new Laptpop();
        mac1.setLaptopName("MacBook Air");
        mac1.setColor("Black");
        mac1.setMemory(256);
        mac1.setCPU("intel i5");
        System.out.println(mac1.toString());
        System.out.println("**********");



        Student s3 = new Student();
        s3.setName("Zhypara");
        s3.setAge(25);
        s3.setLastName("Amanova");
        s3.setGroup("JavaScript");
        s3.showInfo();
        s3.has();

        Laptpop mac2 = new Laptpop();
        mac2.setLaptopName("Acer");
        mac2.setColor("Silver");
        mac2.setMemory(512);
        mac2.setCPU("Intel i7");
        System.out.println(mac2.toString());
        System.out.println("**********");
    }
}
