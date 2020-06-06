import java.util.Random;

class Program {
    public static void main(String[] args) {
        int[] flag = new int[] { 164, 157, 159, 167, 128, 157, 168, 176, 171, 170, 183, 166, 177, 175, 176, 155, 112,
                155, 168, 109, 176, 176, 168, 111, 155, 166, 112, 178, 112, 155, 170, 162, 137, 105, 173, 149, 111, 138,
                174, 113, 185 };
        Random rand = new Random();
        if (rand.nextInt(256) == 257) {
            for (int i = 0; i < flag.length; i++) {
                int outNum = flag[i] - 60;
                System.out.print((char) outNum);
            }
        } else {
            System.out.println("Sorry, you got unlucky, no flag for you.");
        }
    }
}