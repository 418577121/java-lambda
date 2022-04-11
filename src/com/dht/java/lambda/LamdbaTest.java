package com.dht.java.lambda;

/**
 * @project_name: java17
 * @package_name: com.dht.java.lambda
 * @description: lambda表达式入门
 * @author: DingHaiTing
 * @create_time: 2022-04-11 17:19
 **/

public class LamdbaTest {

    public static void main(String[] args) {
        // 匿名内部类
        Call call = new Call() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(call.add(1, 2));

        // lambda表达式1 不省略写法
        Call lambda1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(lambda1.add(1, 2));

        // lambda表达式2 省略参数类型
        Call lambda2 = (a, b) -> {
            return a + b;
        };
        System.out.println(lambda2.add(1, 2));

        // ======最简写法=======
        // lambda3 省略方法体
        Call lambda3 = (a, b) -> a + b;
        System.out.println(lambda3.add(1, 2));
    }

    // 定义接口
    interface Call {
        int add(int a, int b);
    }
}