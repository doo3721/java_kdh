package ch06.annotation;

import java.lang.reflect.Method;

public class TimeProcessor {
    public void process(Object target) {
        Method[] methods = target.getClass().getDeclaredMethods();  // 메소드 목록의 순서는 보장되지 않는다

        for (Method method: methods) {
            // 어노테이션 객체 정보 확인
            if (method.isAnnotationPresent(MeasureTime.class)) {
                try {
                    method.invoke(target);  // 처음실행시 발생하는 오버헤드 때문에 사전에 실행
                    MeasureTime measureTime = method.getAnnotation(MeasureTime.class);
                    String taskName = measureTime.taskName().isEmpty() ? method.getName() : measureTime.taskName();
                    long start = System.currentTimeMillis();
                    method.invoke(target);
                    long end = System.currentTimeMillis();
                    System.out.println(taskName + " 소요 시간: " + (end - start) + "ms");
                } catch (Exception e) {
                    System.err.println("대상 메소드 호출 예외: " + e.getMessage());
                }
            }
        }
    }
}
