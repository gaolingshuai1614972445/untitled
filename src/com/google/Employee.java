package com.google;

import java.time.LocalDate;

public class Employee {
    private  String name;//实例域，域，属性，字段，成员变量，数据域，数据成员
    private  double salsry;
    private LocalDate hirDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalsry() {
        return salsry;
    }

    public void setSalsry(double salsry) {
        this.salsry = salsry;
    }

    public LocalDate getHirDay() {
        return hirDay;
    }

    public void setHirDay(LocalDate hirDay) {
        this.hirDay = hirDay;
    }
    public void raiseSalary(double bypecent)
    {
        double raise =salsry*bypecent/100;
        salsry +=raise;
    }

    public Employee(String name, double salsry, LocalDate hirDay) {
        this.name = name;
        this.salsry = salsry;
        this.hirDay = hirDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salsry=" + salsry +
                ", hirDay=" + hirDay +
                '}';
    }
}



