package Exp_3;

public class Findmissingnum {
    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 2, 4};

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {

            actualSum = actualSum + arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number = " + missing);
    }
}
