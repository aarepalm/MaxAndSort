class MaxAndSort {

	void printNumbers(int[] numbers) {
		for (int item : numbers)
			System.out.print(item + ", ");
	}

	int[] getFiveIntsFromUser() {
		int[] integers = {4, 7, 2, 122, 56};
		// mocked function, should be read with Scanner
		return integers;
	}

	int getMaxValue(int[] integers) {
		if (integers.length == 0)
			System.out.println("Cannot find max value, array empty");

		int maxValue = integers[0];
		for (int item : integers) {
			if (item > maxValue)
				maxValue = item;
		}
		return maxValue;
	}

	int[] sortNumbers(int[] numbers) {
		boolean swapWasMade = false;
		do {
			swapWasMade = false;
			for (int index = 0; index < (numbers.length - 1); ++index) {
				if (numbers[index] > numbers[index + 1]) {
					swapWasMade = true;
					int temporary = numbers[index];
					numbers[index] = numbers[index + 1];
					numbers[index + 1] = temporary;
				}
			}
		// Break the loop only if no swaps were made - this means that it is all sorted
		} while (swapWasMade);

		return numbers;
	}

	public static void main(String[] args) {
		MaxAndSort obj = new MaxAndSort();
		int numbers[] = obj.getFiveIntsFromUser();

		// 1: print out the numbers
		System.out.print("Numbers are: ");
		obj.printNumbers(numbers);

		// 2: print out the max value
		System.out.println("\n"); // Just a line feed and an empty line
		System.out.println("The maximum value is : " + obj.getMaxValue(numbers));

		// 3: print out the sorted numbers
		obj.sortNumbers(numbers);
		System.out.print("Sorted numbers are: ");
		obj.printNumbers(numbers);
		System.out.println(""); // Just a line feed
	}

}
