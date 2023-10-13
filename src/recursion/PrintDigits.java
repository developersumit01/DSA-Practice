package recursion;

public class PrintDigits {
	public void printDigit(int num) {
		if (num == 0) {
			return;
		}
		printDigit(num / 10);
		System.out.println(num % 10);
	}

	public void printRevDigit(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num % 10);
		printRevDigit(num / 10);
	}

	public int printRevNumber(int num) {
		if (num % 10 == num) {
			return num;
		}
		int pow = (int) Math.log10(num);
		return (num % 10) * (int) Math.pow(10, pow) + printRevNumber(num / 10);
	}
}
