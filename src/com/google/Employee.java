package com.google;

import java.time.LocalDate;

public class Employee {
        private  String name;//实例域，域，属性，字段，成员变量，数据域，数据成员
        private  double salsry;
        private LocalDate hirDay;

    public Employee() {//无参构造器
    }

    public Employee(String name, double salsry, LocalDate hirDay) {//生成构造器，用alt+insert，选第一个，有参数构造器
            this.name = name;
            this.salsry = salsry;
            this.hirDay = hirDay;
        }

        public String getName() {//生成get sst方法，用alt+insert
            return name;
        }
//
//        public void setName(String name) {
//            this.name = name;
//        }

        public double getSalsry() {
            return salsry;
        }
//
//        public void setSalsry(double salsry) {
//            this.salsry = salsry;
//        }

        public LocalDate getHirDay() {
            return hirDay;
        }
//
//        public void setHirDay(LocalDate hirDay) {
//            this.hirDay = hirDay;
//        }

//        @Override
//        public String toString() {//生成 toString方法
//            return "Employee{" +
//                    "name='" + name + '\'' +
//                    ", salsry=" + salsry +
//                    ", hirDay=" + hirDay +
//                    '}';
//        }
    }

