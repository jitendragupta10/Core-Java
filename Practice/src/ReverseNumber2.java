
public class ReverseNumber2 {

	public static void main(String[] args) {
		int num = 98765, rem, rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.print(rev);
	}

}
