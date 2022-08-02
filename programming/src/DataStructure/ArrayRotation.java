package DataStructure;

public class ArrayRotation {
	public static void rotate(int arr[], int d, int n)
    {
        int p = 1;
        while (p <= d) {
            int last = arr[n-1];
            for (int i = n-1; i >0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            p++;
        }
 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
     
    public static void main(String[] args)
    {
        int arr[] = { 1,3, 5, 7, 9 };
        int N = arr.length;
        
        int d = 2;
 
        
        rotate(arr, d, N);
    }
}
