package me.erobaby.study.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudyStream {
    public static void main(String[] args) {
        List<String> source = Arrays.asList("hello", "world");
        List<String[]> result1
                = source.stream().map(e -> e.split("")).collect(Collectors.toList());
        List<String> result2
                = source.stream().flatMap(e -> Stream.of(e.split(""))).collect(Collectors.toList());
        List<String> result3
                = source.stream().map(e -> e.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(source);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
