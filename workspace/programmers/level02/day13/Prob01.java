package level02.day13;

public class Prob01 {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        int preNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                sum -= preNum;
            }
            else {
                preNum = Integer.parseInt(arr[i]);
                sum += preNum;
            }
        }
        return sum;
    }

    void main() {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }
}
