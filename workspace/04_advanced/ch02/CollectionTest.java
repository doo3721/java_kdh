package ch02;

import java.util.*;

public class CollectionTest {
    void main() {
//        String[] fruits = {"바나나", "사과", "오렌지", "파인애플", "수박"};

        // List
//        ArrayList<String> fruits = new ArrayList<>();
//        LinkedList<String> fruits = new LinkedList<>();
//        Vector<String> fruits = new Vector<>();

        // Set
//        HashSet<String> fruits = new HashSet<>();
//        TreeSet<String> fruits = new TreeSet<>();
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("바나나");
        fruits.add("사과");
        fruits.add("오렌지");
        fruits.add("파인애플");
        fruits.add("수박");
        fruits.add("사과");
        System.out.println(fruits.toString());
        printFruits(fruits);
    }

    // 모든 자료구조의 부모 클래스(인터페이스)는 Collection이다
    void printFruits(Collection<String> fruits) {
        System.out.print("[");
        for (String fruit: fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println("]");
    }

//    void printFruits(List<String> fruits) {
//        System.out.print("[");
//        for (String fruit: fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println("]");
//    }

//    void printFruits(String[] fruits) {
//        System.out.print("[");
//        for (String fruit: fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println("]");
//    }
//
//    void printFruits(ArrayList<String> fruits) {
//        System.out.print("[");
//        for (String fruit: fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println("]");
//    }
//
//    void printFruits(LinkedList<String> fruits) {
//        System.out.print("[");
//        for (String fruit: fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println("]");
//    }
//
//    void printFruits(Vector<String> fruits) {
//        System.out.print("[");
//        for (String fruit: fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println("]");
//    }
//
//    void printFruits(HashSet<String> fruits) {
//        System.out.print("[");
//        for (String fruit: fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println("]");
//    }
//
//    void printFruits(TreeSet<String> fruits) {
//        System.out.print("[");
//        for (String fruit: fruits) {
//            System.out.print(fruit + " ");
//        }
//        System.out.println("]");
//    }
}
