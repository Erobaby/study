package me.erobaby.study.java;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Optional;

public class TryCatch {
    public static void main(String[] args) {
//        Optional.of()
        try (FileInputStream fis = new FileInputStream("")) {
            fis.available();
            Objects.nonNull(null);
        } catch (Exception e ) {

        } finally {
        }
    }
}
