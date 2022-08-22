
import java.util.Arrays;
import java.util.Scanner;

public class array_sorting {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of Array: ");
	i = sc.nextInt();
	int arr[] = new int[i];
	for (int j = 0; j < i; j++) {
	    System.out.print("Enter " + j + " th element: ");
	    arr[j] = sc.nextInt();
	}
	sc.close();
	Arrays.sort(arr);
	System.out.println("Sorted Array");
//	for (int b : arr) {
//	    System.out.print(b + " ");
//	}
	for (int j = 0; j < i; j++) {
	    System.out.print(arr[j]);
	}

    }

}
