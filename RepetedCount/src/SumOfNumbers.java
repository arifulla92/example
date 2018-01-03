import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int num, sum=0,rem=0,temp;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter numbers;");
		num=scanner.nextInt();
		scanner.close();
		temp=num;
		while (num>0) {
			rem=num % 10;
			sum=sum + rem;
			num=num / 10;
			System.out.println("sum of desits:"+temp+"its sum"+sum);
			
		}
		
	}

}
