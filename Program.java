import java.util.Random;

class Program {
    public static void main(String[] args) {
        String flag = "hackDalton{just_4_l1ttl3_j4v4_nfM-qY3Nr5}";
        StringBuilder output = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < flag.length(); i++) {
            output.appendCodePoint((char) flag.charAt(i) + (char) rand.nextInt(255));
        }
        System.out.println(output);
    }
}