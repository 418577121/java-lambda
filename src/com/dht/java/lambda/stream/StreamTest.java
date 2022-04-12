package com.dht.java.lambda.stream;

import com.dht.java.lambda.bean.Student;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @project_name: java17
 * @package_name: com.dht.java.lambda.stream
 * @description: java 流测试
 * @author: DingHaiTing
 * @create_time: 2022-04-12 08:45
 **/

public class StreamTest {
    public static void main(String[] args) {
      ArrayList<Student> list = new ArrayList();
      for (int i = 0; i < 100; i++) {
        list.add(new Student("测试" + i, i));
      }
      // filter方法
      List<Student> collect = list.stream().filter(student -> student.getAge() > 98).collect(Collectors.toList());
      System.out.println(collect);
    }
}
