
public class TotalNumberOfAdd {

	public static void main(String[] args) {
		System.out.println("no. of add numbers");
		int count=0;
		for (int i = 0; i <= 100; i++) {
			if (i%2!=0) {
				count ++;
				System.out.println(count);
			}
		}
	}

}
