public class Exercise4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        // charAt(int i)메서드는 문자열에서 i번째 문자를 반환한다.
        for(int i=0; i < str.length(); i++) {
            sum+=str.charAt(i) - '0';
        }

        System.out.println("sum="+sum);
    }
}
