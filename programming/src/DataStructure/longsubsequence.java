package DataStructure;

import java.util.Scanner;

public class longsubsequence {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	    int lis[] = new int[10];
		//System.out.println("Array elements are: "); 
		for(int i=1;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((arr[i]>arr[j])&&(lis[i]<lis[j])){
					lis[i]=arr[i];
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(lis[i]);
		}
	}
	

}
