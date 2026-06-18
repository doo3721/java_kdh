package ch07;

public class PerformanceTest {
    public static void main(String[] args) {

        ConnectionPoolTest.findById(1);
        long s1 = System.currentTimeMillis();
        for(int i = 0; i < 100; i++) {
            JdbcPostPreparedTest.insert(2, "테스트", "내용");
        }
        long e1 = System.currentTimeMillis();
        System.out.println("커넥션 풀이 없을 때 소요 시간: " + (e1 - s1) + "ms");

        long s2 = System.currentTimeMillis();
        for(int i = 0; i < 100; i++) {
            ConnectionPoolTest.insert(2, "테스트", "내용");
        }
        long e2 = System.currentTimeMillis();
        System.out.println("커넥션 풀이 존재할 때 소요 시간: " + (e2 - s2) + "ms");
    }
}
