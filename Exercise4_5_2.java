public class Exercise4_5_2 {
    // while문
    
    public static void main(String[] args) {
        int i=0;
        while(i<=10) {
            int j=0;
            while(j<=i) {
                System.out.println("*");
                j++;
            } 
            System.out.println();
            i++;
        }
    }
}