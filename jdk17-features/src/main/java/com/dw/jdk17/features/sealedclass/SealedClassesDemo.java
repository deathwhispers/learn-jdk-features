package com.dw.jdk17.features.sealedclass;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 11:18
 */
public class SealedClassesDemo {
    /**
     * 封闭类允许你控制哪些其他类或接口可以扩展或实现它们。
     * 通过封闭类，你可以更精确地控制继承结构，限制可以子类化的类。
     */
    public static void main(String[] args) {

    }
}

sealed class Shape permits Circle, Rectangle {
}

final class Circle extends Shape {
}

final class Rectangle extends Shape {
}
