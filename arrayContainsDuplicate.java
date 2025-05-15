import java.util.HashSet;

public class arrayContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3 }; // give acc. to your choice
        Boolean hasDuplicate = false;
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                hasDuplicate = true;
                break;
            } else {
                set.add(num);
            }
        }

        if (hasDuplicate) {
            System.out.println("Duplicates found");
        } else {
            System.out.println("No duplicates found");
        }
    }
}
