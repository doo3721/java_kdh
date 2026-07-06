package ch05.list;

public class MyArrayTest {

    void main() {
        MyList<String> arr = new MyArray<>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    arr.add(("데이터 - " + (i + 1)));      // add 진행 중 race condition 발생
                }
                System.out.println(Thread.currentThread().getName() + ": " + arr.size());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    if (arr.size() > 0) {
                        arr.remove(0);
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + arr.size());
            }
        }).start();
    }
}
