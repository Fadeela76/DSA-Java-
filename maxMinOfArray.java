class maxMinOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if (arr.length == 0) {
            System.out.println("Empty array.");
        } else {
            System.out.println("Max: " + max + "\n" + "Min: " + min);
        }

    }
}
