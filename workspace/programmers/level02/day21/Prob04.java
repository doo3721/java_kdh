package level02.day21;

public class Prob04 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i < dic.length; i++) {
            int count = 0;
            for (int k = 0; k < spell.length; k++) {
                if (dic[i].contains(spell[k])) {
                    count++;
                }
            }
            if (count == spell.length) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }
}
