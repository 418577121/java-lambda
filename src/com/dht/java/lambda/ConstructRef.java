package com.dht.java.lambda;

import com.dht.java.lambda.bean.Student;

/**
 * @project_name: java17
 * @package_name: com.dht.java.lambda
 * @description: 构造引用
 * @author: DingHaiTing
 * @create_time: 2022-04-11 20:56
 **/

public class ConstructRef {

    public static void main(String[] args) {
        StudentService studentService = Student::new;
        System.out.println(studentService.getStudent());
    }

    interface StudentService {
        Student getStudent();
    }
}
