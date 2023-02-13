public class Exercise3_7 {
    // 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하기
    // 변환공식 'C = 5/9 x (F - 32)'
    
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}