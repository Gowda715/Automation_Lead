package Strings;

public class String6 {

	public static void main(String[] args) {
		// To Count the number of words in the string
		String str = " Automation Testing";
		String[] str1 = str.split(" ");
		System.out.println(str1.length);
		String6.cmain();
		String6.bmain();

	}

	public static void cmain() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void bmain() {
		int count1 = 0;
		int count2 = 0;
		String str = "JunitTesting";
		String ptr = str.toLowerCase();
		System.out.println(ptr);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// System.out.println("Vowels Presents in this String ");
				count1++;
			} else {
				// System.out.println("Vowels not present in this String");
				count2++;
			}

		}

		System.out.println(count1);
		System.out.println(count2);
	}
}