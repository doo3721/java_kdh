package level02.day21;

public class Prob01 {
    public int solution(String my_string) {
        String[] list = my_string.replaceAll("^[a-zA-Z]+|[a-zA-Z]+$", "").split("[a-zA-Z]+");

        int sum = 0;
        if (list != null && !list[0].isEmpty()) {
            for (String str: list) {
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }
}
