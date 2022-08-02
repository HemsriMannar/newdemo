package DataStructure;

public class Binaryseaarch {
	public static int searchbinary(int[] arr, int start, int end, int x) {
		int mid;
		 if(start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == x)
				return mid+1;
			else if (arr[mid] > x) 
				return searchbinary(arr, start, mid - 1, x);
			 else 
				return searchbinary(arr, mid + 1, end, x);
			

		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 40;
		int res = searchbinary(arr, 0, n - 1, x);
		if(res==-1)
		System.out.println("not found");
		else {
			System.out.println("found at index "+res);
		}
	}

}
