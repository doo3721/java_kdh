package ch06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  // 메소드를 대상으로 지정
@Retention(RetentionPolicy.RUNTIME)  // 실행 시점까지 사용 가능하도록 유지 정책을 RUNTIME으로 지정
// 지정된 메소드의 실행 시간을 출력하는 어노테이션
public @interface MeasureTime {
    // 어노테이션의 taskName 속성 정보
    // default가 있으면 선택사항이 됨
    String taskName() default "";
}
