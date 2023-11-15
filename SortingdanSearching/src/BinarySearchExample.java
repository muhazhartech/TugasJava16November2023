public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};

        displayValues(numbers);

        // Binary Search Example
        boolean isFound = binarySearch(numbers, 7);

        if (isFound) {
            System.out.println("The value is found");
        } else {
            System.out.println("The value is not found");
        }

        // Selection Sort Example
        selectionSort(numbers);

        displayValues(numbers);

        // Binary Search after sorting
        boolean isPositionFound = binarySearch(numbers, 7);

        if (isPositionFound) {
            System.out.println("The value is found at position " + getPosition(numbers, 7));
        } else {
            System.out.println("The value is not found");
        }
    }

    static void displayValues(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    static boolean binarySearch(int[] numbers, int value) {
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2; // Middle index

            if (numbers[middle] == value) {
                return true; // Target value was found
            }

            if (numbers[middle] < value) {
                low = middle + 1;
            }

            if (numbers[middle] > value) {
                high = middle - 1;
            }
        }

        return false; // The value was not found
    }

    static void selectionSort(int[] numbers) {
        // Implementation of selection sort
    }

    static int getPosition(int[] numbers, int value) {
        // Implementation to get the position/index of the value in the sorted array
        return -1; // Placeholder, you may implement this based on your sorting algorithm
    }
}
