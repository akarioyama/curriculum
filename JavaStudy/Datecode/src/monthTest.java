public class monthTest {

    public static void main(String[] args) {

        for(int i = 0; i <= 12; i++) {
            if(i == 0) {
                continue;
            }
            System.out.printf("%02d", i);
        }
    }
}
