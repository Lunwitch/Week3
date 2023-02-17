public class Exercise4_10 {
    // int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과 출력하기   
    
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num > 0) {
            sum += num%10;
            num /= 10;
        }
        
        System.out.println("sum="+sum);
    }
}