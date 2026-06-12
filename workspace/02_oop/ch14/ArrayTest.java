package ch14;

import java.util.Arrays;

class ResizableArray {
    private String[] elements;
    private int index;

    public ResizableArray(int initialCapacity) {
        elements = new String[initialCapacity];
        index = 0;
    }

    public void add(String elem) {
        if (index == elements.length) {
            String[] tempList = new String[(elements.length * 2)];
            for(int i = 0; i < elements.length; i++) {
                tempList[i] = elements[i];
            }
            elements = tempList;
        }
        elements[index] = elem;
        index++;
    }

    public String get(int index) {
        return this.elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}

public class ArrayTest {
    void main() {
        ResizableArray list = new ResizableArray(2);

        list.add("Apple");
        list.add("Banana");

        System.out.println(list);

        list.add("Orange");

        System.out.println(list);

        System.out.println("인덱스 1의 요소: " + list.get(1));
    }
}
