package ch05.list;


/**
 * Array는 중간에 데이터를 추가하는 것보다
 * 맨 끝에 데이터를 추가하는 것이 훨씬 빠르다
 *
 * LinkedList는 끝에 데이터를 추가하는 것보다
 * 맨 처음에 데이터를 추가하는 것이 훨씬 빠르다 (대략 3000개 부터)
 */
public class PerformanceTest {
    void main() {
//        MyArray arr = new MyArray();
        MyLinkedList arr = new MyLinkedList();
//        MyArray arr2 = new MyArray();
        MyLinkedList arr2 = new MyLinkedList();
        int times = 10000;

        long s1 = System.currentTimeMillis();
        addFirst(arr, times);
        long e1 = System.currentTimeMillis();

        System.out.println("MyArray 저장된 수: " + arr.size());
        System.out.println("MyArray addFirst 소요 시간: " + (e1 - s1) + "ms");

        long s2 = System.currentTimeMillis();
        addLast(arr2, times);
        long e2 = System.currentTimeMillis();

        System.out.println("MyArray2 저장된 수: " + arr2.size());
        System.out.println("MyArray2 addLast 소요 시간: " + (e2 - s2) + "ms");
    }

    void addFirst(MyList list, int times) {
        for (int i = 0; i < times; i++) {
            list.add(0, "데이터-" + i);
        }
    }

    void addLast(MyList list, int times) {
        for (int i = 0; i < times; i++) {
            list.add("데이터-" + i);
        }
    }
}
