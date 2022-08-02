package DataStructure;

public class SmallestElement {
	public static int kthSmallest(int[] arr, int n, int k) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[k-1];
		
		
	}	
	
	public static void main(String[] args) {
		int arr[] = { 10,3,8,7,9 };
		int n=arr.length;
		int k=4;
		int small = kthSmallest(arr, n, k);
		System.out.println(small);
	}



}
