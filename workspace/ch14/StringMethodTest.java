package ch14;

public class StringMethodTest {
    public static void main(String[] args) {
        String str = "Hello Java";

        // 1. length(): 문자열의 길이 조회
        System.out.println(str.length()); // 10

        // 2. charAt(): 특정 인덱스의 문자 조회
        System.out.println(str.charAt(6)); // J

        // 3. substring(): 부분 문자열 추출
        // 6번 인덱스부터 10번 인덱스 직전까지
        System.out.println(str.substring(6, 10)); // Java
        // 4번 인덱스부터 끝까지
        System.out.println(str.substring(4)); // o Java

        // 4. equals(): 문자열 내용 비교
        System.out.println(str.equals("Hello Java")); // true

        // 5. indexOf(): 특정 문자열이 시작되는 인덱스 반환
        System.out.println(str.indexOf("Java")); // 6
        System.out.println(str.indexOf("자바")); // -1

        // 6. replace(): 문자열 일부 치환
        System.out.println(str.replace("Java", "World")); // Hello World

        // 원본 문자열은 불변
        System.out.println(str); // Hello Java

        // 7. split(): 구분자를 기준으로 문자열 분할
        String str2 = "Hello Java Programming";
        String[] words = str2.split(" ");
        System.out.println(words[0]); // Hello
        System.out.println(words[1]); // Java
        System.out.println(words[2]); // Programming

        // 8. toLowerCase(): 소문자 출력
        System.out.println(str.toLowerCase());

        // 9. toUppperCase(): 대문자 출력
        System.out.println(str.toUpperCase());

        // 대소문자 구분 없는 검색
        System.out.println(str.toLowerCase().indexOf("JaVa".toLowerCase()));    // 리터럴 문자열도 메소드 호출이 가능하다

        // 10. trim(): 앞뒤 공백 제거
        String str3 = "          Hello New World     ";
        System.out.println("[" + str3.trim() + "]");

        // 11, startsWith(String target): 해당 문자열로 시작하는지 확인
        System.out.println(str.startsWith("Hello"));
//        System.out.println(str.indexOf("Hello") == 0 ? true : false);

        // 앞 뒤 공백 있는 문자열의 시작 문자열 확인
        System.out.println(str3.trim().startsWith("Hello"));

        // "Hello Hello ..." 1000개로 이루어진 문자열 생성
        String str4 = "";
        for(int i = 0; i < 100; i++) {
            str4 += "Hello ";
        }
        System.out.println(str4);
    }
}