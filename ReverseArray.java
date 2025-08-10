public class ReverseArray {
    public static void main(String[] args) {
        
        //declaring and initializing an array
        int[] arr = {1, 2, 3, 4, 5};

        //printing original array
        System.out.print("Original array: ");
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                System.out.print(arr[i]);
            }else{
                System.out.print(", " + arr[i]);
            }
        }

        //reversing the array
        System.out.print("\nReversed array: ");
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            System.out.print(arr[i] + ", ");
        }
            
    }
}