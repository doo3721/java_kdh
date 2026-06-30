package level01.day08;

public class Prob03 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < index_list.length; i++) {
            str.append(my_string.charAt(index_list[i]));
        }
        return str.toString();
    }

    void main() {
        System.out.println(solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(solution("zpiaz", new int[]{1, 2, 0, 0, 3}));
    }
}
