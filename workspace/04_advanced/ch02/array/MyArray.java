package ch02.array;

import java.util.Arrays;

/**
 * 배열의 불편한 점은 다음과 같다
 * 생성시 길이를 지정해야 함
 * 생성된 배열의 길이는 수정 못함
 * 요소 추가, 삭제, 삽입이 어려움
 *
 * 이러한 불편한 점을 개선하여 배열을 쓰기 쉽게 만드는 클래스
 */

public class MyArray {

    /**
     * 내부적으로 요소를 저장하는 배열 선언
     */
    private Object[] data;

    /**
     * 배열의 실제 담겨있는 요소의 개수
     */
    private int count;


    /**
     * 기본 생성자:
     * 초기 배열의 크기를 10개로 지정한다
     */
    public MyArray() {
        this(10);
    }

    /**
     * 초기 배열의 크기를 지정한 size로 지정한다
     * @param size 배열의 초기 크기
     */
    public MyArray(int size) {
        data = new Object[size];
        count = 0;
    }


    /**
     * 배열의 마지막 위치에 지정한 elem를 추가한다
     * @param elem 배열에 추가할 요소
     */
    public void append(Object elem) {
        append(count, elem);
    }

    /**
     * 지정한 index에 elem를 삽입한다
     * @param index 삽입할 위치
     * @param elem 삽입할 요소
     */
    public void append(int index, Object elem) {
        if (index > count) {
            throw new ArrayIndexOutOfBoundsException("index(" + index + ") >= count(" + count + ")");
        }
        else if (index < 0){
            throw new ArrayIndexOutOfBoundsException("index(" + index + ") < 0");
        }
        if (count >= data.length) {
            Object[] temp = new Object[data.length + data.length / 2];
            for (int i = 0; i < index; i++) {
                temp[i] = data[i];
            }
            for (int i = index; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        else {
            System.arraycopy(data, index, data, index + 1, count - index);
        }
        data[index] = elem;
        count++;
    }

    /**
     * 지정한 index의 요소를 삭제한다
     * @param index 삭제할 위치
     */
    public void delete(int index) {
        this.checkIndex(index);
        System.arraycopy(data, index + 1, data, index, count - index - 1);
        data[--count] = null;
    }


    /**
     * 지정한 위치의 데이터를 반환한다
     * @param index 반환할 데이터의 위치
     * @return 반환할 데이터
     */
    public Object getElem(int index) {
        this.checkIndex(index);
        return data[index];
    }

    /**
     * index의 값이 유효한지 확인 후 아니면 Exception을 throw 한다
     * @param index 체크할 index 값
     */
    private void checkIndex(int index) {
        if (index >= count) {
            throw new ArrayIndexOutOfBoundsException("index(" + index + ") >= count(" + count + ")");
        }
        else if (index < 0){
            throw new ArrayIndexOutOfBoundsException("index(" + index + ") < 0");
        }
    }

    /**
     * 배열의 현재 길이를 출력한다
     * @return 배열의 현재 길이
     */
    public int size() {
        return this.count;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");

        for (int i = 0; i < count - 1; i++) {
            str.append(data[i]).append(", ");
        }

        if (count > 0) {
            str.append(data[count - 1]);
        }

        str.append("]");

        return str.toString();
    }
}
