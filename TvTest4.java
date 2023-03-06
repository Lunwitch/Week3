class Tv {
    // Tv의 속성(멤버변수)
    String color;   // 색상
    boolean power;  // 전원상태(on/off)
    int channel;    // 채널

    // Tv의 기능(메서드)
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvTest4 {
    public static void main(String args[]) {
        // 길이가 3인 Tv객체 배열
        Tv[] tvArr = new Tv[3];

        // Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
        for(int i=0; i < tvArr.length;i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }

        for(int i=0; i< tvArr.length;i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }
    } 
}