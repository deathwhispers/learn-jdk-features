package com.dw.jdk11.features.var;

import java.util.List;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 10:38
 */
public class VarDemo {

    /**
     * 引入 var 关键字，用于局部变量的类型推断。这使代码更加简洁。
     * Java 11 允许在 Lambda 表达式中使用 var，并且可以给 Lambda 参数添加注解。
     */
    public static void main(String[] args) {
        var list = List.of("Java", "Python", "C++", "  ", " test ");
        list.forEach(System.out::println);

        list.forEach(item -> {
            System.out.println(item + " >> isBlank: " + item.isBlank());
            System.out.println(item + " >> strip: " + item.strip());
            System.out.println(item + " >> trim: " + item.trim());
            System.out.println(item + " >> stripLeading: " + item.stripLeading());
            System.out.println(item + " >> stripTrailing: " + item.stripTrailing());
            System.out.println(item + " >> repeat: " + item.repeat(3));
        });


        // Java 11 允许在 Lambda 表达式中使用 var，并且可以给 Lambda 参数添加注解。
        List<String> list2 = List.of("A", "B", "C");
        list2.forEach(( var item) -> System.out.println(item));

    }
}
