import java.util.Scanner;

public class arrayInputOutput {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < 5; i++) {
	    System.out.print("Enter " + i + " value: ");
	    a[i] = sc.nextInt();
	}
	sc.close();
	for (int b : a) {
	    System.out.print(b + " ");
	}
    }

}
