package labs.comp3111.ust.hk;

public class Lab1Activity {
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
		}

		System.out.println(String.format("Sum of the numbers is %d", sum));
		
		int maxValue = 0, minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue)
				maxValue = arr[i];
			if(arr[i] < minValue)
				minValue = arr[i];
		}
		
		System.out.print(String.format("Min = %d;", minValue));
		System.out.println(String.format(" Max = %d", maxValue));
	}
}
