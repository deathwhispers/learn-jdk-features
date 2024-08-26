package com.dw.jdk11.features.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * @author yanggj
 * @version 1.0.0
 * @date 2024/8/26 10:36
 */
public class FileDemo {

    /**
     * <pre>
     * Files.readString(Path)：直接读取文件内容为字符串。
     * Files.writeString(Path, CharSequence)：将字符串写入文件。
     * </pre>
     */
    public static void main(String[] args) throws IOException {
        Path tempFile = Files.createTempFile("test", ".txt");
        Path path = Files.writeString(tempFile, "Hello, World! \n Hello, World!");
        String content = Files.readString(path);
        System.out.println(content);

        List<String> strings = Files.readAllLines(path);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("line" + i + ": " + strings.get(i));
        }
    }
}
