public class Exercise6_6 {
    // 두 점의 거리를 계산하는 getDistance()
    // 제곱근 계산

    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }

    public static void main(String args[]) {
        System.out.println(getDistance(1,1,2,2));
    }
}
