public class rotatebyK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        
        rotateByK(arr, k);
        
        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateByK(int[] arr, int k) {
        int n = arr.length;         
	k = k % n;  // Ensure k is within bounds

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse remaining n-k elements
        reverse(arr, k, n - 1);
    }
}
