package Phase1;
class lis {
	static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] <= lis[j])
                    lis[i] = lis[j] + 1;
        
        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
	public static void main(String args[]) {
		
		int arr[] = {5,8,7,1,9};
		int n = arr.length;
		System.out.println(lis(arr, n));
	}
}
