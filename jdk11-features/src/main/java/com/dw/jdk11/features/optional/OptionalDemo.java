package com.dw.jdk11.features.optional;

import java.util.Optional;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 10:37
 */
public class OptionalDemo {

    /**
     * 新增 ifPresentOrElse 和 stream 方法，使 Optional 更加实用
     * Optional 类新增了 orElseThrow() 方法，这是一个不带参数的 orElseThrow 版本，更加简洁。
     */
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty")); // Prints "Hello"

        Optional<String> optional2 = Optional.ofNullable(null);
        String value = optional2.orElseThrow(); // Throws NoSuchElementException if empty
        System.out.println(value);
    }
}
