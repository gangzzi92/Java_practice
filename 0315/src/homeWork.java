import java.util.Random;

public class homeWork {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(6) + 1;
		System.out.println(num);
//		if (num == 1) {
//			System.out.println("멍멍");
//		} else if (num == 2) {
//			System.out.println("야옹");
//		} else if (num == 3) {
//			System.out.println(num);
//		} else if (num == 4) {
//			System.out.println(num);
//		} else if (num == 5) {
//			System.out.println(num);
//		} else if (num == 6) {
//			System.out.println(num);
//		}
		if (num == 1) {
			System.out.println("멍멍");
		} else if (num == 2) {
			System.out.println("야옹");
		} else {
			System.out.println(num);
		}
	}
}