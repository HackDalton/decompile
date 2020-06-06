import java.util.Arrays;

public class CharShifter {
	public static void main(String[] args) {
		String flag = "hackDalton{just_4_l1ttl3_j4v4_nfM-qY3Nr5}";
		char[] chars = flag.toCharArray();
		int[] numbers = new int[flag.length()];

		for (int i = 0; i < chars.length; i++) {
			numbers[i] = chars[i] + 60;
		}

		System.out.println(Arrays.toString(numbers));
	}
}