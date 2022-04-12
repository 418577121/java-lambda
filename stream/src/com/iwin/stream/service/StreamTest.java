package com.iwin.stream.service;

import com.iwin.stream.bean.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @project_name: java17
 * @package_name: com.iwin.stream.service
 * @description:
 * @author: DingHaiTing
 * @create_time: 2022-04-12 14:41
 **/

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(new Student("name" + i, i));
        }

        // 过滤出年龄大于90的
        List<Student> collect = list.stream().filter(s -> s.getAge() > 90).collect(Collectors.toList());
        System.out.println(collect);

        // 把年龄为1的名字修改为 "你好"
        List<Student> one = list.stream().filter(student -> student.getAge() == 1).map(student -> {
            student.setName("你好");
            return student;
        }).collect(Collectors.toList());

        System.out.println(one);
    }
}
