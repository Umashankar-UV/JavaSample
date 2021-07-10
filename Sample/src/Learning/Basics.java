package Learning;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Basics {

	public static void main(String args[]) {
//		String string = "AjithKumar";
//		int n = 1999999999;
//		isPrime(n);
//		reverseStringByWords(string);
//		arrayAddition();
//		sortArr();
//		randNum();
//		Calender();
		
		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.println(a + "---" + a + "-----Not a prime number");
				break;
			}
		}

		
		for (int a = 1; a <= 10; a++) {
			if (a % 2 != 0) {
				System.out.println(a+"-----Not a prime number");
			}
		}
			
	}

	
	public static void Calender() {
		Date dd = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dd);
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		String dayName = sdf.format(new Date());
		System.out.println("=============" + dayName);

	}
	
	public static void reverseStringByWords(String string) {
		String result = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.println(i);
			result = result + string.charAt(i);
		}
		System.out.println(result);
	}

	public static void reverseStringBy(String string) {
		StringBuilder dd = new StringBuilder();
		dd.append(string);
		dd.reverse();
		System.out.println(string);
	}

	public static void arrayAddition() {
		int numbers[] = new int[] { 20, 222, 2983, 99, 2, 232, 2 };
		int biggest = numbers[0];
		int smallest = numbers[0];
		Arrays.sort(numbers);

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > biggest) {
				biggest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println(biggest);
		System.out.println(smallest);
		int Sum = biggest + smallest;
		System.out.println(Sum);
	}

	public static void isPrime(int n) {
		if (n == 0 || n == 1) {
			System.out.println(n + "-----" + "--Not a prime number");
		}
		if (n == 2) {
			System.out.println(n + "-----" + "-----Prime number");
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(n + "---" + i + "-----Not a prime number");
			}
		}
		System.out.println(n + "---" + "Prime number");
	}	

	public static void sortArr() {
		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;

		// Displaying elements of original array
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void randNum() {
		Random ran = new Random();
		int randomInt = ran.nextInt(1000) + 1;
		System.out.println("randomInt======" + randomInt);
	}
}
