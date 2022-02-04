package com.company;

public class Laptpop {

    private String laptopName;
    private String color;
    private int memory;
    private String CPU;

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;

    }


    @Override
    public String toString() {
        return "Laptpop \n" +
                "name: " + laptopName + '\n' +
                "color : " + color + '\n' +
                "memory : " + memory + "\n" +
                "CPU : " + CPU + '\'';
    }

//    public String comp() {
//
//    }
}
