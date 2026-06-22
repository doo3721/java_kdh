package ch02.array;

public class MyArrayTest {

    void main() {
        // 10개의 요소를 담을 수 있는 MyArray 객체를 생성
        MyArray arr = new MyArray(10);

        // MyArray에 index 0~4까지 "데이터-index" 형식으로 문자열을 담는다
        for (int i = 0; i < 5; i++) {
            arr.append("데이터-" + i);
        }

        // MyArray에 담긴 모든 요소를 출력한다
        System.out.println(arr);

        // MyArray의 index 0 요소를 출력한다.
        System.out.println("인덱스 0의 값: " + arr.getElem(0));

        // MyArray의 index 3 요소를 출력한다.
        System.out.println("인덱스 3의 값: " + arr.getElem(3));

        // index 2를 삭제한다
        arr.delete(2);

        // MyArray에 담긴 모든 요소를 출력한다
        System.out.println(arr);

        // index 3에 "데이터-5"를 삽입한다
        arr.append(3, "데이터-5");

        // MyArray에 담긴 모든 요소를 출력한다
        System.out.println(arr);

        // 마지막 위치에 "데이터-6"를 추가한다
        arr.append("데이터-6");

        // MyArray에 담긴 모든 요소를 출력한다
        System.out.println(arr);

        // MyArray에 담긴 요소의 갯수를 출력한다.
        System.out.println("갯수: " + arr.size());
    }
}
