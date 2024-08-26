package com.dw.jdk11.features.string;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 10:34
 */
public class StringDemo {

    /**
     * <pre>
     * isBlank()：判断字符串是否为空白（空格、制表符等）。
     * lines()：将字符串按行分割为流（Stream<String>）。
     * strip()：去除字符串前后的空白（与 trim() 类似，但更全面）。
     * stripLeading()：去除字符串开头的空白。
     * stripTrailing()：去除字符串结尾的空白。
     * repeat(int count)：将字符串重复指定次数。
     * </pre>
     */
    public static void main(String[] args) {
        String str = "   Hello, World!  ";
        System.out.println(str.isBlank());          // false
        System.out.println(str.strip());            // "Hello, World!"
        System.out.println(str.stripLeading());     // "Hello, World!  "
        System.out.println(str.stripTrailing());    // "   Hello, World!"
        System.out.println(str.repeat(3));          // "   Hello, World!     Hello, World!     Hello, World!  "
        System.out.println(str.strip().repeat(3));  // "Hello, World!Hello, World!Hello, World!"
    }
}
