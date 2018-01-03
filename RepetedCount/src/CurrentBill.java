
public class CurrentBill {

	public static void main(String[] args) {
		int units = 100;
		int bill = 0;

		/*
		 * if (units<100) { bill=units*2; System.out.println("Bill amount:"
		 * +bill); }
		 * 
		 * if (units<200) { bill=units*4; System.out.println("Bill amount:"
		 * +bill); }
		 * 
		 * 
		 * if (units<300) { bill=units*6; System.out.println("Bill amount:"
		 * +bill); }
		 */

		if (units > 100) {
			if (units >= 200) {
				if (units > 300) {
					bill = units * 6;

				} else
					bill = units * 4;
			}

		} else
			bill = units * 2;
		System.out.println("no.of units" + units);
		System.out.println("bill amount" + bill);

	}

}
