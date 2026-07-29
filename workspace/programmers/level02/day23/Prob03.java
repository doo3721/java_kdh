package level02.day23;

public class Prob03 {
    public int solution(String[] babbling) {
        String[] list = new String[]{"aya", "ye", "woo", "ma"};
        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int k = 0; k < list.length; k++) {
                babbling[i] = babbling[i].replace(list[k], " ");
            }
            count += babbling[i].isBlank() ? 1 : 0;
        }
        return count;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}