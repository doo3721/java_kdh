package ch02.list;

public class MyLinkedList implements MyList{

    private class Node {
        /**
         * 저장할 객체
         */
        private Object data;

        /**
         * 연결된 다음 노드를 참조하는 변수
         */
        private Node nextNode;

        Node(Object data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    private Node header;

    /**
     * 전체 요소의 수
     */
    private int size;

    public MyLinkedList() {
        header = new Node(null);
        size = 0;
    }

    /**
     * data를 첫번째 요소로 추가한다
     * @param data 추가할 요소
     */
    public void appendFirst(Object data) {
        Node node = new Node(data);
        node.nextNode = header.nextNode;
        this.header.nextNode = node;
        size++;
    }

    /**
     * data를 index 위치에 삽입한다.
     * @param index data가 삽입될 위치
     * @param data 삽입할 데이터
     */
    public void add(int index, Object data) {
        if (index == 0) {
            appendFirst(data);
            return ;
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node newNode = new Node(data);
        Node pNode = getNodeWithOutCheckIndex(index - 1);
        newNode.nextNode = pNode.nextNode;
        pNode.nextNode = newNode;
        size++;
    }

    /**
     * data를 index 마지막 위치에 삽입한다.
     * @param data 삽입할 데이터
     */
    public void add(Object data) {
        add(size, data);
    }

    /**
     * 리스트의 첫번째 요소를 삭제하여 반환한다.
     */
    private void removeFirst() {
        Node firstNode = header.nextNode;
        header.nextNode = firstNode.nextNode;
        size--;
    }

    /**
     * 지정한 index 요소를 삭제한다.
     * @param index 삭제한 요소의 index
     */
    public void remove(int index) {
        checkIndex(index);

        if (index == 0) {
            removeFirst();
            return ;
        }

        Node pNode = getNodeWithOutCheckIndex(index - 1); // 삭제할 노드의 이전 노드
        Node rNode = pNode.nextNode; // 삭제할 노드
        pNode.nextNode = rNode.nextNode;
        size--;
    }

    /**
     * index에 위치한 Node를 반환한다
     * @param index 찾을 index
     * @return 찾아낸 Node
     */
    public Node getNode(int index) {
        checkIndex(index);
        return getNodeWithOutCheckIndex(index);
    }

    /**
     * index를 체크하지 않고 index에 위치한 Node를 반환한다
     * @param index 찾을 index
     * @return 찾아낸 Node
     */
    private Node getNodeWithOutCheckIndex(int index) {
        Node n = header.nextNode;
        for (int i = 0; i < index; i++) {
            n = n.nextNode;
        }

        return n;
    }

    /**
     * index에 위치한 Node의 data를 반환한다
     * @param index 찾을 index
     * @return 찾아낸 Node의 data
     */
    public Object get(int index) {
        return getNode(index).data;
    }

    /**
     * index의 값이 유효한지 확인 후 아니면 Exception을 throw 한다
     * @param index 체크할 index 값
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * 전체 요소의 수를 반환
     * @return 전체 요소의 수
     */
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Node n = header.nextNode;

        for (int i = 0; i < size - 1; i++) {
            str.append(n.data).append(", ");
            n = n.nextNode;
        }

        if (size > 0) {
            str.append(n.data);
        }

        str.append("]");

        return str.toString();
    }
}
