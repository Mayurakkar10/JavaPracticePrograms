package ArrayPrograms;

public class SecondMinAndSecondMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            // Finding min and second min
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }

            // Finding max and second max
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        // Checking if secondMin and secondMax were updated
        if (secondMin == Integer.MAX_VALUE || secondMax == Integer.MIN_VALUE) {
            System.out.println("No second minimum or second maximum found.");
        } else {
            System.out.println("Second Maximum: " + secondMax);
            System.out.println("Second Minimum: " + secondMin);
        }
    }
}
