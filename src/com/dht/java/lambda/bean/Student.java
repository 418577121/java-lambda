package com.dht.java.lambda.bean;

/**
 * @project_name: java17
 * @package_name: com.dht.java.lambda.bean
 * @description:
 * @author: DingHaiTing
 * @create_time: 2022-04-11 20:57
 **/

public class Student {
    private String name;
    private Integer age;


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
