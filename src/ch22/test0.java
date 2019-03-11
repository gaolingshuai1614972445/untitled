package ch22;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Filter;
import java.util.stream.Stream;

public class test0 {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Path.of("abc")));
        //4k以内最为合适，4K=4*1024bytes
        System.out.println(content);
        try(Stream<String> lines = Files.lines(Path.of("abc"), Charset.defaultCharset())) {
            lines.forEach(System.out::println);
        }//适合大型文件，不需要使用流。
    }
}
