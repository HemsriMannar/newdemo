package DataStructure;

public class Rangequeries {
	
public static void main(String[] args) {
	int arr[]= {3, 7, 2, 5, 8, 9 };
	int n=arr.length;
    System.out.println(query(arr,0, 5)); 
    System.out.println(query(arr, 3, 5)); 
    System.out.println(query(arr,2, 4));
	}

public static int query(int arr[],int num1, int num2) {
	int sum=0;
	for(int i=num1;i<=num2;i++) {
		sum+=arr[i];
	}
	return sum;
}
}

