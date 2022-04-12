package com.dht.java.lambda;

import java.util.function.Function;

/**
 * @project_name: java17
 * @package_name: com.dht.java.lambda
 * @description: 方法引用
 * @author: DingHaiTing
 * @create_time: 2022-04-11 18:11
 **/

public class MethodReference {
    public static void main(String[] args) {
        MethodReferenceTest methodRef = a -> a - 2;
        System.out.println(methodRef.test(5));

        MethodReferenceTest methodRef2 = a -> a - 2;
        System.out.println(methodRef2.test(5));

        MethodReferenceTest manager = MethodReference::manager;
        System.out.println(manager.test(5));
    }

    public static int manager(int a) {
        return a - 2;
    }

    interface MethodReferenceTest {
        int test(int a);
    }
}
