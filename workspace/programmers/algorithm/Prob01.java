package algorithm;

import java.util.*;

public class Prob01 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> m = new HashMap<>();
        String result = "";

        for (String p: participant) {
            m.put(p, m.getOrDefault(p, 0) + 1);
        }
        for (String p: completion) {
            m.put(p, m.get(p) - 1);
        }

        for (Map.Entry<String, Integer> entry: m.entrySet()) {
            if (entry.getValue() != 0) {
                result = entry.getKey();
                break;
            }
        }
//        String result = "";
//        boolean istrue = true;
//
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for (int i = 0; i < completion.length; i++) {
//            if (!participant[i].equals(completion[i])) {
//                result = participant[i];
//                istrue = false;
//                break;
//            }
//        }
//
//        if (istrue) {
//            result = participant[(participant.length - 1)];
//        }

        return result;
    }

    void main() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = solution(participant, completion);

        System.out.println(result);
    }
}
