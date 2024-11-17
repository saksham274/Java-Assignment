import java.util.Scanner;

public class MergeSortedArrays {
    
    // Method to merge two sorted arrays into a single sorted array
    public static int[] mergeArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] C = new int[n + m];  // Result array

        int i = 0, j = 0, k = 0;

        // Merge the arrays while both arrays have elements
        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // If there are remaining elements in A, add them to C
        while (i < n) {
            C[k++] = A[i++];
        }

        // If there are remaining elements in B, add them to C
        while (j < m) {
            C[k++] = B[j++];
        }

        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the size of array A
        System.out.print("Enter the size of array A: ");
        int n = scanner.nextInt();
        
        // Input: Read the elements of array A
        int[] A = new int[n];
        System.out.println("Enter " + n + " elements of array A (in ascending order):");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Input: Read the size of array B
        System.out.print("Enter the size of array B: ");
        int m = scanner.nextInt();
        
        // Input: Read the elements of array B
        int[] B = new int[m];
        System.out.println("Enter " + m + " elements of array B (in ascending order):");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        // Merge arrays A and B
        int[] C = mergeArrays(A, B);

        // Output: Display the merged array C
        System.out.println("The merged sorted array is:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}


