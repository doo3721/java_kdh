package ch09;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArraysException {
    public static void main(String[] args) {
        String[] strArr = {"KIM","LEE","PARK"};


        // 범위외의 요소를 가리킴 (ArrayIndexOutOfBoundsException)
//        System.out.println(strArr[3]);

        // 참조하는 주소가 없다
        int[] ageArr = null;

        // NullPointerException 발생
        System.out.println(ageArr[0]);
    }
}
