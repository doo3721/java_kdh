package ch02.list;

public class MyListTest {
    void main() {
        // 요소를 담을 수 있는 MyList 객체를 생성
        MyList<String> list = new MyArray();
//        MyList list = new MyLinkedList();

        // MyList에 index 0~4까지 "데이터-index" 형식으로 문자열을 담는다
        for (int i = 0; i < 5; i++) {
            list.add("데이터-" + i);
        }

        // MyList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // MyList의 index 0 요소를 출력한다.
        System.out.println("인덱스 0의 값: " + list.get(0));

        // MyList의 index 3 요소를 출력한다.
        System.out.println("인덱스 3의 값: " + list.get(3));

        // index 2를 삭제한다
        list.remove(2);

        // MyList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // index 3에 "데이터-5"를 삽입한다
        list.add(3, "데이터-5");

        // MyList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // 마지막 위치에 "데이터-6"를 추가한다
        list.add("데이터-6");

        // MyList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // MyList에 담긴 요소의 갯수를 출력한다.
        System.out.println("갯수: " + list.size());
    }
}
