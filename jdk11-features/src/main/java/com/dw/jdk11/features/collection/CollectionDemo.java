package com.dw.jdk11.features.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 10:38
 */
public class CollectionDemo {

    /**
     * 引入了新的集合工厂方法 List.of、Set.of 和 Map.of，用于快速创建不可变的集合。
     * 在集合类中引入了新的方法 copyOf，用于创建集合的不可变副本。
     */
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        System.out.println(list);
//        list.add("3");// throw UnsupportedOperationException （ImmutableCollections.uoe）
        Set<Integer> set = Set.of(1, 2, 3);
        Map<String, Integer> map = Map.of("a", 1, "b", 2);

        // 在集合类中引入了新的方法 copyOf，用于创建集合的不可变副本。
        List<String> original = new java.util.ArrayList<>(list);
        System.out.println(original);
        original.add("d");
        List<String> copy = List.copyOf(original);
        System.out.println(copy);
    }
}
