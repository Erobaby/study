package me.erbaby.study.spi;

public class MainTest {
    public void hello() throws Exception {
        System.out.println("=============");
        StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if ("main".equals(stackTraceElement.getMethodName())) {
                System.out.println(Class.forName(stackTraceElement.getClassName()));
            }
        }
        System.out.println("=============");
    }
}
