package week2day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quotient, reminder = 0, sum = 0;
		System.out.println("Armstrong numbers between 100 to 1000");
		for (int i = 100 ; i <= 1000 ; i++) {
			int inputNumber = i;
			for (int j=0; j<3; j++){
				reminder = inputNumber%10;
				sum = sum + (reminder*reminder*reminder);
				quotient = inputNumber/10;
				inputNumber = quotient;
			}
			if (sum==i) {
				System.out.println(i);
			}
			sum = 0;
		}
	}
}
