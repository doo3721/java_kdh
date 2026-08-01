package level01.day24;

public class Prob01 {
    public int solution(String[] order) {
        int answer = 0;
        for(String o : order) {
            if(o.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
//        for (int i = 0; i < order.length; i++) {
//            String str = order[i].replace("hot", "").replace("ice", "");
//            answer += switch (str) {
//                case "americano" -> 4500;
//                case "cafelatte" -> 5000;
//                case "anything" -> 4500;
//                default -> 0;
//            };
//        }
        return answer;
    }

    void main() {
//        System.out.println(Arrays.toString(solution()));
        System.out.println(solution(new String[]{"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(solution(new String[]{"americanoice", "americano", "iceamericano"}));
    }
}
