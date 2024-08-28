package com.dw.jdk17.features.enhanceswitch;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 11:21
 */
public class Demo {

    public static void main(String[] args) {
        Object obj = "";
        switch (obj) {
            case Integer i -> System.out.println("Integer " + i);
            case String s -> System.out.println("String " + s);
            default -> System.out.println("Other type");
        }

    }
}
