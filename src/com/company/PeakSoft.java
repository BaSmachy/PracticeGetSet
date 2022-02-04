package com.company;

public class PeakSoft {
    private String name;
    private String[] courses;
    private String[] rooms;
    public void showInfo() {
        System.out.println(name);
       System.out.println("PeakSoft has two types of courses -");
        for (String cours : courses) {
            System.out.print("["  + cours +  "]"+" ");
        }
        System.out.println("\nPeak Soft has many rooms -");
        for (String rooms : rooms) {
//            for (int i = 0; i < rooms.length(); i++) {
//                for (int j = 1; j <=i  ; j++) {
//                    System.out.println(j);
            System.out.println(rooms +"- room");




        }
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getRooms() {
        return rooms;
    }

    public void setRooms(String[] rooms) {

        this.rooms = rooms;
    }

}


