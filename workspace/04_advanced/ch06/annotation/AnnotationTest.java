package ch06.annotation;

public class AnnotationTest {
    void main() {
        Work w = new Work();

        TimeProcessor processor = new TimeProcessor();
        processor.process(w);
    }
}
