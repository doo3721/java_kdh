package ch02.list;

public interface MyList<T> {

    /**
     * obj를 마지막 요소로 추가한다.
     * @param obj 추가할 요소
     */
    void add(T obj);

    /**
     * obj를 index 위치에 삽입한다.
     * @param index 삽입할 위치
     * @param obj 삭제할 위치
     */
    void add(int index, T obj);

    /**
     * 지정한 index의 데이터를 삭제한다
     * @param index 지정할 index
     */
    void remove(int index);

    /**
     * 지정한 index의 데이터를 조회한다.
     * @param index 지정할 index
     * @return 조회할 데이터
     */
    T get(int index);


    /**
     * 데이터의 수를 반환한다
     * @return 현재 데이터의 갯수
     */
    int size();
}
