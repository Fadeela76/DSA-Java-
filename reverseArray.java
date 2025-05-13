public class reverseArray {
    public static void main(String args[]){
        int arr[] = {1,2,3};
        System.out.print("Original array: ");
        for(int i=0 ; i<arr.length ; i++){
            if(i!=0){
                System.out.print(", ");
            }
            System.out.print(arr[i] );
        }

        int[] newArr = new int[arr.length];
        int j=arr.length-1;
        for(int i = 0 ; i<newArr.length ; i++){
           newArr[i] = arr[j];
           j--;
        }

        System.out.print("\nReversed array: ");
        for(int i=0; i<newArr.length ; i++){
             if(i!=0){
                System.out.print(", ");
            }
            System.out.print(newArr[i]);
        }
    }
}
