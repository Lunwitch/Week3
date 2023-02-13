public class Exercise3_10 {
    // 대문자를 소문자로 변경하기
    // 조건 : 문자 ch에 저장된 문자가 대문자인 경우에만 변경
    // 문자코드는 소문자가 대문자보다 32만큼 더 크다.

    // 1. 대문자로 변경하는 조건식 작성
    // 2. 덧셈 연산 형변환 (int -> char)

    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
