import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberPattern {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number");
		int inputValue = scanner.nextInt();
		
		List<int[]> numberList = new ArrayList<>();
		int decrementValue = 0;
		for(int i = 0; i< inputValue;i++) {
			int[] array = new int[inputValue];
			for (int j = 0; j < inputValue; j++) {
				array[j] = inputValue;
				decrementValue = decrementValue - 1;
			}
			numberList.add(array);
		}
		
		for(int i = 0; i < numberList.size(); i++) {
			int replaceValue = numberList.size() - i;
			int[] arr = numberList.get(i);
			Arrays.sort(arr);
			for (int j = 0; j < replaceValue; j++) {
				arr[j] = replaceValue;
			}
			reverse(arr);
			if(numberList.size() - 1 > i)
				numberList.set(i + 1, arr);
			System.out.println(Arrays.toString(arr));
		}
	}
	

	/**
	 * 
	 * @param arr
	 */
	private static void reverse(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] > arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

}
