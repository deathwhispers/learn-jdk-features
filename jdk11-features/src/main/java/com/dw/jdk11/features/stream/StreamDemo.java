package com.dw.jdk11.features.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 10:36
 */
public class StreamDemo {

    /**
     * 添加了 takeWhile、dropWhile、iterate 等方法，用于更方便地处理流式数据。
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = numbers.stream()
                .takeWhile(n -> n < 4)
                .collect(Collectors.toList()); // [1, 2, 3]
        System.out.println(result);
    }
}
