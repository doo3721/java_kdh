package level02.day23;

import java.util.HashMap;

public class Prob04 {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<>();
        for (String[] login : db) {
            map.put(login[0], login[1]);
        }
        String pw = map.get(id_pw[0]);
        if (pw == null) {
            return "fail";
        }
        if (!pw.equals(id_pw[1])) {
            return "wrong pw";
        }
        return "login";
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new String[]{"meosseugi", "1234"},
                new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"programmer01", "15789"},
                new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(solution(new String[]{"rabbit04", "98761"},
                new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }
}
