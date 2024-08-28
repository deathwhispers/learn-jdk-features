package com.dw.jdk17.features.instance;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 11:20
 */
public class Demo {

    /**
     * Java 17 对 instanceof 操作符进行了增强，支持模式匹配。你可以直接在 instanceof 检查之后，直接将结果转换为所需的类型，而无需显式的类型转换。
     */
    public static void main(String[] args) {
        Object obj = "12345test";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }

    }
}
