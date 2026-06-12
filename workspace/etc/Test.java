package etc;

public class Test {
    void main() {
        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;
        String answer;

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s; i++) {
            str.append(my_string.charAt(i));
        }

        for (int i = 0; i < overwrite_string.length(); i++) {
            str.append(overwrite_string.charAt(i));
        }

        for (int i = s + overwrite_string.length(); i < my_string.length(); i++) {
            str.append(my_string.charAt(i));
        }

        answer = str.toString();

        System.out.println(answer);
    }
}
