package ch06.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  // 메소드를 대상으로 지정
@Retention(RetentionPolicy.RUNTIME)  // 실행 시점까지 사용 가능하도록 유지 정책을 RUNTIME으로 지정
public @interface MeasureTime {


}
