package ch08;

public class ForTest6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            StringBuilder str = new StringBuilder();
            for (int k = 2; k <= 9; k++) {
                str.append(k).append(" x ").append(i)
                        .append(" = ").append(k * i).append("\t");   // 이스케이프 문자 \t: 위 아래 맞게 자동 정렬
            }
            System.out.println(str);
        }
    }
}
