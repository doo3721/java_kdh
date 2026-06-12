package ch11.capsule.ex02;

public class Score {
    private int kor;
    private int eng;
    private int math;

    Score() {
        this(0, 0, 0);
    }

    Score(int kor, int eng, int math) {
        if (kor > 100 || kor < 0) {
            System.out.println("kor: 점수는 0 ~ 100 사이로 입력해야 합니다.");
            kor = 0;
        }
        if (eng > 100 || eng < 0) {
            System.out.println("eng: 점수는 0 ~ 100 사이로 입력해야 합니다.");
            eng = 0;
        }
        if (math > 100 || math < 0) {
            System.out.println("math: 점수는 0 ~ 100 사이로 입력해야 합니다.");
            math = 0;
        }
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getKor() { return this.kor; }
    int getEng() { return this.eng; }
    int getMath() { return this.math; }

    void setKor(int kor) {
        if (kor > 100 || kor < 0) {
            System.out.println("kor: 점수는 0 ~ 100 사이로 입력해야 합니다.");
            kor = 0;
        }
        this.kor = kor;
    }

    void setEng(int eng) {
        if (eng > 100 || eng < 0) {
            System.out.println("eng: 점수는 0 ~ 100 사이로 입력해야 합니다.");
            eng = 0;
        }
        this.eng = eng;
    }

    void setMath(int math) {
        if (math > 100 || math < 0) {
            System.out.println("math: 점수는 0 ~ 100 사이로 입력해야 합니다.");
            math = 0;
        }
        this.math = math;
    }

    int sum() {
        return (kor + eng + math);
    }

    double avg() {
        return (Math.round(this.sum() / 3.0 * 100) / 100.0);
    }
}
