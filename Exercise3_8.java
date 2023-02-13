public class Exercise3_8 {
    // 형변환
    // 이항연산은 두 피연산자의 타입을 일치시킨 후 연산을 수행한다.
    // int보다 작은 타입은 int로 자동변환 한다.

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        char ch = 'A';
        ch = (char)(ch + 2);

        float f = 3 / 2f;
        long l = 3000 * 3000 * 3000L;

        float f2 = 0.1f;
        double d = 0.1;

        // double과 float의 연산은 double의 연산으로 자동형변환 된다.
        // 하지만 실수는 근사값으로 표현하여 형변환했을 때 오차가 발생할 수 있다.
        // 따라서 double값을 유효자리수가 적은 float으로 형변환해서 비교하는 것이 좋다. 
    
        boolean result = (float)d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("1="+1);
        System.out.println("result="+result);
    }
}
