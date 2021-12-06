package com.myname.student;

public class Student {
    private String name;
    private int rollno;
    private double CPI;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getCPI() {
        return CPI;
    }

    public void setCPI(double CPI) {
        this.CPI = CPI;
    }

    @Override
    public String toString() {
        System.out.println("" + getName());
        System.out.println("" + getRollno());
        System.out.println("" + getCPI());
        return null;
    }
}
