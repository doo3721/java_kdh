package ch02.array;

public class MyLinkedListTest {
    void main() {
        // 10개의 요소를 담을 수 있는 MyLinkedList 객체를 생성
        MyLinkedList list = new MyLinkedList();

        // MyLinkedList에 index 0~4까지 "데이터-index" 형식으로 문자열을 담는다
        for (int i = 0; i < 5; i++) {
            list.appendLast("데이터-" + i);
        }

        // MyLinkedList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // MyLinkedList의 index 0 요소를 출력한다.
        System.out.println("인덱스 0의 값: " + list.get(0));

        // MyLinkedList의 index 3 요소를 출력한다.
        System.out.println("인덱스 3의 값: " + list.get(3));

        // index 2를 삭제한다
        list.remove(2);

        // MyLinkedList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // index 3에 "데이터-5"를 삽입한다
        list.appendTo(3, "데이터-5");

        // MyLinkedList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // 마지막 위치에 "데이터-6"를 추가한다
        list.appendLast("데이터-6");

        // MyLinkedList에 담긴 모든 요소를 출력한다
        System.out.println(list);

        // MyLinkedList에 담긴 요소의 갯수를 출력한다.
        System.out.println("갯수: " + list.size());
    }
}
