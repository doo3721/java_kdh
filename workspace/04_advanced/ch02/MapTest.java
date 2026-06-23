package ch02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    void main() {

//        Map fruits = new HashMap();
//        Map<String, String> fruits = new HashMap();     // 정렬 순서가 보장되지 않는다
//        Map<String, String> fruits = new TreeMap();     // 오름차순으로 정렬한다
        Map<String, String> fruits = new LinkedHashMap();       // 삽입한 순서가 보장된다


        fruits.put("월", "바나나");
        fruits.put("화", "사과");
        fruits.put("수", "오렌지");
        fruits.put("목", "파인애플");
        fruits.put("수", "수박");
        fruits.put("금", "사과");

//        String fridayFruit = (String) fruits.get("금");
        String fridayFruit = fruits.get("금");
        System.out.println("금요일에 먹을 과일: " + fridayFruit);
        printFruits(fruits);
    }

    void printFruits(Map<String, String> fruits) {
        System.out.println("요일별 먹을 과일 출력");

//        for (String key: fruits.keySet()) {
//            System.out.println(key + ": " + fruits.get(key));
//        }

        for (Map.Entry<String, String> entry: fruits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
