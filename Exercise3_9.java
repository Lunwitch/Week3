public class Exercise3_9 {
    // 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b값이 true이 되도록 한다.

    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');

        System.out.println(b);
    }
}
