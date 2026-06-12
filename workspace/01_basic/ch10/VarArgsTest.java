package ch10;

public class VarArgsTest {

    static int count = 0;

    void start(String method) {
        System.out.println(++count + ". " + method + " 시작");
    }

    void end(String method) {
        System.out.println(++count + ". " + method + " 종료");
    }

    void sum(int n1, int n2) {
        start("sum");
        int result = n1 + n2;

        System.out.println(++count + ". " + n1 + " + " + n2 + " = " + result);
        end("sum");
    }

    void sum(int... nums) {
        start("varsum");
        int result = 0;

        System.out.print(++count + ". ");
        for (int i = 0; i < nums.length - 1; i++) {
            result += nums[i];
            System.out.print(nums[i] + " + ");
        }
        result += nums[nums.length - 1];
        System.out.println(nums[nums.length - 1] + " = " + result);
        end("varsum");
    }

    void main(String[] args) {
        start("main");
        sum(10, 20);
        sum(10, 20, 30, 40);
        end("main");
    }
}
